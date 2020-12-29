package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		
		System.out.println("ABC");
		try {
			throw new Exception("lavanya exception");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		//throw new Exception("new exception");
		
		System.out.println("PQR");
		
		String Excel_value="NO";
		if(Excel_value=="NO") {
		try{
		throw new Exception("Excel flag No exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
		System.out.println("complleted");
	}

}
							