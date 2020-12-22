package javaprogrampractice;

public class ConstructorConcept {
	
	
	/* constructor cannot return any value 
	 * constructor name should be class name 
	 * type of constructor - default constructor (zero parameter constructor)
	 */
 
	
	public ConstructorConcept()
	{
	System.out.println("default constructor");
	}
	public ConstructorConcept(int x)
	{
	System.out.println("one parameter constructor");
	System.out.println("value of x:"+x);
			}
	public ConstructorConcept(int x,int y)
	{
	System.out.println("two parameter constructor");
	System.out.println("value of x:"+x);
	System.out.println("value of y:"+y);
			}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		ConstructorConcept c=new ConstructorConcept();
		ConstructorConcept c1=new ConstructorConcept(10);

		ConstructorConcept c2=new ConstructorConcept(10,20);

		
	}

}
