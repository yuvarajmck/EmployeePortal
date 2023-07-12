package com.terzo.EmployeePortal.controller;

import com.terzo.EmployeePortal.models.LeaveLogs;
import com.terzo.EmployeePortal.service.LeaveLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/leaves")
public class LeaveLogController {
    private final LeaveLogsService leaveService;

    @Autowired
    public LeaveLogController(LeaveLogsService leaveService) {
        this.leaveService = leaveService;
    }

    @PostMapping
    public LeaveLogs createLeave(@RequestBody LeaveLogs leave) {
        return leaveService.createLeave(leave);
    }
    @PutMapping("/{leaveId}")
    public LeaveLogs updateLeave(@PathVariable long leaveId, @RequestBody LeaveLogs leave) {
        LeaveLogs existingLeave = leaveService.getLeaveById(leaveId);
        if (existingLeave != null) {
            leave.setId(leaveId);
            return leaveService.updateLeave(leave);
        }
        return null;
    }
    @DeleteMapping("/{leaveId}")
    public void deleteLeave(@PathVariable long leaveId) {
        leaveService.deleteLeave(leaveId);
    }
    @GetMapping
    public List<LeaveLogs> getAllLeaves() {
        return leaveService.getAllLeaves();
    }
    @GetMapping("/{leaveId}")
    public LeaveLogs getLeaveById(@PathVariable long leaveId) {
        return leaveService.getLeaveById(leaveId);
    }
}