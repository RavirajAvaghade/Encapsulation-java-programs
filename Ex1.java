package com.nt.encapsulation;

class Student
{
  private Integer id;
  private String  name;
  private Integer age;
  
  public void setID(Integer id)
  {
	  this.id = id;
  }
  public void setName(String name)
  {
	  this.name = name;
  }
  public void setAge(Integer age)
  {
	  this.age = age;
  }
  public Integer getId()
  {
	  return id;
  }
  public String getName()
  {
	  return name;
  }
  public Integer getAge()
  {
	  return age;
  }
  
}
public class Ex1 
{
   public static void main(String[] args) 
   {
	   Student s = new Student();
	   s.setID(101);
	   s.setName("Raviraj");
	   s.setAge(21);
	   
	   System.out.println("ID   : "+s.getId());
	   System.out.println("Name : "+s.getName());
	   System.out.println("Age  : "+s.getAge());
   }
}
