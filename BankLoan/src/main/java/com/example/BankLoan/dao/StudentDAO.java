package com.example.BankLoan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.BankLoan.entity.Student;

@Repository
public class StudentDAO implements StudentDAOInterface {

	@Autowired
	private EntityManagerFactory entityManagerFactory;	
	
	@Override
	public void addStudentInfo(Student student) {
		// TODO Auto-generated method stub
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}

	@Override
	public void updateStudentInfo(Student student) {
		// TODO Auto-generated method stub
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}

	@Override
	public void deleteStudentInfo(Student student) {
		// TODO Auto-generated method stub
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student stu=entityManager.find(student.getClass(), student.getAdmisionnum());
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(stu);
		entityTransaction.commit();
	}

	@Override
	public List<Student> getStudentInfo() {
		// TODO Auto-generated method stub
	
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//Student stu=entityManager.find(student.getClass(), student.getAdmisionnum());
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Query query=entityManager.createQuery("from com.example.BankLoan.entity.Student s");
		return query.getResultList();
	
		//return null;
	}

	@Override
	public Student getStudentData(int s) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student stu=entityManager.find(Student.class, s);
		return stu;
	}

}
