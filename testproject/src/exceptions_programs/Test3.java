package exceptions_programs;


//example for try-catch-finally 
public class Test3 {
	public static void main(String[] args) {
		
	
		try {
			System.out.println(10/0);
			
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println(10/2);
			
				}
		finally{
				System.out.println("finally block");
		}
		
	}

	
}
