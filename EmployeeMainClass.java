package com.nit.encapSulationProgram;

public class EmployeeMainClass 
{

	public static void main(String[] args) 
	{
		Employee E = new Employee("501","Ramesh",60000,"HR");
        System.out.println(" Emp ID      :"+E.getEmpID());
        System.out.println(" Emp Name    :"+E.getEmpName());
        System.out.println(" Emp Salary  :"+E.getSalary());
        System.out.println(" Department  :"+E.getDepartment());
        E.getDepartment();
        System.out.println(" Salary "+E.getSalary());

	}

}
class Employee
{
	private String EmpID;
	private String EmpName;
	private double Salary;
	private String Department;
	public Employee(String EmpID,String EmpName,double Salary,String Department)
	{
		this.EmpID = EmpID;
		this.EmpName = EmpName;
		setSalary(Salary);
		setDepartment(Department);
	}
	public String getEmpID() 
	{
		return EmpID;
	}
	public void setEmpID(String empID) 
	{
		EmpID = empID;
	}
	public String getEmpName() 
	{
		return EmpName;
	}
	public void setEmpName(String empName) 
	{
		EmpName = empName;
	}
	public double getSalary() 
	{
		return Salary;
	}
	public void setSalary(double salary) 
	{
	   if (salary >= 0) 
	   {
	        this.Salary = salary;
	   } 
	   else 
	   {
	        System.out.println("Salary cannot be negative. Setting salary to 0.");
	        this.Salary = 0;
	   }
	
	}

	public String getDepartment() 
	{
		return Department;
	}
	public void setDepartment(String department) 
	{
		Department = department;
	}
	
}
