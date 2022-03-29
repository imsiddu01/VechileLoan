package com.appl.vehiclelone.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="LOANS")
public class Loan {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LOAN_ID")
	private String loanId;
	
	@Column(name="LOAN_AMT")
	private long loanAmt;
	
	@Column(name="EMI")
	private long emi;
	
	@Column(name="PERIOD")
	private String period;
	
	@Column(name="START_DATE")
	private String startDate;
	
	@Column(name="END_DATE")
	private String endDate;
	
	@Column(name="ADM_ID")
	private int admId;

	public Loan(String loanId, long loanAmt, long emi, String period, String startDate, String endDate, int admId) {
		super();
		this.loanId = loanId;
		this.loanAmt = loanAmt;
		this.emi = emi;
		this.period = period;
		this.startDate = startDate;
		this.endDate = endDate;
		this.admId = admId;
	}

	public Loan() {
		super();
	}

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public long getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(long loanAmt) {
		this.loanAmt = loanAmt;
	}

	public long getEmi() {
		return emi;
	}

	public void setEmi(long emi) {
		this.emi = emi;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getAdmId() {
		return admId;
	}

	public void setAdmId(int admId) {
		this.admId = admId;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanAmt=" + loanAmt + ", emi=" + emi + ", period=" + period
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", admId=" + admId + "]";
	}
	
	
	
	

	/*
	 * @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	 * 
	 * @ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL})
	 * 
	 * @JoinColumn(name="ADM_ID") private Admin adm_id;
	 * 
	 * public Admin getAdm_id() { return adm_id; } public void setAdm_id(Admin
	 * adm_id) { this.adm_id = adm_id; }
	 */
	
	
	
	

}
