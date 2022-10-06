package com.nnn.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import com.nnn.model.Department;
import com.nnn.model.Employee;

@ApplicationScoped
public class DeptRepoImpl implements DeptRepo{
	
	
	
	@Inject
	@Named("employeeDataSource")
	DataSource ds;

	@Override
	public Department getdept(int id) {
		Department department = null;
		try {
			Connection conn = null;
			PreparedStatement ps = null;
			conn = ds.getConnection();
			ps = conn.prepareStatement("select e.dept_id, d.department from emp e LEFT JOIN dept d on d.dept_id =e.dept_id where e.dept_id=?");
			
			ps.setInt(1, id);
			System.out.println(ps);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				id = rs.getInt(1);
				String dept = rs.getString(2);
				System.out.println(id);
				System.out.println(dept);
				department = new Department(id,dept);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return department;
	}

}
