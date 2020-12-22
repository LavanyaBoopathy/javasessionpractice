package oopsConceptPart2;

public interface UKBank {

	int min_bal=100;
	
	public void credit();
	public void debit();
	public void transfermoney();
}

/*
interface
1.only method declaration
2.we can declare the variables ,by default there are static in nature
3.variable value will not changed
4.No static method in interface
5. No main method in interface
6.interface are abstract in nature that means we cannot create object of interface
7. methods in interface should define in implemented class

*/