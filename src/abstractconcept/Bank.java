package abstractconcept;

public class Bank  {

	public static void main(String[] args) {
		
		HDFC t =new HDFC();
		t.credit();
		t.debit();
		t.loan();
		t.refill();
	
		// TODO Auto-generated method stub
		
		
		AbstractClass ac= new HDFC();
		ac.credit();
		ac.debit();
		ac.loan();
		
		
	}

}
