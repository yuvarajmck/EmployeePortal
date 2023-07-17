package com.terzo.EmployeePortal.repository;

import com.terzo.EmployeePortal.models.Employee;
import com.terzo.EmployeePortal.models.LeaveApl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findEmployeeByLeaves(LeaveApl leaves);
}
