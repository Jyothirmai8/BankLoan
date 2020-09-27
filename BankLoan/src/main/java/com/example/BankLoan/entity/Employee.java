package com.example.BankLoan.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee2")
public class Employee {
	@Id
	private int id;
	private String name;
	private String email;
	private String address;
	private double loanamount;
	private Date loanstartdate;
	private Date loanenddate;
	private double emi;
	private Date emidate;
	private int eminumber;
	
	public Employee() {}	
		
	public Employee(int id, String name, String email, String address, double loanAmount, Date loanStartDate,
			Date loanEndDate, double eMI, Date eMIdate, int eMInumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.loanamount = loanAmount;
		this.loanstartdate = loanStartDate;
		this.loanenddate = loanEndDate;
		emi = eMI;
		emidate = eMIdate;
		eminumber = eMInumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getLoanAmount() {
		return loanamount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanamount = loanAmount;
	}

	public Date getLoanStartDate() {
		return loanstartdate;
	}

	public void setLoanStartDate(Date loanStartDate) {
		this.loanstartdate = loanStartDate;
	}

	public Date getLoanEndDate() {
		return loanenddate;
	}

	public void setLoanEndDate(Date loanEndDate) {
		this.loanenddate = loanEndDate;
	}

	public double getEMI() {
		return emi;
	}

	public void setEMI(double eMI) {
		emi = eMI;
	}

	public Date getEMIdate() {
		return emidate;
	}

	public void setEMIdate(Date eMIdate) {
		emidate = eMIdate;
	}

	public int getEMInumber() {
		return eminumber;
	}

	public void setEMInumber(int eMInumber) {
		eminumber = eMInumber;
	}
	
}

