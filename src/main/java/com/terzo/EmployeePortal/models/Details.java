package com.terzo.EmployeePortal.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
    private String personalMail;
    private String bloodGroup;
    private String currentAddress;
    private String currentAddressCity;
    private String currentAddressPin;
    private String permanentAddress;
    private String permanentAddressCity;
    private String permanentAddressPin;
    private String aadhaar;
    private String pan;
    @OneToOne(mappedBy = "details")
    @JsonBackReference
    private Employee employee;
}