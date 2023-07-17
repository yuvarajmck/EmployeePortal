package com.terzo.EmployeePortal.service.impl;

import com.terzo.EmployeePortal.Dto.EmployeeDTO;
import com.terzo.EmployeePortal.Dto.LeaveLogsDto;
import com.terzo.EmployeePortal.models.Employee;
import com.terzo.EmployeePortal.models.LeaveApl;
import com.terzo.EmployeePortal.repository.EmployeeRepository;
import com.terzo.EmployeePortal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Page<Employee> findAllEmployee(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public void save(Employee employee) {
//        Employee employee = mapTOEmployee(employee);
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee findEmployeeById(long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Page<Employee> getEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }



    @Override
    public List<Employee> findAllEmployeeByName(String query) {
        return employeeRepository.findAllByName(query);
    }

    private EmployeeDTO mapToEmployeeDTO(Employee employee) {
        return EmployeeDTO.builder()
                .id(employee.getId())
                .active(employee.isActive())
                .email(employee.getEmail())
                .designation(employee.getDesignation())
                .mobilNo(employee.getMobilNo())
                .employmentType(employee.getEmploymentType())
                .joiningDate(employee.getJoiningDate())
                .name(employee.getName())
                .photoUrl(employee.getPhotoUrl())

                .build();
    }


    private Employee mapTOEmployee(EmployeeDTO employeeDTO) {
        return Employee.builder()
                .id(employeeDTO.getId())
                .active(employeeDTO.isActive())
                .email(employeeDTO.getEmail())
                .designation(employeeDTO.getDesignation())
                .mobilNo(employeeDTO.getMobilNo())
                .employmentType(employeeDTO.getEmploymentType())
                .joiningDate(employeeDTO.getJoiningDate())
                .name(employeeDTO.getName())
                .photoUrl(employeeDTO.getPhotoUrl())

                .build();
    }
}
