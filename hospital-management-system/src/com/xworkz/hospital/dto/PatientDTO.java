package com.xworkz.hospital.dto;

import com.xworkz.hospital.constant.Gender;

public class PatientDTO {
	
	
	private int patientId;
	private String name;
	private String address;
	private Gender gender;
	private long contactNo;
	
	public int getPatientId() {
		return patientId;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public Gender getGender() {
		return gender;
	}
	public long getContactNo() {
		return contactNo;
	} 
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	
	
	

}
