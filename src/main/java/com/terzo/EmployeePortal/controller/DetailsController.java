package com.terzo.EmployeePortal.controller;

import com.terzo.EmployeePortal.models.Details;
import com.terzo.EmployeePortal.repository.DetailsRepository;
import com.terzo.EmployeePortal.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/details")
public class DetailsController {
    private DetailsService detailsService;
    @Autowired
    public DetailsController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }
    @PostMapping("/add")
    public void addEmployee(@RequestBody Details details){
        detailsService.save(details);
    }

    @DeleteMapping("/{employeeId}/delete")
    public void deleteEmployee(@RequestParam long id){
        detailsService.deleteEmployeeById(id);
    }
    @PutMapping("/update")
    public void updateEmployee(@RequestBody Details details){
        detailsService.save(details);
    }
    @GetMapping("/{employeeId}")
    public Details getEmployee(@RequestParam long id){
        return detailsService.findById(id);
    }
}
