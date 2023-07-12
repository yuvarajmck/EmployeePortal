package com.terzo.EmployeePortal.service.impl;

import com.terzo.EmployeePortal.models.LeaveLogs;
import com.terzo.EmployeePortal.repository.LeaveLogsRepository;
import com.terzo.EmployeePortal.service.LeaveLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveLogsServiceImpl implements LeaveLogsService {
    private final LeaveLogsRepository leaveLogsRepository;

    @Autowired
    public LeaveLogsServiceImpl(LeaveLogsRepository leaveLogsRepository) {
        this.leaveLogsRepository = leaveLogsRepository;
    }

    @Override
    public LeaveLogs updateLeave(LeaveLogs leave) {
        return leaveLogsRepository.save(leave);
    }

    @Override
    public LeaveLogs getLeaveById(long leaveId) {
        return leaveLogsRepository.findById(leaveId).get();
    }

    @Override
    public void deleteLeave(long leaveId) {
        leaveLogsRepository.deleteById(leaveId);
    }

    @Override
    public List<LeaveLogs> getAllLeaves() {
        return leaveLogsRepository.findAll();
    }

    @Override
    public LeaveLogs createLeave(LeaveLogs leave) {
        leaveLogsRepository.save(leave);
        return leave;
    }
}
