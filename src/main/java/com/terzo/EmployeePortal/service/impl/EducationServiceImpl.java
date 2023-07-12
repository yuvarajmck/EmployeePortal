package com.terzo.EmployeePortal.service.impl;

import com.terzo.EmployeePortal.models.Department;
import com.terzo.EmployeePortal.models.Education;
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

    @Override
    public void deleteEduById(long id) {
        educationRepository.deleteById(id);
    }

    @Override
    public void save(Education education) {
        educationRepository.save(education);
    }

    @Override
    public Education findById(long id) {
        return educationRepository.findById(id).get();
    }
}
