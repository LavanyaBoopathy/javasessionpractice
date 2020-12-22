package oopsConceptPart2;

public class InheritanceAndPolymorphism {

	public static void main(String[] args) {
		
		BMW obj= new BMW();//Compile time  polymorphism
		obj.start();
		obj.refill();
		obj.threadsafety();
		obj.stop();
		
/*method overriding -whenever same method is present in parent and  child class  with same name and same no.of parameter.
 * preference given to method in child class or overridden method.
 * 
 * polymorphism -ability to take more than one form
 * Compile time polymorphism- at a time of compilation only will decide which method to call
 */
		
		System.out.println("******");
		Car c =new Car();
		c.start();
		c.refill();
		c.stop();
		System.out.println("******");
		
		/*
		 * Run time or dynamic plymorphism -create object of child class with parent object refernce.we can access all method in parent class
		but only overridden method in child class
		run time polymorphism is calling as top-casting  		*/
		
		Car c1= new BMW();
		c1.start();
		c1.stop();
		c1.refill();
		System.out.println("******");
		
		
		/*down-casting
		BMW b1 =new Car(); -->this shows error while compliation
		BMW b1 =(BMW)new Car();--> it throws error in run time so downcasting not possible in java
		b1.start();
		b1.stop();
		b1.threadsafety();
		b1.refill();
		*/
		
		
		
		
	}
}