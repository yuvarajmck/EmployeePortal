package com.terzo.EmployeePortal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.Duration;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class LeaveLogs {
    @Id
    private long employeeId;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private Duration duration;
    private String reason;

    public void setId(Long leaveId) {
    }
}
