package com.nnn.model;

public class Department {

	private int dept_id;
	private String department;
	
	
	
	public Department() {
	}
	
	
	
	public Department(int dept_id, String department) {
		super();
		this.dept_id = dept_id;
		this.department = department;
	}



	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}



	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", department=" + department + "]";
	}
	
	
}
