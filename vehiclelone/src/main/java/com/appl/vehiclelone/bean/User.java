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
	@Table(name="USERSV")
	public class User {
		
		@Id
		@Column(name="USER_ID")
		private int userId;
		
		@Column(name="USER_NAME")
		private String userName;
		
		@Column(name="MOB_NO")
		private long mobNo;
		
		@Column(name="DOB")
		private String userDob;
		
		@Column(name="USER_PSW")
		private String userPsw;
		
//		@Column(name="VEH_NO")
//		private String vehNo;
//		
//		@Column(name="ADM_ID")
//		private int admId;
		

		 @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		 @ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL})
		 
		 
		 @JoinColumn(name="VEH_NO")
		 private Vehicle vehicleNo;
		  
		  @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		  @ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL})
		  
		  @JoinColumn(name="ADM_ID") 
		  private Admin adminId;
		  
		  
		  public Vehicle getVehicleNo()  {
			  return vehicleNo; 
			  } 
		  public void setVehicleNo(Vehicle vehicleNo)  {
			  this.vehicleNo = vehicleNo; 
			  } 
		  public Admin getAdminId() { 
			  return adminId; 
			  }
		  public void setAdminId(Admin adminId) {
		 this.adminId = adminId; 
		 }
		public User(int userId, String userName, long mobNo, String userDob, String userPsw) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.mobNo = mobNo;
			this.userDob = userDob;
			this.userPsw = userPsw;
		}
		public User() {
			super();
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public long getMobNo() {
			return mobNo;
		}
		public void setMobNo(long mobNo) {
			this.mobNo = mobNo;
		}
		public String getUserDob() {
			return userDob;
		}
		public void setUserDob(String userDob) {
			this.userDob = userDob;
		}
		public String getUserPsw() {
			return userPsw;
		}
		public void setUserPsw(String userPsw) {
			this.userPsw = userPsw;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", mobNo=" + mobNo + ", userDob=" + userDob
					+ ", userPsw=" + userPsw + "]";
		}

		
		
		
		 
		

}
