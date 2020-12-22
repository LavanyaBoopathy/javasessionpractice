package oopsConceptPart2;

public class HsbcBank implements UKBank,BrazilBank //multiple inheritance and also called as  is-a relationship
{
	
	//UKBank method overriding
	public void credit()
	{
		System.out.println("HSBC--credit");
	}

	public void debit()
	{
		System.out.println("HSBC--debit");
	}
	
	public void transfermoney()
	{
	System.out.println("HSBC--tranfermoney");
	}
	
	
	//hsbc bank methods
	public void carloan()
	{
		System.out.println("HSBC--car loan");
	}
	
	public void edu_loan()
	{
		System.out.println("HSBC--Education loan");
	}
	
	//bazilbank method overriding
	public void mutualfund()
	{
		System.out.println("HSBC -BRAZIL bank mutual fund");
	}
}
