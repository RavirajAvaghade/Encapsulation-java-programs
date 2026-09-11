package com.nt.encapsulation;

class Mobile
{
  private Integer id;
  private String  model;
  private double  price;
  public Mobile(Integer id,String model,double price)
  {
	  this.id = id;
	  this.model = model;
	  this.price = price;
  }
  public void setID(Integer id)
  {
	  this.id = id;
  }
  public void setModel(String model)
  {
	  this.model = model;
  }
  public void setPrice(double price)
  {
	  this.price = price;
  }
  public Integer getID()
  {
	  return id;
  }
  public String getModel()
  {
	  return model;
  }
  public double getPrice()
  {
	  return price;
  }
}
public class Ex7 
{	
  public static void main(String[] args) 
  {
	Mobile m = new Mobile(101,"Apple",123000.0);
	System.out.println("ID    : "+m.getID());
	System.out.println("Model : "+m.getModel());
	System.out.println("Price : "+m.getPrice());
  }	
}
