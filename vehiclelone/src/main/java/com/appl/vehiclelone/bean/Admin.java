package com.appl.vehiclelone.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMINS")
public class Admin {
	@Id
	@Column(name="ADM_ID")
	private int admId;
	
	@Column(name="ADM_NAME")
	private String admName;
	
	@Column(name="ADM_PSW")
	private String admPsw;
	
	public Admin(int admId, String admName, String admPsw) {
		super();
		this.admId = admId;
		this.admName = admName;
		this.admPsw = admPsw;
	}
	public Admin() {
		super();
	}
	public int getAdmId() {
		return admId;
	}
	public void setAdmId(int admId) {
		this.admId = admId;
	}
	public String getAdmName() {
		return admName;
	}
	public void setAdmName(String admName) {
		this.admName = admName;
	}
	public String getAdmPsw() {
		return admPsw;
	}
	public void setAdmPsw(String admPsw) {
		this.admPsw = admPsw;
	}
	@Override
	public String toString() {
		return "Admin [admId=" + admId + ", admName=" + admName + ", admPsw=" + admPsw + "]";
	}
	

}
