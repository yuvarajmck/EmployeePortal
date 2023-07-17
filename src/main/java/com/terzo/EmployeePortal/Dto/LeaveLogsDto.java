package com.terzo.EmployeePortal.Dto;

import com.terzo.EmployeePortal.models.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class LeaveLogsDto {
    private long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;

    private boolean status;

private Employee employee;
}
