package exceptionHandling;

public class HowToUseThrows {

	public static void main(String[] args)//throws ArithmeticException //caught the exception and throws to jvm
	{
		
		HowToUseThrows obj=new HowToUseThrows();
		obj.sum();
		System.out.println("test");//throws keyword quit the execution once exception raised
//Hi
//hellos

	}
	public void sum()//throws ArithmeticException
	{
		try {
		div();//catch the exception from div method and pass to min method
	}catch(ArithmeticException e)
		{
		}
		}
public void div() throws ArithmeticException
{
	int i=9/0;//exception generation line and it throws to sum
	
}


}

