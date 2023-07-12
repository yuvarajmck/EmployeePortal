package com.terzo.EmployeePortal.models;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Transactional
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String photoUrl;
    private String mobilNo;
    private boolean active;
    private String employmentType;
    private String designation;
    private LocalDate joiningDate;
    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;
    @OneToOne
    private Details details;
}
