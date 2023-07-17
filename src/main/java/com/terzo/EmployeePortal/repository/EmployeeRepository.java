package com.terzo.EmployeePortal.repository;

import com.terzo.EmployeePortal.models.Employee;
import com.terzo.EmployeePortal.models.LeaveApl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAllByName(String name);

}
