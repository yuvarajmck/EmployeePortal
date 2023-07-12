package com.terzo.EmployeePortal.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class LeaveLogsDto {
    private long employeeId;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private Duration duration;
}
