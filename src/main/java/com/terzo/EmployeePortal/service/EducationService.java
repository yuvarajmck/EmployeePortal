package com.terzo.EmployeePortal.service;

import com.terzo.EmployeePortal.models.Department;
import com.terzo.EmployeePortal.models.Education;
import org.springframework.stereotype.Service;

@Service
public interface EducationService {
    void deleteEduById(long id);

    void save(Education education);
    Education findById(long id);
}
