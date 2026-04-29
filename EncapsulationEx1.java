package com.nit.encapSulationProgram;

public class EncapsulationEx1 
{

	public static void main(String[] args) 
	{
       mobile m = new mobile("Apple","i phone","2024",512,"red",5000);
       System.out.println(m.getmodel());
       System.out.println(m.getname());
       System.out.println(m.getmanufactureyear());
       System.out.println(m.getRamsize());
       System.out.println(m.getColor());
       System.out.println(m.getBattary());
       m.info();
       
	}
}

class mobile
{
	public String model;
	public String name;
	public String manufactureyear;
	public int Ramsize;
	public String Color;
	public int Battary;
	public mobile(String model,String name,String manufactureyear,int Ramsize,String color,int Battary)
	{
		this.model = model;
		this.name = name;
		this.manufactureyear = manufactureyear;
		this.Ramsize = Ramsize;
		this.Color = Color;
		this.Battary = Battary;
		
	}
	public  String getmodel() 
	{
		return model;
	}
	public void setmodel(String model)
	{
	      this.model= model;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public String getmanufactureyear()
	{
		return manufactureyear;
	}
	public void setmanufactureyear(int manufactureyear)
	{
		manufactureyear = manufactureyear;
	}
	public void setRamsize(int Ramsize)
	{
		this.Ramsize = Ramsize;
	}
	public int getRamsize()
	{
		return Ramsize;
	}
	public String setColor(String Color)
	{
		return Color;
	}
	public String getColor()
	{
		return Color;
	}
	public int setBattary(int Battary)
	{
		return Battary;
	}
	public int getBattary()
	{
		return Battary;
	}
	public void info()
	{
		System.out.println("==================================");
		System.out.println(" Model           : "+model);
		System.out.println(" Name            : "+name);
		System.out.println("Manufacture year :"+manufactureyear);
		System.out.println(" Ram Size        :"+Ramsize);
		System.out.println("Color            : "+Color);
		System.out.println(" Battary         : "+Battary);
		System.out.println("==================================");

	}
}
