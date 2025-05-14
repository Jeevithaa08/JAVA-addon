package Day4project;
 /*public class Exception {
	public static void main(String[] args) {
		
		//try and finally
		/*try {
			int num = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Cannot divided by zero: " + e.getMessage());   
			}finally {
				System.out.println("Execution completed");
			}*/
	
public class Exception{
	static void checkAge(int age) {
		if (age < 18) {
		   throw new IllegalArgumentException("age must be 18 or older.");
					
				 }
				 System.out.println("Access granted");
			 }
	public static void main(String[] args) {
		try {
			checkAge(16);
			
		} catch (IllegalArgumentException e) {
			System.out.println("Caught Exception" +e.getMessage());
			}
		}
}

