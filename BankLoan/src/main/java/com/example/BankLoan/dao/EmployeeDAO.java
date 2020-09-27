package com.example.BankLoan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.BankLoan.entity.Employee;

@Repository
public class EmployeeDAO implements EmployeeDAOInterface{
			
	@Autowired
	private EntityManagerFactory emf;
	
	@Override
	public List<Employee> getEmployeeInfo() {
		
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query q=em.createQuery("from com.example.BankLoan.entity.Employee e");		
		return q.getResultList();
	}	

	@Override
	public void updateEmployeeInfo(Employee empl) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(empl);
		et.commit();
	}

	@Override
	public void deleteEmployeeInfo(Employee employee) {

		EntityManager em=emf.createEntityManager();
		  Employee employee1 = em.find(Employee.class, employee.getId());
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		System.out.println(employee.getId());
		em.remove(employee1);
		et.commit();
	}

	@Override
	public void addEmployeeInfo(Employee emp) {
		System.out.println("hi"+emp.getId());
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(emp);
		et.commit();
		
	}

	@Override
	public Employee getEmployeeData(int id) {
		EntityManager em=emf.createEntityManager();
		 Employee employee1 = em.find(Employee.class, id);					
		return 	employee1;	
	}

}

