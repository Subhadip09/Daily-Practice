package com.Subhadip.Course_Monitoring_System.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
	private int facultyId;
	
	private String facultyName;
	
	private String facultyAddress;
	
	private String mobileNo;
	
	private String email;
	
	private String userName;
	
	private String password;

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getFacultyAddress() {
		return facultyAddress;
	}

	public void setFacultyAddress(String facultyAddress) {
		this.facultyAddress = facultyAddress;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Faculty() {
		super();
	}

	public Faculty(int facultyId, String facultyName, String facultyAddress, String mobileNo, String email,
			String userName, String password) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultyAddress = facultyAddress;
		this.mobileNo = mobileNo;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultyAddress=" + facultyAddress
				+ ", mobileNo=" + mobileNo + ", email=" + email + ", userName=" + userName + ", password=" + password
				+ "]";
	}
}
