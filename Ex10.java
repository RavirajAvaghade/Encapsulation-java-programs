package com.nt.encapsulation;

class Mob
{
	private String number;
	private double balance;
	
	public Mob(String number,double balance)
	{
		this.number = number;
		this.balance = balance;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public String getNumber()
	{
		return number;
	}
	public double getBalance()
	{
		return balance;
	}
}
public class Ex10 
{
  public static void main(String[] args) 
  {
	  Mob mobile =new Mob("12344",33333.0);
	  System.out.println("Number  : " +mobile.getNumber());
	  System.out.println("Balance : " +mobile.getBalance());
	  
  }
}
