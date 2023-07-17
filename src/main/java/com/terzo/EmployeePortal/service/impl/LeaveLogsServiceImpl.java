package com.terzo.EmployeePortal.service.impl;

import com.terzo.EmployeePortal.models.LeaveApl;
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
    public LeaveApl updateLeave(LeaveApl leave) {
        return leaveLogsRepository.save(leave);
    }

    @Override
    public LeaveApl getLeaveById(long leaveId) {
        return leaveLogsRepository.findById(leaveId).get();
    }

    @Override
    public void deleteLeave(long leaveId) {
        leaveLogsRepository.deleteById(leaveId);
    }

    @Override
    public List<LeaveApl> getAllLeaves() {
        return leaveLogsRepository.findAll();
    }

    @Override
    public LeaveApl createLeave(LeaveApl leave) {
        leaveLogsRepository.save(leave);
        return leave;
    }
    @Override
    public List<LeaveApl> getUnapprovedLeavesByEmployeeId(Long Id) {
        return leaveLogsRepository.findByEmployeeIdAndLeaveStatus(Id, false);
    }

    @Override
    public List<LeaveApl> getUnapprovedLeaves() {
        return leaveLogsRepository.findLeaveByLeaveStatus(false);
    }

}
