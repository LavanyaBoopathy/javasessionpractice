package OopsConcept;

public class CallByValueAndCallByReference {
int  i=30;
int j=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByValueAndCallByReference obj =new CallByValueAndCallByReference();
		obj.testmethod(10, 20);
		int a=10;
		int b=20;
		obj.testmethod(a,b);//passing copy of a and b is called call by value or pass by value
		
	/* we can assign value for global variable using object name .variable name = value*/	
		//call by reference 
		obj.swap(obj);
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		
	}
public int  testmethod(int x,int y)
{
	int  c=x+y;
	return c;
}

public void swap(CallByValueAndCallByReference t)
{
	int temp=0;
	temp= t.i;
	t.i= t.j;
	t.j= temp;
		
}
}
