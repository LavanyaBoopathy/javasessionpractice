package javaprogrampractice;

public class SingletonConcept {
	
	//singleton-at a time only one instance is created
	
	
	/*
	 * In oop ,a singleton is a class that have only one object or instance of the class at a time
	 how to design  singleton class
	 * make  sure constructor as private
	 * write a static method that has return object of singleton class
	 * they also called as lazy initialization
	 */
	
	
	private static SingletonConcept var=null;
	public String str;
	
	private SingletonConcept()
	{
		str="hey, i am using singleton class pattern";
	}

	
	public static SingletonConcept getinstance()
	{
		if(var==null)
		{
			var=new SingletonConcept();
		}
			return var;
		
	}
	public static void main(String[] args) {
		
		SingletonConcept x=SingletonConcept.getinstance();
		SingletonConcept y=SingletonConcept.getinstance();

		SingletonConcept z=SingletonConcept.getinstance();

		x.str=(x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str=(z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		
		
		
		
		
		

	}

}
