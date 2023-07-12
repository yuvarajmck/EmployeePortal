package com.terzo.EmployeePortal.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Details {
    @Id
    private long id;
    private String name;
    private String personalMail;
    private String bloodGroup;
    private LocalDate dob;
    private String gender;
    private String currentAddress;
    private String currentCity;
    private String permanentAddress;
    private String permanentAddressCity;
    @NotEmpty(message = "This field is required")
    private String aadhaar;
    @NotEmpty(message = "This field is required")
    private String pan;
    @OneToOne(mappedBy = "details")
    @JsonBackReference
    private Employee employee;
}