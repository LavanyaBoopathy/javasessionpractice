package OopsConcept;

public class StaticAndNonStatic {

	String name="tom";//non static global variable
	static int age=25;// static global variable
	
	
	public static void main(String[] args) {
		
		//how  to  call static variable and method
		//1.direct calling
		sum();
		System.out.println(age);
		//2.calling by class name
		StaticAndNonStatic.sum();
		System.out.println(StaticAndNonStatic.age);
		
		//how to call Non-static variable and method
		StaticAndNonStatic obj=new StaticAndNonStatic();
		obj.sendmail();
		System.out.println(obj.name);
		
		
		//can access static method using object reference - yes but it gives one warning 
		//obj.sum();
		
		

	}
	public void sendmail()//non static method
	{
		System.out.println("send mail method");
	}
public static void sum()//static method
{
	System.out.println("sum method");
}
}
