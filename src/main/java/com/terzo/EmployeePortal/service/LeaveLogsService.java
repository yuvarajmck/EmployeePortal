package com.terzo.EmployeePortal.service;

import com.terzo.EmployeePortal.models.LeaveLogs;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LeaveLogsService {
    LeaveLogs updateLeave(LeaveLogs leave);

    LeaveLogs getLeaveById(long leaveId);

    void deleteLeave(long leaveId);

    List<LeaveLogs> getAllLeaves();

    LeaveLogs createLeave(LeaveLogs leave);
}
