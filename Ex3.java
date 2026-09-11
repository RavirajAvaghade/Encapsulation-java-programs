package com.nt.encapsulation;

class pepole
{
  private Integer id;
  private String  name;
  private String  address;
  private int     salary;
  
  public pepole(Integer id,String name,String address,int salary)
  {
	  this.id = id;
	  this.name = name;
	  this.address = address;
	  this.salary = salary;
  }
  public void setID(Integer id)
  {
	  this.id = id;
  }
  public void setName(String name)
  {
	  this.name = name;
  }
  public void setAddress(String address)
  {
	  this.address = address;
  }
  public void setSalary(int salary)
  {
	  this.salary = salary;
  }
  public Integer getId()
  {
	  return id;
  }
  public String getName()
  {
	  return name;
  }
  public String getAddress()
  {
	  return address;
  }
  public int getSalary()
  {
	  return salary;
  }
}
public class Ex3 
{
  public static void main(String[]args)
  {
	  pepole p = new pepole(101,"Raviraj","Solapur",120000);
	  p.setID(101);
	  p.setName("Raviraj");
	  p.setAddress("Solapur");
	  p.setSalary(120000);
	  
	  System.out.println("ID       : "+p.getId());
	  System.out.println("Name     : "+p.getName());
	  System.out.println("Address  : "+p.getAddress());
	  System.out.println("salary   : "+p.getSalary());
  }
}
