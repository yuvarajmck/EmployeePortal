package com.terzo.EmployeePortal.service.impl;

import com.terzo.EmployeePortal.repository.EducationRepository;
import com.terzo.EmployeePortal.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationServiceImpl implements EducationService {
    private final EducationRepository educationRepository;

    @Autowired
    public EducationServiceImpl(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }
}
