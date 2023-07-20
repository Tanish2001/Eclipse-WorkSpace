package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Bus;
import com.aurionpro.model.Car;
import com.aurionpro.model.IMovable;
import com.aurionpro.model.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMovable[] movables= {
				new Car("ABC398439", LocalDate.of(2000, 9, 12)),
				new Bike("sdfw38", LocalDate.of(2000, 9, 12)),
				new Bus("adfakl3949", LocalDate.of(2000, 9, 12))
		};
		
		for (IMovable x : movables) {
			startmoving(x);
			System.out.println();
		}
	}

	private static void startmoving(IMovable x) {
		// TODO Auto-generated method stub
		x.move();
		System.out.println(x);
		Vehicle v = (Vehicle)x;
		v.ShowTopSpeed();
		
	}

}
