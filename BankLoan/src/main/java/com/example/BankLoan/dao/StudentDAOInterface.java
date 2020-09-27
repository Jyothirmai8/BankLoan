package com.example.BankLoan.dao;

import java.util.List;

import com.example.BankLoan.entity.Employee;
import com.example.BankLoan.entity.Student;

public interface StudentDAOInterface {

	void addStudentInfo(Student student);

	void updateStudentInfo(Student student);

	void deleteStudentInfo(Student student);

	List<Student> getStudentInfo();

	Student getStudentData(int s);

}
