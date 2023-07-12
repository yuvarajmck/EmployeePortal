package com.terzo.EmployeePortal.controller;

import com.terzo.EmployeePortal.models.Employee;
import com.terzo.EmployeePortal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RequestMapping
@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee/list")
    public List<Employee> getEmployeesList(){
        return employeeService.findAllEmployee();
    }

    @PostMapping("/employee/new")
    public boolean addEmployee(@RequestBody Employee employee){
        employeeService.save(employee);
        return true;
    }

    @PutMapping("/employee/{employeeId}/update")
    public boolean updateEmployeeInfo(@RequestBody @PathVariable("employeeId") Employee employee){
        employeeService.save(employee);
        return true;
    }

    @DeleteMapping("/employee/{employeeId}/delete")
    public boolean deleteEmployeeInfo( @PathVariable("employeeId") long id){
        employeeService.deleteById(id);
        return true;
    }

    @GetMapping("/employee/{employeeId}/profile")
    public Employee getEmployeeInfo( @PathVariable("employeeId") long id){
        return employeeService.findEmployeeById(id);
    }



}
