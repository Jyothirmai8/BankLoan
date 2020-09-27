package com.example.BankLoan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankLoan.dao.EmployeeDAOInterface;
import com.example.BankLoan.entity.Employee;
@RestController
public class HomeLoan {
	
	@Autowired
	private EmployeeDAOInterface empdao;
	
	@RequestMapping("getHomeLoan")
	public List<Employee> displayAllEmployeejdbc(){
		System.out.println("message is here: get");
		List<Employee> el=empdao.getEmployeeInfo();
		/*
		 * if(el.size()>0) { throw new ArithmeticException(); }
		 */
		return el;
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/getHomeLoanData")
	public Employee getEmployeejpa(@RequestParam(name = "id") int  s){
		Employee e = empdao.getEmployeeData(s);
		System.out.println("Address="+e.getAddress());

		return e;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addHomeLoan")
	public String addEmployeejpa(@RequestBody Employee employee){
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		empdao.addEmployeeInfo(employee);	
		return "Application Submitted Successfully";
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updateHomeLoan")
	public void updateEmployeejpa(@RequestBody Employee employee){
		empdao.updateEmployeeInfo(employee);			
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteHomeLoan")
	public void deleteEmployeejpa(@RequestBody Employee employee){
		empdao.deleteEmployeeInfo(employee);			
	}
}
