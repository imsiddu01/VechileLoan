package com.appl.vehiclelone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.appl.vehiclelone.bean.Loan;
import com.appl.vehiclelone.exception.CustomLoanException;
import com.appl.vehiclelone.exception.CustomUserException;



@Repository
public class LoanDaoImpl implements LoanDao {
	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public List<Loan> listAllLoan() {
		String sql= "select l From Loan l ";
		Query qry = em.createQuery(sql);
		List<Loan> loanList=qry.getResultList();
		System.out.println("on db server" +loanList);
			return loanList;
		
	}


	@Override
	@Transactional
	public void addLoan(Loan l) {
		System.out.println("dao layer");
		em.persist(l);
	}


	@Override
	@Transactional
	public Loan getLoanById(String loanId) throws CustomLoanException {
		Loan loanlist=em.find(Loan.class, loanId);
		if(loanlist!=null)
		{
			loanlist.setLoanId(loanId);
			em.merge(loanlist);
			return loanlist;
		}
		else
		{
			throw new CustomLoanException("Policy Doesnot Exist");
		}
		
		
	}

	

}
