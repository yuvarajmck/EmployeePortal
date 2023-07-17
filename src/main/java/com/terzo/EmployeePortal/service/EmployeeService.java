package com.terzo.EmployeePortal.service;

import com.terzo.EmployeePortal.Dto.EmployeeDTO;
import com.terzo.EmployeePortal.models.Employee;
import com.terzo.EmployeePortal.models.LeaveApl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    Page<Employee> findAllEmployee(Pageable pageable);

    void save(Employee employee);

    void deleteById(long id);

    Employee findEmployeeById(long id);

    Page<Employee> getEmployees(Pageable pageable);

    List<Employee> findAll();

    Employee findEmployeeByLeave(LeaveApl leaves);
}
