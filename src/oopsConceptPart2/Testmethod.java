package oopsConceptPart2;

public class Testmethod {

	public static void main(String[] args) {
		
		
		
		//variable in interface by default are static so we can access by  classname.variable 
		//variable are final in nature so cannot changed. eg:UKBank.min_bal=300;
		
		System.out.println(UKBank.min_bal);
		
		
		
		//it is mandatory to define  all interface methods
		HsbcBank h=new HsbcBank();//compile time polymorphism
		h.carloan();
		h.credit();
		h.debit();
		h.edu_loan();
		h.transfermoney();
		h.mutualfund();
		

		System.out.println("*****");//runtime polymorphism
		UKBank u =new HsbcBank();
		u.credit();
		u.debit();
		u.transfermoney();
	
	}

}
