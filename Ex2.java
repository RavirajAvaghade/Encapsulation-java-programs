package com.nt.encapsulation;

class Bank
{
	private String accountnumber;
	private String name;
	private Double balance;
	
	public Bank(String accountnumber,String name,Double balance)
	{
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
	}
	public void setAccountNumber(String accountnumber)
	{
		this.accountnumber = accountnumber;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBalance(Double balance)
	{
		this.balance = balance;
	}
	public String getAccountnumber()
	{
		return accountnumber;
	}
	public String getName()
	{
		return name;
	}
	public Double getBalance()
	{
		return balance;
	}
	
	
}
public class Ex2 
{
   public static void main(String[]args)
   {
	   Bank b = new Bank("101","Raviraj", 20000.0);
	   b.setAccountNumber("101");
	   b.setName("Raviraj");
	   b.setBalance(20000.0);
	   
	   System.out.println("Account Number : "+b.getAccountnumber());
	   System.out.println("Name           : "+b.getName());
	   System.out.println("Balance        : "+b.getBalance());
   }
}
