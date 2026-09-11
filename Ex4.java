package com.nt.encapsulation;

class Product
{
	private Integer id;
	private String  name;
	private double  price;
	
	public void setId(Integer id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public Integer getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	
}
public class Ex4 
{
    public static void main(String[] args) 
    {
		Product p = new Product();
		p.setId(101);
		p.setName("Laptop");
		p.setPrice(62000);
		
		System.out.println("ID    :"+p.getId());
		System.out.println("Name  :"+p.getName());
		System.out.println("Price :"+p.getPrice());
	}
}
