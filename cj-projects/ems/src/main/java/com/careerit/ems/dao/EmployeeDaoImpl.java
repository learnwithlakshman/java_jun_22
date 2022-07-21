package com.careerit.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.careerit.ems.domain.Address;
import com.careerit.ems.domain.Employee;
import com.careerit.ems.util.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee insertEmployee(Employee employee) {

		String add_address = "insert into address(city,state,country) values(?,?,?)";
		String add_employee = "insert into employee(ename,salary,aid) values(?,?,?)";

		Connection con = null;
		PreparedStatement pst = null;

		try {
			Long aid = -1L;
			Address address = employee.getAddress();
			if (address != null) {
				con = DbUtil.getConnection();
				pst = con.prepareStatement(add_address, Statement.RETURN_GENERATED_KEYS);
				pst.setString(1, address.getCity());
				pst.setString(2, address.getState());
				pst.setString(3, address.getCountry());
				pst.executeUpdate();
				ResultSet rs = pst.getGeneratedKeys();
				if(rs.next()) {
					aid = rs.getLong(1);
				}
			}
			//TODO needs to check
			pst = con.prepareStatement(add_employee, Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, employee.getEname());
			pst.setDouble(2, employee.getSalary());
			pst.setLong(3, aid == -1 ? null : aid);
			pst.executeUpdate();
			ResultSet rs = pst.getGeneratedKeys();
			Long empno = 0L;
			if(rs.next()) {
				empno = rs.getLong(1);
			}
			employee.setEmpno(empno);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			DbUtil.close(pst, con);
			
		}
		return employee;
	}

	@Override
	public Employee selectEmployee(Long empno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> selectAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployee(Long empno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
