package com.example.BankLoan.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.BankLoan.dao.StudentDAOInterface;
@Entity
@Table(name= "student")
public class Student {
	@Id
	private int admisionnum;
	private String name;
	private String email;
	private String address;
	private double loanamount;
	private Date loanstartdate;
	private Date loanenddate;
	private double emi;
	private Date emidate;
	private int eminumber;	
	
	public Student() {	}

	public Student(int admisionnum, String name, String email, String address, double loanamount, Date loanstartdate,
			Date loanenddate, double emi, Date emidate, int eminumber) {
		super();
		this.admisionnum = admisionnum;
		this.name = name;
		this.email = email;
		this.address = address;
		this.loanamount = loanamount;
		this.loanstartdate = loanstartdate;
		this.loanenddate = loanenddate;
		this.emi = emi;
		this.emidate = emidate;
		this.eminumber = eminumber;
	}

	public int getAdmisionnum() {
		return admisionnum;
	}

	public void setAdmisionnum(int admisionnum) {
		this.admisionnum = admisionnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}

	public Date getLoanstartdate() {
		return loanstartdate;
	}

	public void setLoanstartdate(Date loanstartdate) {
		this.loanstartdate = loanstartdate;
	}

	public Date getLoanenddate() {
		return loanenddate;
	}

	public void setLoanenddate(Date loanenddate) {
		this.loanenddate = loanenddate;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public Date getEmidate() {
		return emidate;
	}

	public void setEmidate(Date emidate) {
		this.emidate = emidate;
	}

	public int getEminumber() {
		return eminumber;
	}

	public void setEminumber(int eminumber) {
		this.eminumber = eminumber;
	}

	
}
