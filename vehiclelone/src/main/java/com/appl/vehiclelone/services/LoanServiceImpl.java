package com.appl.vehiclelone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appl.vehiclelone.bean.Loan;

import com.appl.vehiclelone.dao.LoanDaoImpl;
import com.appl.vehiclelone.exception.CustomLoanException;


@Service("loanService")
public class LoanServiceImpl implements LoanService{
	
	
	@Autowired
	LoanDaoImpl dao;
	

	@Override
	public List<Loan> listAllLoan() {
		System.out.println("inside service layer");
		List<Loan> loanList = dao.listAllLoan();
		return loanList;
		
	}


	@Override
	public void addLoan(Loan l) {
		System.out.println("inside service layer");
		 dao.addLoan(l);
		
		
	}


	@Override
	public Loan getLoanById(String loanId) throws CustomLoanException {
		Loan loanlist=dao.getLoanById(loanId);
		System.out.println("service side\n" + loanlist);
		return loanlist;
	}

}
