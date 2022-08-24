package com.careerit.sc.ems.repository;

import com.careerit.sc.ems.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByNameLike(String str);
}
