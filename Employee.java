package com.timesheet.model;

public class Employee {
	
	private int empId;
	private String empName;
	private String HCC ;
	private String mailId ;
	private java.util.Date date ;
	public int getEmpId() {
	return empId;
	}
	public void setEmpId(int empId) {
	this.empId = empId;
	}
	public String getEmpName() {
	return empName;
	}
	public void setEmpName(String empName) {
	this.empName = empName;
	}
	public String getHCC() {
	return HCC;
	}
	public void setHCC(String hCC) {
	HCC = hCC;
	}
	public String getMailId() {
	return mailId;
	}
	public void setMailId(String mailId) {
	this.mailId = mailId;
	}
	public java.util.Date getDate() {
	return date;
	}
	public void setDate(java.util.Date date) {
	this.date = date;
	}



}
