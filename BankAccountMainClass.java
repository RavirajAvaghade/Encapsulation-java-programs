package com.nit.encapSulationProgram;

public class BankAccountMainClass 
{

	public static void main(String[] args) 
	{
		BankAccount B1 = new BankAccount("1234",10000);
		B1.Deposite(500000);
		B1.Withdraw(0);
		B1.Display();
		B1.getBalance();
		

	}

}
class BankAccount
{
	private String AccNum;
	private double Balance;
	public BankAccount(String AccNum,double Balance)
	{
		this.AccNum = AccNum;
		this.Balance = Balance;
	}
	 public void setAccountNumber(String accountNumber) 
	 {
	        this.AccNum = accountNumber;
	 }
	 public double getBalance()
	 {
		 return Balance;
	 }
	 public void Deposite(double amount)
	 {
		 if (amount > 0) 
		 {
	          Balance += amount;
	           System.out.println("Successfully deposited: $" + amount);
	     } 
		 else 
		 {
	            System.out.println("Deposit amount must be positive.");
	     }
	 }
	 public void Withdraw(double amount)
	 {
		 if(amount <= 0)
		 {
			 System.out.println("Withdraw Amount Must Be Positive");
		 }
		 else if(amount > Balance)
		 {
			 System.out.println("insufficent funds.Current Balance is :"+Balance);
		 }
		 else
		 {
			 Balance =- amount;
			 System.out.println("Succesfully Withdraw "+amount);
			 
		 }
	 }
	 public void Display()
	 {
		 
		 System.out.println(" Account Number "+AccNum);
		 System.out.println(" Balance :"+Balance);
	 }
}