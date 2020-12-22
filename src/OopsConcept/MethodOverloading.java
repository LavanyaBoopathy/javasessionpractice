package OopsConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj= new MethodOverloading();
		obj.sum();
		obj .sum(10);
		obj.sum("tom");
		obj.sum(10,20);
		
	}
	public static void main(int i) {
	
	}
	public static void main(double i) {
		
	}
	/*
1.method overloading -when method name is same with diff input parameter within the same class.
2.you cannot create a method inside the method
3.same method name with same no.of arguments(same data type) should not create which gives you error as duplicate 
method.
4.same method name with same no.of arugument but different datatypes is also method overloading
5. can we overload main method -yes 
*/

public void sum()
{
	System.out.println("sum method-->zero parameter-- ");
	System.out.println("edited bby jagan");

}
public void sum(int i)
{
	System.out.println("sum method-->one parameter="+i);
}
public void sum(int i,int j)
{
	int k=i+j;
	System.out.println("sum method-->two parameter="+k);

}
public void sum(String i)
{
	System.out.println("sum method-->one parameter="+i);
}
}