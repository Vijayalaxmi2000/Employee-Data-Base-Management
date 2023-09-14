package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetDataById {

	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Employee employee =entityManager.find(Employee.class, 104);
		System.out.println("Employee Id:"+employee.getEmpId());
		System.out.println("Employee Name:"+employee.getEmpName());
		System.out.println("Employee Age:"+employee.getAge());
		System.out.println("Employee Salary:"+employee.getSal());
	}

}
