package com.terzo.EmployeePortal.controller;

import com.terzo.EmployeePortal.models.Department;
import com.terzo.EmployeePortal.models.Details;
import com.terzo.EmployeePortal.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private DepartmentService departmentService;
    @PostMapping("/add")
    public void addDept(@RequestBody Department department){
        departmentService.save(department);
    }

    @DeleteMapping("/{employeeId}/delete")
    public void deleteDept(@RequestParam long id){
        departmentService.deleteDeptById(id);
    }
    @PutMapping("/update")
    public void updateDept(@RequestBody Department department){
        departmentService.save(department);
    }
    @GetMapping("/{employeeId}")
    public Department getDept(@RequestParam long id){
        return departmentService.findById(id);
    }
}
