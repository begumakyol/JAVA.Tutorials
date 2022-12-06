public class IntegerDivider {
	public IntegerDivider() {}
	public int integerDivision(String x, String y) throws NumberFormatException {
		int intx;
		int inty;
		
		try {
			intx = Integer.parseInt(x);
			inty = Integer.parseInt(y);
			
			int result = intx / inty;
			
			System.out.println("Successfully performed integer division.");
			
			return result;
		}
		
		catch(ArithmeticException e) {
			//Return "infinity" in case of division by zero
			return Integer.MAX_VALUE;
		}
	}
}