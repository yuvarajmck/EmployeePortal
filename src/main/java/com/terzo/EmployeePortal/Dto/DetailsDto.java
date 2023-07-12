package com.terzo.EmployeePortal.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DetailsDto {
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
    private String aadhaar;
    private String pan;
}
