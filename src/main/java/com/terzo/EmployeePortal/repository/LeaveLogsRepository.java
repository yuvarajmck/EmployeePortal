package com.terzo.EmployeePortal.repository;

import com.terzo.EmployeePortal.models.LeaveLogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveLogsRepository extends JpaRepository<LeaveLogs, Long> {
}
