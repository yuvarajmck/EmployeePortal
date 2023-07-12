package com.terzo.EmployeePortal.service.impl;

import com.terzo.EmployeePortal.models.Department;
import com.terzo.EmployeePortal.models.Details;
import com.terzo.EmployeePortal.repository.DepartmentRepository;
import com.terzo.EmployeePortal.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void deleteDeptById(long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department findById(long id) {
        return departmentRepository.findById(id).get();
    }
}
