package javaprogrampractice;

public class StaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int i[] =new int[4];
	i[0]=10;
	i[1]=20;
	i[2]=30;
	i[3]=40;
	System.out.println("int array");
	for(int j=0;j<i.length;j++) {
	
	System.out.println(i[j]);
	}
	
	
	double d[]= new double[3];
	d[0]=13.54;
	d[1]=56.0;
	d[2]=57.99;
	System.out.println("double array");
	for (int k=0;k<d.length;k++) {
		;
		System.out.println(d[k]);
	}
	
	char c[]=new char[2];
	c[0]='s';
	c[1]='c';
	System.out.println("char array");
	for (int k=0;k<c.length;k++) {
		
		System.out.println(c[k]);
	}
	
	boolean b[]=new boolean[2];
	b[0]=true;
	b[1]=false;
	System.out.println("boolean array");
	for (int k=0;k<b.length;k++) {
		
		System.out.println(b[k]);
	}
	
	
	String s[]=new String[2];
	s[0]="hi";
	s[1]="hello";
	System.out.println("string array");
	for (int k=0;k<s.length;k++) {
		
		System.out.println(s[k]);
	}
	
	
	
	/*adv of array
	store multiple values of same datatype
	
disadv of array
1.size is fixed- static array---To overcome of this problem  we use collection like 
hashtable,arraylist(dynamic array)
2.similar datatype values --- To overcome of this problem  we use object array
*/
	
	
	//Object array(Object is a super class)
	//Object array is used to store diff datatype values 
	Object ob[]=new Object[5];
	ob[0]="Tom";
	ob[1]=2;
	ob[2]=12.55;
	ob[3]=1021990;
	ob[4]='M';
	System.out.println("Object array");
	for (int k=0;k<ob.length;k++) {
		
		System.out.println(ob[k]);
	}
	}

}
