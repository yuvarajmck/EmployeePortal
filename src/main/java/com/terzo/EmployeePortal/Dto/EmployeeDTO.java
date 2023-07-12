package com.terzo.EmployeePortal.Dto;

import com.terzo.EmployeePortal.models.Managers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EmployeeDTO {
    private long id;
    private String name;
    private String email;
    private String photoUrl;
    private String mobilNo;
    private Managers manager;
    private long departmentId;
    private boolean active;
    private String employmentType;
    private String designation;
    private LocalDate joiningDate;
}
