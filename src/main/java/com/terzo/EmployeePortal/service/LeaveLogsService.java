package com.terzo.EmployeePortal.service;

import com.terzo.EmployeePortal.models.LeaveApl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface LeaveLogsService {
    LeaveApl updateLeave(LeaveApl leave);

    LeaveApl getLeaveById(long leaveId);

    void deleteLeave(long leaveId);

    List<LeaveApl> getAllLeaves();

    LeaveApl createLeave(LeaveApl leave);


    List<LeaveApl> getUnapprovedLeavesByEmployeeId(Long Id);
    List<LeaveApl> getUnapprovedLeaves();
}
