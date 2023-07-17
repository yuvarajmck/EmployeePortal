package com.terzo.EmployeePortal.service;

import com.terzo.EmployeePortal.models.Department;
import com.terzo.EmployeePortal.models.Details;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    void save(Department department);

    void deleteDeptById(long id);

    Department findById(long id);

    List<Department> findAll();
}
