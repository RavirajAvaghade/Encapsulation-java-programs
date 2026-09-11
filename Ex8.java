package com.nt.encapsulation;

class Employee
{
  private Integer id;
  private String  name;
  private String  address;
  private double  salary;
  public Employee(Integer id,String name,String address,double salary)
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
  public void setSalary(double salary)
  {
	  this.salary = salary;
  }
  public Integer getID()
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
  public double getSalary()
  {
	  return salary;
  }
}
public class Ex8 
{
   public static void main(String[] args) 
   {
	  Employee emp = new Employee(101,"Raviraj","Solapur",120000);
	  System.out.println("ID      : "+emp.getID());
	  System.out.println("Name    : "+emp.getName());
	  System.out.println("Address : "+emp.getAddress());
	  System.out.println("salary  : "+emp.getSalary());
   }
}
