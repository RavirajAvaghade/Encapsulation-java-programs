package com.nit.encapSulationProgram;

public class PersonMainClass 
{

	public static void main(String[] args) 
	{
		Pepole P1 = new Pepole("Ravi",21,"solapur");
		System.out.println(" Name :"+P1.getName());
		System.out.println(" Age :"+P1.getAge());
		System.out.println(" Address : "+P1.getAddress());

	}

}
class Pepole
{
	private String Name;
	private int age;
	private String Address;
	public Pepole(String Name,int age,String Address)
	{
		this.Name = Name;
		this.age = age;
		this.Address = Address;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getAddress() 
	{
		return Address;
	}
	public void setAddress(String address) 
	{
		Address = address;
	}
}
