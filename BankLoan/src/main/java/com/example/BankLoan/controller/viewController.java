package com.example.BankLoan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class viewController {

			
	   @RequestMapping("/viewLoans")
	   public String viewLoanss() {
	      return "BankLoan";
	   }
	    
	   @RequestMapping("/educationloan")
	   public String educationLoans() {
	      return "educationloan";
	   }
	   
	   @RequestMapping("/homeloan")
	   public String homeLoans() {
	      return "homeloan";
	   }
	   @RequestMapping("/homeloanstatement")
	   public String homeloanStatement() {
	      return "homeloanstatement";
	   }
	   @RequestMapping("/educationloanstatement")
	   public String educationloanStatement() {
	      return "educationloanstatement";
	   }
}
