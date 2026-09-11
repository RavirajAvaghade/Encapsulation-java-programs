package com.nt.encapsulation;

class Car
{
	private String brand;
	private int    speed;
	public Car(String brand,int speed)
	{
		this.brand = brand;
		this.speed = 0;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public String getBrand()
	{
		return brand;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void Accelerate(int value)
	{
		if(value > 0)
		{
			speed = speed+value;
		}
		else 
		{
			System.out.println("Invalid value");
		}
	}
	public void Break(int value)
	{
		if(value>0 && value<=speed)
		{
			speed = speed - value;
		}
		else 
		{
		   System.out.println("Invalid break value");	
		}
	}
}
public class Ex9 
{
   public static void main(String[] args) 
   {
	 Car c = new Car("BMW",200);
	 System.out.println("Brand : "+c.getBrand());
	 System.out.println("Speed : "+c.getSpeed());
	 
	 c.Accelerate(50);
	 
	 System.out.println("After acceleration : "+c.getSpeed());
	 
	 c.Break(20);
	 
	 System.out.println("After break : "+c.getSpeed());
   }
}
