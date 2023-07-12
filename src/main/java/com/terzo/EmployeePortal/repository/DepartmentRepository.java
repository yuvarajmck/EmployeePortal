package com.terzo.EmployeePortal.repository;

import com.terzo.EmployeePortal.models.Department;
import com.terzo.EmployeePortal.models.LeaveLogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
