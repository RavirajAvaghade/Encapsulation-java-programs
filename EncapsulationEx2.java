package com.nit.encapSulationProgram;
class Laptop
{
	public String model;
	public String year;
	public String color;
	public int price;
	public int Ram;
	public Laptop(String model,String year,String color,int price,int Ram)
	{
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.Ram = Ram;
	}
	public String getmodel()
	{
		 return model;
	}
	public void setmodel(String model)
	{
		this.model = model;
	}
	public String getyear()
	{
		return year;
	}
	public void setyear(String year)
	{
		this.year = year;
	}
	public String getcolor()
	{
		return color;
	}
	public void setcolor(String color)
	{
		this.color = color;
	}
	public int getprice()
	{
		return price;
	}
	public void setprice(int price)
	{
		this.price = price;
	}
	public int getRam()
	{
		return Ram;
	}
	public void setRam(int Ram)
	{
		this.Ram = Ram;
	}
	public void info()
	{
		System.out.println("========================");
		System.out.println("Model  : "+model);
		System.out.println("Year   :"+year);
		System.out.println("color  : "+color);
		System.out.println("Price  :"+price);
		System.out.println("Ram    : "+Ram);
		System.out.println("========================");


	}
}

public class EncapsulationEx2
{

	public static void main(String[] args) 
	{
        Laptop L = new Laptop("hp","2025","black",65000,512);
        System.out.println(L.getmodel());
        System.out.println(L.getyear());
        System.out.println(L.getcolor());
        System.out.println(L.getprice());
        System.out.println(L.getRam());
        L.info();
        
	}

}
