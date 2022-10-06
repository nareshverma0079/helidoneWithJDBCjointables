package com.nnn.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import com.nnn.model.BankDetails;

public class BankRepoImpl implements BankRepo{
	
	private static final String GET_BANK_DETAILS = "select e.empname, d.department , b.acc_no from emp e left join dept d on d.dept_id = e.dept_id left join bank_details b on b.emp_id = e.emp_id where b.bank_id=1";
	
	@Inject
	@Named("employeeDataSource")
	DataSource ds;

	@Override
	public BankDetails getbankdetails(int id) {
		BankDetails bankDetails = null;
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ds.getConnection();
			ps = conn.prepareStatement(GET_BANK_DETAILS);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				id = rs.getInt(1);
				String bank_name = rs.getString(2);
				String branch_name = rs.getString(3);
				long acc_no = rs.getLong(4);
				int emp_id = rs.getInt(5);
				bankDetails = new BankDetails(id, bank_name, branch_name, acc_no, emp_id);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return bankDetails;
	}

}
