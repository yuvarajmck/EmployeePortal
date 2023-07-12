package com.terzo.EmployeePortal.service;

import com.terzo.EmployeePortal.Dto.EmployeeDTO;
import com.terzo.EmployeePortal.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployee();

    void save(Employee employee);

    void deleteById(long id);

    Employee findEmployeeById(long id);
}
