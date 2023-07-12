package com.terzo.EmployeePortal.controller;

import com.terzo.EmployeePortal.models.Education;
import com.terzo.EmployeePortal.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/education")
@RestController
public class EducationController {
    private final EducationService educationService;
    @Autowired
    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }
    @PostMapping("/add")
    public void addDept(@RequestBody Education education){
        educationService.save(education);
    }

    @DeleteMapping("/{employeeId}/delete")
    public void deleteDept(@RequestParam long id){
        educationService.deleteEduById(id);
    }
    @PutMapping("/update")
    public void updateDept(@RequestBody Education education){
        educationService.save(education);
    }
    @GetMapping("/{employeeId}")
    public Education getDept(@RequestParam long id){
        return educationService.findById(id);
    }
}
