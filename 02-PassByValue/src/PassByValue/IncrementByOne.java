package PassByValue;

public class IncrementByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,20,30,40};
		System.out.println("Before calling function");
		for(int x : numbers)
		{
			System.out.print(x+" ");
		}
		
		IncrementByOne(numbers);
		System.out.println("\n"+"After calling function");
		for(int x : numbers)
		{
			System.out.print(x+" ");
		}
		
	}
	
	private static void IncrementByOne(int[] numbers) {
		for(int i=0 ; i<numbers.length;i++) {
			numbers[i]+=1;

		}
	}

}
