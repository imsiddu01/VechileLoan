package com.appl.vehiclelone.dao;

import java.util.List;

import com.appl.vehiclelone.bean.Loan;
import com.appl.vehiclelone.exception.CustomLoanException;

public interface LoanDao {
	public abstract List<Loan> listAllLoan();

	public abstract void addLoan(Loan l);

	public abstract Loan getLoanById(String loanId) throws CustomLoanException;

}
