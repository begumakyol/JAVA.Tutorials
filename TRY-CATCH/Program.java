public class Program {
	public static void main(String[] args){
		int a = 5, b = 0;
		// Try-catch block to check and handle exceptions
		try{
		// Attempting to divide by zero
			int c = a / b;
		}
		catch(ArithmeticException e) {
		// Displaying line number where exception occured
		// using printStackTrace() method
			e.printStackTrace();
		}
	}
}