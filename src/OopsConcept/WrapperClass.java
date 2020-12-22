package OopsConcept;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="100";
		System.out.println(x+100);
		
		//Data conversion from string to integer
		//Integer is a wrapper class
		//no wrapper class for character
		
		//String to int conversion
		int i=Integer.parseInt(x);
		System.out.println(i+100);
		
		
		//Stirng to double conversion
		String  y="12.33";
		System.out.println(y+20);
		double d=Double.parseDouble(y);
		System.out.println(d+33.4);
		
		//String  to boolean conversion
		
		String s="true";
		boolean f=Boolean.parseBoolean(s);
		System.out.println(s);
		System.out.println(f);
		
		//int to string conversion
		int j=20;
		System.out.println(j+20);
		String  e = String.valueOf(j);
		System.out.println(e+30);
		
		//For not pure integer
		String u="100a";
		int k=Integer.parseInt(u);// it throws number format exception
		
		

	}

}
