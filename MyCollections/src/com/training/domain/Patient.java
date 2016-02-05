package com.training.domain;

public class Patient implements Comparable<Patient>{
	
	private String patientName;
	private long patientId;
	private long phoneNumber;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String patientName, long patientId, long phoneNumber) {
		super();
		this.patientName = patientName;
		this.patientId = patientId;
		this.phoneNumber = phoneNumber;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
public String toString() {
		
		// TODO Auto-generated method stub
		//return super.toString();
		return(patientId+":"+patientName+":"+phoneNumber);
	}
	public int compareTo(Patient o) {
		// TODO Auto-generated method stub
		
	    if(patientId<o.patientId) return -1;
	    if(patientId>o.patientId) return 1;
		return 0;
	}
	
	
	

}
