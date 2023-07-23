
public class RunTime {
 public static void main(String[] args) {
	System.out.println("1st");
	funtion1();
	System.out.println("Main end");
	
	
}

private static void funtion1() {
	System.out.println("fun1");
	function2();
	System.out.println("fun1 end");
}

private static void function2() {
	System.out.println("fun2");
	try {
		function3();
	}
	catch (Exception e){
		System.out.println("Handled");
	}
	System.out.println("fun2 end");
	
}

private static void function3() {
	System.out.println("fun3");
	function4();
	System.out.println("fun3 end");
	
}

private static void function4() throws RuntimeException {
	System.out.println("fun4");
	throw new RuntimeException("e");
	
}
}
