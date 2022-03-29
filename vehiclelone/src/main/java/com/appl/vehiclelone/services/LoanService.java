package com.appl.vehiclelone.services;

import java.util.List;

import com.appl.vehiclelone.bean.Loan;
import com.appl.vehiclelone.exception.CustomLoanException;

public interface LoanService {

	public abstract List<Loan> listAllLoan();

	public abstract void addLoan(Loan l);

	public abstract Loan getLoanById(String loanId) throws CustomLoanException;

}
