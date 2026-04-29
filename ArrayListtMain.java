package com.nit.encapSulationProgram;

import java.util.ArrayList;

public class ArrayListtMain 
{
  public static void main(String[]args)
  {
	  Student S1 = new Student("1234","ramesh");
	  S1.addGrade(67);
	  S1.addGrade(87);
	  S1.addGrade(83);
	  S1.addGrade(99);
	  S1.addGrade(101);
	  System.out.println("All grades: " + S1.getGrades());
	  
  }

}
class Student
{
	private String StudentID;
	private String StudentName;
	private ArrayList<Double> grades;
	public Student(String StudentID,String StudentName)
	{
		this.StudentID = StudentID;
		this.StudentName = StudentName;
		this.grades = new ArrayList<>();
	}
	public String getStudentID() 
	{
		return StudentID;
	}
	public void setStudentID(String studentID) 
	{
		StudentID = studentID;
	}
	public String getStudentName() 
	{
		return StudentName;
	}
	public void setStudentName(String studentName) 
	{
		StudentName = studentName;
	}
	public ArrayList<Double> getGrades() 
	{
		return grades;
	}
	public void setGrades(ArrayList<Double> grades) 
	{
		this.grades = grades;
	}
	public void addGrade(double grade) 
	{
      if (grade >= 0 && grade <= 100) 
      {
            grades.add(grade);
            System.out.println("Grade " + grade + " added successfully.");
       } 
      else 
      {
            System.out.println("Invalid grade: " + grade + ". Must be between 0 and 100.");
        
      }
    }
	   public double calculateAverage() {
	        if (grades.isEmpty()) {
	            System.out.println("No grades available to calculate average.");
	            return 0.0;
	        }

	        double sum = 0;
	        for (double grade : grades) {
	            sum += grade;
	        }
	        return sum / grades.size();
	    }
	}


