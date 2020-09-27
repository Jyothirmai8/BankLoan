package com.example.BankLoan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.BankLoan.dao.StudentDAOInterface;
import com.example.BankLoan.entity.Employee;
import com.example.BankLoan.entity.Student;

@RestController
@SessionAttributes("")
public class EducationlLoan {

	@Autowired
	private StudentDAOInterface studao;
	
	@RequestMapping("getEducationLoan")
	public List<Student> displayAllEmployeejdbc(){
		System.out.println("message is here");
		List<Student> el=studao.getStudentInfo();
		/*if(el.size()>0) {
			throw new ArithmeticException();
		}*/
		return el;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/getEducationLoanData")
	public Student getEmployeejpa(@RequestParam(name = "admisionnum") int  s){
		Student e = studao.getStudentData(s);
		System.out.println("Address="+e.getAddress());

		return e;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addEducationLoan")
	public String addEmployeejpa(@RequestBody Student student){
		System.out.println(student.getLoanamount());
		System.out.println(student.getLoanstartdate());
		studao.addStudentInfo(student);	
		return "Application Submitted Successfully";
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updateEducationLoan")
	public void updateEmployeejpa(@RequestBody Student student){
		studao.updateStudentInfo(student);			
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteEducationLoan")
	public void deleteEmployeejpa(@RequestBody Student student){
		studao.deleteStudentInfo(student);			
	}
}
