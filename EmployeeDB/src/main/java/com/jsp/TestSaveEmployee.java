package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveEmployee
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Employee employee= new Employee();
		employee.setEmpId(101);
		employee.setAge(25);
		employee.setEmpName("Scott");
		employee.setSal(30000.0);
		
		Employee employee2= new Employee();
		employee2.setEmpId(102);
		employee2.setAge(25);
		employee2.setEmpName("Smith");
		employee2.setSal(32000.0);
		
		Employee employee3= new Employee();
		employee3.setEmpId(103);
		employee3.setAge(25);
		employee3.setEmpName("Allen");
		employee3.setSal(35000.0);
		
		Employee employee4= new Employee();
		employee4.setEmpId(104);
		employee4.setAge(25);
		employee4.setEmpName("King");
		employee4.setSal(40000.0);
		
		Employee employee5= new Employee();
		employee5.setEmpId(105);
		employee5.setAge(25);
		employee5.setEmpName("Michel");
		employee5.setSal(42000.0);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		entityManager.persist(employee4);
		entityManager.persist(employee5);
		entityTransaction.commit();
		
	}

}
