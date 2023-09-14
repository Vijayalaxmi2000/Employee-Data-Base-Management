package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class GetAllData 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();


		Query query=entityManager.createQuery("select v from Employee v");
		List<Employee> employees=query.getResultList();
		for(Employee employee:employees)
		{
			System.out.println("Employee Id:"+employee.getEmpId());
			System.out.println("Employee Name:"+employee.getEmpName());
			System.out.println("Employee Age:"+employee.getAge());
			System.out.println("Employee Salary:"+employee.getSal());
			System.out.println("***********************");

		}


	}


}
