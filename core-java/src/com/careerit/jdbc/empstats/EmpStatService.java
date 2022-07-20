package com.careerit.jdbc.empstats;

import java.util.List;

public interface EmpStatService {

		public List<EmpDeptDto> getEmployeesWithDeptDetails();
		public List<EmployeeManagerDto> getEmployeesWithMgrDetails();
		public List<DeptStatsDto> getDepartmentStats();
}
