package com.terzo.EmployeePortal.controller;

import com.terzo.EmployeePortal.models.LeaveApl;
import com.terzo.EmployeePortal.service.LeaveLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/leaves")
public class LeaveLogController {
    private final LeaveLogsService leaveService;

    @Autowired
    public LeaveLogController(LeaveLogsService leaveService) {
        this.leaveService = leaveService;
    }

    @PostMapping("/apply")
    public LeaveApl createLeave(@RequestBody LeaveApl leave) {
        return leaveService.createLeave(leave);
    }
    @PutMapping("/{leaveId}")
    public LeaveApl updateLeave(@PathVariable long leaveId, @RequestBody LeaveApl leave) {
        LeaveApl existingLeave = leaveService.getLeaveById(leaveId);

        return null;
    }
    @DeleteMapping("/{leaveId}")
    public void deleteLeave(@PathVariable long leaveId) {
        leaveService.deleteLeave(leaveId);
    }
    @GetMapping
    public List<LeaveApl> getAllLeaves() {
        return leaveService.getAllLeaves();
    }
    @GetMapping("/{leaveId}")
    public LeaveApl getLeaveById(@PathVariable long leaveId) {
        return leaveService.getLeaveById(leaveId);
    }
    @GetMapping("/employee/{Id}/unapproved")
    public ResponseEntity<List<LeaveApl>> getUnapprovedLeavesByEmployeeId(@PathVariable Long Id) {
        List<LeaveApl> unapprovedLeaves = leaveService.getUnapprovedLeavesByEmployeeId(Id);
        return ResponseEntity.ok(unapprovedLeaves);
    }
    @GetMapping("/unapproved")
    public ResponseEntity<List<LeaveApl>> getUnapprovedLeaves(){
        List<LeaveApl> unapprovedLeaves = leaveService.getUnapprovedLeaves();
        return ResponseEntity.ok(unapprovedLeaves);
    }

    @PutMapping("/approve")
    public void approveLeave(@RequestBody LeaveApl leaveApl){
        leaveService.updateLeave(leaveApl);
    }
}