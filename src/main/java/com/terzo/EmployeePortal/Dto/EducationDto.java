package com.terzo.EmployeePortal.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EducationDto {
    private long employeeId;
    private String name;
    private String bachelorDegree;
    private String bachelorBranch;
    private String masterDegree;
    private String masterBranch;
    private String doctorateDegree;
    private String doctorateBranch;
}
