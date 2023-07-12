package com.terzo.EmployeePortal.service;

import com.terzo.EmployeePortal.models.Details;
import org.springframework.stereotype.Service;

@Service
public interface DetailsService {
    void save(Details details);

    void deleteEmployeeById(long id);

    Details findById(long id);
}
