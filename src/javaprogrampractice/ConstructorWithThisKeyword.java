package javaprogrampractice;

public class ConstructorWithThisKeyword {

	int age;
	String name;
	public ConstructorWithThisKeyword(String name,int age)
	{//diff name dont use this keyword
	//	name=x;
		//age=y;
		
		//this.golabl variable =local variable;
		
		this.name= name;
		this.age=age;
		
		
		//initialize without this keyword
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorWithThisKeyword obj =new ConstructorWithThisKeyword("tom",25);
		
		
	}

}
