package OopsConcept;

public class Car {
	
	
	int Mod;
	int wheel;
	

	public static void main(String[] args) {
		Car a=new Car();
		
		/*new car()-->this s object(new object created in java) and "a" is referring the object. 
		So "a" is object reference variable
		
		mod,wheel  copy given  to each object */
		
		Car b= new Car();
		Car c= new Car();
		
		a.Mod=2020;
		a.wheel=8;
		
		b.Mod=2021;
		b.wheel =4;
		
		c.Mod =2022;
		c.wheel=5;
		System.out.println("before changing reference");
		
		System.out.println(a.Mod);
		System.out.println(a.wheel);
		
		
		System.out.println(b.Mod);
		System.out.println(b.wheel);
		
		System.out.println(c.Mod);
		System.out.println(c.wheel);
		
		
		
		//after changing reference
	System.out.println("after changing reference");
		a=b;
	b=c;
	c=a;
	

	
	System.out.println(a.Mod);
	System.out.println(a.wheel);
	
	
	System.out.println(b.Mod);
	System.out.println(b.wheel);
	
	System.out.println(c.Mod);
	System.out.println(c.wheel);
	
	a.Mod=10;
	System.out.println("after changing mod value using a reference");
	System.out.println(a.Mod);
	System.out.println(b.Mod);
	System.out.println(c.Mod);
	
	c.Mod=20;
	System.out.println("after changing mod value using  breference");
	System.out.println(a.Mod);
	System.out.println(b.Mod);
	System.out.println(c.Mod);
		

	}

}
