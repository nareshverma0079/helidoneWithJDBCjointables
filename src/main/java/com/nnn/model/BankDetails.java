package com.nnn.model;

public class BankDetails {
	
	private int bankId;
	private String bankName;
	private String branchName;
	private long accountNo;
	
	private int empId;
	
	
	
	public BankDetails() {
	}



	public BankDetails(int bankId, String bankName, String branchName, long accountNo, int empId) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.branchName = branchName;
		this.accountNo = accountNo;
		this.empId = empId;
	}



	public int getBankId() {
		return bankId;
	}



	public void setBankId(int bankId) {
		this.bankId = bankId;
	}



	public String getBankName() {
		return bankName;
	}



	public void setBankName(String bankName) {
		this.bankName = bankName;
	}



	public String getBranchName() {
		return branchName;
	}



	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}



	public long getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	@Override
	public String toString() {
		return "BankDetails [bankId=" + bankId + ", bankName=" + bankName + ", branchName=" + branchName
				+ ", accountNo=" + accountNo + ", empId=" + empId + "]";
	}
	
	
	
	

}
