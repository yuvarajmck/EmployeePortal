package com.terzo.EmployeePortal.service.impl;

import com.terzo.EmployeePortal.repository.LeaveLogsRepository;
import com.terzo.EmployeePortal.service.LeaveLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveLogsServiceImpl implements LeaveLogsService {
    private final LeaveLogsRepository leaveLogsRepository;

    @Autowired
    public LeaveLogsServiceImpl(LeaveLogsRepository leaveLogsRepository) {
        this.leaveLogsRepository = leaveLogsRepository;
    }
}
