package com.nnn.request;

public class EmpRequest {
	
	private String empName;
	private String department;
	private long acc_no;
	
	
	
	public EmpRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpRequest(String empName, String department, long acc_no) {
		super();
		this.empName = empName;
		this.department = department;
		this.acc_no = acc_no;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	
	

}
