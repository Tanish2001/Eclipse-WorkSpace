package PassByValue;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1;
		System.out.println(number);
		incrementnumby(number);
		System.out.println(number);
		
	}
	
	private static void incrementnumby(int number) {
		number+=10;
	}


}
