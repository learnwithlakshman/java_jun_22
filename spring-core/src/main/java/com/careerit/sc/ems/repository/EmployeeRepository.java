package com.careerit.sc.ems.repository;

import com.careerit.sc.ems.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
