package OopsConcept;

public class FunctioninJava {

	public static void main(String[] args) {
		
		FunctioninJava g= new FunctioninJava();
		g.test();
        int c1=	g.test2();

		System.out.println(c1);
		String s1=g.test3();
		System.out.println(s1);
		double z1=g.test4(10, 2);
		System.out.println(z1);
	}
		//Non-static methods
		
/*		Method/function -->we can create n no.of func
		1.no input no ouput
		2.no input but some output
		3.some input and get some output
		
		
all non static methods copy are given to object reference when new object is created for a class
g is  object reference  and once objected created test, test 1,test2,test3,test4 are copied to g 	
		*/
public void test()//1.no input no ouput
{
	System.out.println("test method");
}

public int test2() //2.no input but some output
{
	int a=10;
	int b=20;
	int c=a+b;
	return c;
}

public String test3() // 2.no input but getsome output
{
	System.out.println("test 3 method");
	String s ="selenium";
	return s;
}

public int test4(int x,int y)//3.some input and get some output. x,y are arguments
{
System.out.println("test 4 method");	

int z =x*y;
return z;
}
}


