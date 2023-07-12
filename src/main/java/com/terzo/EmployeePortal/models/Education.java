package com.terzo.EmployeePortal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Education {
    @Id
    private long id;
    private String name;
    private String bachelorDegree;
    private String bachelorBranch;
    private String masterDegree;
    private String masterBranch;
    private String doctorateDegree;
    private String doctorateBranch;
//    @OneToOne
//    private Employee employee;
}
