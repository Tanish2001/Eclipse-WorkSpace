package com.aurionpro.test;

import com.aurionpro.model.Time;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time[] time = {
				new Time(16,32,47),
				new Time(10,16,40)
		};
		
		System.out.println(updatetime(time));
	}

	private static Time updatetime(Time[] time) {
		// TODO Auto-generated method stub
		int updatemin = 0;
		int updatehour = 0;
		int overflowupdatemin = 0;
		int overflowupdatehour=0;
		int updatesec = time[0].getSeconds()+time[1].getSeconds();
		if(updatesec>60) {
			updatesec-=60;
			overflowupdatemin = 1;
		}
		updatemin = time[0].getMinutes()+time[1].getMinutes();
		if(updatemin>60) {
			updatemin-=60;
			overflowupdatehour=1;
		}
		updatemin += overflowupdatemin ;

		updatehour = time[0].getHours()+time[1].getHours();
		if(updatehour>24) {
			updatehour-=24;
//			updateday=1;
		}
		updatehour += overflowupdatehour;

		Time update=new  Time(updatehour,updatemin,updatesec);
		return update;
	}

}
