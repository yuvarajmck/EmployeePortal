package com.terzo.EmployeePortal.controller;

import com.terzo.EmployeePortal.models.Education;
import com.terzo.EmployeePortal.models.Managers;
import com.terzo.EmployeePortal.service.ManagerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    private ManagerService managerService;
    @PostMapping("/add")
    public void addManager(@RequestBody Managers managers){
        managerService.save(managers);
    }

    @DeleteMapping("/{employeeId}/delete")
    public void deleteManager(@RequestParam long id){
        managerService.deleteManagerById(id);
    }
    @PutMapping("/update")
    public void updateManager(@RequestBody Managers managers){
        managerService.save(managers);
    }
    @GetMapping("/{employeeId}")
    public Managers getManager(@RequestParam long id){
        return managerService.findById(id);
    }
}
