package com.careerit.jdbc.empstats;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.careerit.jdbc.DbUtil;

public class EmpDeptServiceImpl implements EmpStatService {

	@Override
	public List<EmpDeptDto> getEmployeesWithDeptDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeManagerDto> getEmployeesWithMgrDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeptStatsDto> getDepartmentStats() {
		List<DeptStatsDto> list = new ArrayList<DeptStatsDto>();
		String query = "select d.dname as dname,sum(e.sal) as total_amount,count(1) as emp_count from emp e inner join dept d on e.deptno=d.deptno group by d.dname,e.deptno;";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = DbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				String dname = rs.getString("dname");
				double totalAmount = rs.getDouble("total_salary");
				int empCount = rs.getInt("emp_count");
				DeptStatsDto obj = new DeptStatsDto(dname, totalAmount, empCount);
				list.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtil.close(rs, st, con);
		}
		return list;
	}

}
