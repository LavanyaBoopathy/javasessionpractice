package mainMethodOverload;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("main method 1");
		main("string");
		main(10);
		main('c');
	}

	public static void main(String args) {
		System.out.println("main method2");
	}

	public static void main(int a) {
		System.out.println("main method3");
	}

	public static void main(char s) {
		System.out.println("main method4");
	}

}
