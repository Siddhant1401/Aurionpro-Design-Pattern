package com.aurionpro.model;

public class Manager implements IEmployee{

	private String empName;
	private int empId;
	private String empPosition;
	public Manager(String empName, int empId, String empPosition) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empPosition = empPosition;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	@Override
	public String toString() {
		return "Manager [empName=" + empName + ", empId=" + empId + ", empPosition=" + empPosition + "]";
	}
	@Override
	public void showEmployeeDetails() {
		System.out.println(empId+" "+empName+" "+empPosition);
	}
	
	
}
