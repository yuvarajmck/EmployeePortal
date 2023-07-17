package com.terzo.EmployeePortal.service.impl;

import com.terzo.EmployeePortal.Dto.LeaveLogsDto;
import com.terzo.EmployeePortal.models.LeaveApl;
import com.terzo.EmployeePortal.repository.LeaveLogsRepository;
import com.terzo.EmployeePortal.service.LeaveLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LeaveLogsServiceImpl implements LeaveLogsService {
    private final LeaveLogsRepository leaveLogsRepository;

    @Autowired
    public LeaveLogsServiceImpl(LeaveLogsRepository leaveLogsRepository) {
        this.leaveLogsRepository = leaveLogsRepository;
    }

    @Override
    public void updateLeave( LeaveApl leave) {

         leaveLogsRepository.save(leave);
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
    public List<LeaveLogsDto> getUnapprovedLeaves() {
        List<LeaveApl> leaves = leaveLogsRepository.findLeavesByLeaveStatus(false);
        List<LeaveLogsDto> leaveDto = leaves.stream().map(leave -> mapToLeaveLogsDto(leave)).collect(Collectors.toList());
        return leaveDto;
    }

    private LeaveLogsDto mapToLeaveLogsDto(LeaveApl leaves) {
        LeaveLogsDto leaveDto = LeaveLogsDto.builder()
                .status(leaves.isLeaveStatus())
                .endDate(leaves.getStartDate())
                .startDate(leaves.getEndDate())
                .reason(leaves.getReason())
                .employee(leaves.getEmployee())
                .build();
        return leaveDto;
    }

}
