package com.nnn.model;

public class Employee {
	
	private int emp_id;
	private String empName;
	private String email;
	private String city;
	
	private int dept_id;
	
	

	public Employee() {
	}

	public Employee(int emp_id, String empName, String email, String city, int dept_id) {
		super();
		this.emp_id = emp_id;
		this.empName = empName;
		this.email = email;
		this.city = city;
		this.dept_id = dept_id;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", empName=" + empName + ", email=" + email + ", city=" + city
				+ ", dept_id=" + dept_id + "]";
	}
	
	

}
