package com.jsp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	private int empId;
	private String empName;
	private int age;
	private double sal;
	@Id
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public double getSal() 
	{
		return sal;
	}
	public void setSal(double sal) 
	{
		this.sal = sal;
	}
	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", sal=" + sal + "]";
	}
	
	
	

}
