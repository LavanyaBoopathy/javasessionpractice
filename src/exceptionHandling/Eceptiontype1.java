package exceptionHandling;

public class Eceptiontype1 {

	public static void main(String[] args) {
	
		try {
			int i=9/0;// this will thrown exception
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			
			System.out.println("********");
			System.out.println(e.getMessage());
		}
		System.out.println("abc");
		
		/*int i=9/0;
		System.out.println("test");
		*/
				
}
	

}
