package javaprogrampractice;

public class GlobalAndLocalVariable {
	
	//global variable or class variable
	int age=26;
	String name ="tom";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;//local variable and will use within main method only 
		System.out.println(i);
		
		GlobalAndLocalVariable obj =new GlobalAndLocalVariable();
		//once  objected is created ,all global variable are  copied to object
		
		System.out.println(obj.name);
		System.out.println( obj.age);	

		obj.test();

	}
	public void test()
	{
		int  i=15; //local variable and  will use within test method only
		int j=20;
		int age= 25;
		
		System.out.println(i);
		System.out.println(j);
		
		
	}

}
