package com.nt.encapsulation;

class AtmAccount
{
	private Integer accountnumber;
	private String  name;
	private double  balance;
	
	public void setAccountNumber(Integer accountnumber)
	{
		this.accountnumber = accountnumber;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public Integer getaccountnumber()
	{
		return accountnumber;
	}
	public String getName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}
}
public class Ex5 
{
   public static void main(String[] args) 
   {
 	  AtmAccount atm = new AtmAccount();
 	  atm.setAccountNumber(101);
 	  atm.setName("Ravi");
 	  atm.setBalance(10000.0);
 	  
 	  System.out.println("Account Number : " +atm.getaccountnumber());
 	  System.out.println("Name           : " +atm.getName());
 	  System.out.println("Balance        : " +atm.getBalance());
   }
}
