package com.example.BankLoan.dao;

import java.util.List;

import com.example.BankLoan.entity.Employee;

public interface EmployeeDAOInterface {

	List<Employee> getEmployeeInfo();

	void addEmployeeInfo(Employee employee);

	void updateEmployeeInfo(Employee employee);

	void deleteEmployeeInfo(Employee employee);

	Employee getEmployeeData(int s);

}
