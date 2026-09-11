package com.nt.encapsulation;

class Studentss
{
	   private int    rollno;
	   private String name;
	   private int    marks;
	   
	   public Studentss(int rollno,String name,int marks)
	   {
		   this.rollno = rollno;
		   this.name = name;
		   this.marks = marks;
	   }
	   public void setRollNo(int rollno)
	   {
		   this.rollno = rollno;
	   }
	   public void setName(String name)
	   {
		   this.name = name;
	   }
	   public void setMarks(int marks)
	   {
	      if(marks >= 0 && marks<=100)
	      {
	    	  this.marks = marks;
	      }
	      else 
	      {
			 System.out.println("Invalid marks");
		  }
	   }
	   public int getRollNo()
	   {
		   return rollno;
	   }
	   public String getName()
	   {
		   return name;
	   }
	   public int getMarks()
	   {
		   return marks;
	   }
}
public class Ex6
{
  public static void main(String[] args) 
  {
	Studentss s = new Studentss(101,"Raviraj",85);
	s.setRollNo(101);
	s.setName("Raviraj");
	s.setMarks(85);
	
	System.out.println("Roll No : "+s.getRollNo());
	System.out.println("Name    : "+s.getName());
	System.out.println("Marks   : "+s.getMarks());
  }  
}
