package exceptions_programs;

public class Test8 {
	public static void main(String[] args) {
		
		try {
			System.out.println("hiii");
			
		}catch(ArithmeticException e) {
			//AE is unchecked so we can use catch block
		}
		
		/*try {
			System.out.println("hello");
			
		} catch (java.io.IOException e) {
		//this is full checked exception so we can't write IOException because there is no chance of getting IOException 
			
		}*/
		
		
		}

}
