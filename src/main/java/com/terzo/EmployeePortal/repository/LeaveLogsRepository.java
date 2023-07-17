package com.terzo.EmployeePortal.repository;

import com.terzo.EmployeePortal.models.Employee;
import com.terzo.EmployeePortal.models.LeaveApl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaveLogsRepository extends JpaRepository<LeaveApl, Long> {
    List<LeaveApl> findByEmployeeIdAndLeaveStatus(Long id, boolean b);

    List<LeaveApl> findLeaveByLeaveStatus(boolean b);

    List<LeaveApl> findLeavesByLeaveStatus(boolean b);
}
