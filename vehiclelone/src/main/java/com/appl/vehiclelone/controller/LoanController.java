package com.appl.vehiclelone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appl.vehiclelone.bean.Loan;
import com.appl.vehiclelone.exception.CustomLoanException;
import com.appl.vehiclelone.services.LoanService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/loan")
public class LoanController {
	
	@Autowired
	LoanService loanService;
	
	//http://localhost:8090/loan/loans
			@GetMapping("/loans")
			public List<Loan> listAllloanList()
			{
				return loanService.listAllLoan();
			}
			
			//http://localhost:8090/loan/addLoan
			@PostMapping("/addLoan")
		    public void  addLoan(@RequestBody Loan l)
		   {
			  loanService.addLoan(l);
		   }
			
			
			//http://localhost:8090/loan/loanid/ABC123
		    @GetMapping("/loanid/{id}")
			public Loan getLoanById(@PathVariable(value="id") String loanId) throws CustomLoanException
			{
				//System.out.println("inside controller");
			return loanService.getLoanById(loanId);
			}	

}
