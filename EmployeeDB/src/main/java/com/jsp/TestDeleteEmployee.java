package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteEmployee
{
	public static void main(String[] args) 
	{

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();

		Employee employee=entityManager.find(Employee.class, 105);
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();

	}

}
