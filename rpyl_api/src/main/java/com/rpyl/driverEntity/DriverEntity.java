package com.rpyl.driverEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DriverEntity {
	
	@Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    public int aadhar;
	public int license;
	public  String name;
	public String fatherName;
	public String driverLicenseNo;
	public String driverAddress;
	public String driverJoiningDate;
	public String driverLeavingDate;
	public String comment;
	public int age;
    
	public int getAadhar() {
		return aadhar;
	}

	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}

	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getDriverLicenseNo() {
		return driverLicenseNo;
	}

	public void setDriverLicenseNo(String driverLicenseNo) {
		this.driverLicenseNo = driverLicenseNo;
	}

	public String getDriverAddress() {
		return driverAddress;
	}

	public void setDriverAddress(String driverAddress) {
		this.driverAddress = driverAddress;
	}

	public String getDriverJoiningDate() {
		return driverJoiningDate;
	}

	public void setDriverJoiningDate(String driverJoiningDate) {
		this.driverJoiningDate = driverJoiningDate;
	}

	public String getDriverLeavingDate() {
		return driverLeavingDate;
	}

	public void setDriverLeavingDate(String driverLeavingDate) {
		this.driverLeavingDate = driverLeavingDate;
	}

	public String getDriverLable() {
		return driverLable;
	}

	public void setDriverLable(String driverLable) {
		this.driverLable = driverLable;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String driverLable;
	
	public String toString() {
		return "[name: " + name + ", id: " + id + " ]";
	}
}
