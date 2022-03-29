package com.appl.vehiclelone.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="VEHICALS")
public class Vehicle {
	@Id
	@Column(name="VEH_NO")
	private String vehNo;
	
	@Column(name="VEH_NAME")
	private String vehName;
	
	@Column(name="VEH_TYPE")
	private String vehType;
	
	//private String LOAN_ID
	

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL})  
	@JoinColumn(name="LOAN_ID")
	private Loan loan_id;
	

	public Loan getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(Loan loan_id) {
		this.loan_id = loan_id;
	}

	public Vehicle(String vehNo, String vehName, String vehType) {
		super();
		this.vehNo = vehNo;
		this.vehName = vehName;
		this.vehType = vehType;
	}

	public Vehicle() {
		super();
	}

	public String getVehNo() {
		return vehNo;
	}

	public void setVehNo(String vehNo) {
		this.vehNo = vehNo;
	}

	public String getVehName() {
		return vehName;
	}

	public void setVehName(String vehName) {
		this.vehName = vehName;
	}

	public String getVehType() {
		return vehType;
	}

	public void setVehType(String vehType) {
		this.vehType = vehType;
	}

	@Override
	public String toString() {
		return "Vehicle [vehNo=" + vehNo + ", vehName=" + vehName + ", vehType=" + vehType + "]";
	}

	
	
	

}
