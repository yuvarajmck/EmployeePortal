package com.terzo.EmployeePortal.controller;

import com.terzo.EmployeePortal.models.Employee;
import com.terzo.EmployeePortal.models.LeaveApl;
import com.terzo.EmployeePortal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
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
        return employeeService.findAll();
    }

    @PostMapping("/employee/new")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.save(employee);
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

    @GetMapping("/employee/search/{query}")
    public List<Employee> searchEmployee(@PathVariable("query") String query){
        return employeeService.findAllEmployeeByName(query);
    }
    @GetMapping("/employee/page")
    public Page<Employee> getEmployeeList(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "3") int size) {
        Pageable paging = PageRequest.of(page, size);

        return employeeService.findAllEmployee(paging);
    }

    @PostMapping("/employee/leave")
    public ResponseEntity<Employee> getEmployeeLeave(@RequestParam long id){
        Employee employee = employeeService.findEmployeeById(id);
        return ResponseEntity.ok(employee);

    }




//
//    @GetMapping("/employee/sort")
//    public Page<Employee> getSortedList(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "3") int size) {
//        Pageable sortedByName = PageRequest.of(page, size, Sort.by("name"));
//        return employeeService.findAllEmployee(sortedByName);
//    }
//
//    @GetMapping("/employee/sort/desc")
//    public Page<Employee> getSortedListDesc(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "3") int size) {
//        Pageable sortedByName = PageRequest.of(page, size, Sort.by("name").descending());
//        return employeeService.findAllEmployee(sortedByName);
//    }
}
