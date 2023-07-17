package com.terzo.EmployeePortal.service;

import com.terzo.EmployeePortal.Dto.LeaveLogsDto;
import com.terzo.EmployeePortal.models.LeaveApl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface LeaveLogsService {



    LeaveApl getLeaveById(long leaveId);

    void deleteLeave(long leaveId);

    List<LeaveApl> getAllLeaves();

    LeaveApl createLeave(LeaveApl leave);
    void updateLeave( LeaveApl leave);

    List<LeaveApl> getUnapprovedLeavesByEmployeeId(Long Id);

    List<LeaveLogsDto> getUnapprovedLeaves();
}
