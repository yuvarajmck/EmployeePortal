package com.terzo.EmployeePortal.service.impl;

import com.terzo.EmployeePortal.models.Details;
import com.terzo.EmployeePortal.repository.DetailsRepository;
import com.terzo.EmployeePortal.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsServiceImpl implements DetailsService {
    private final DetailsRepository detailsRepository;

    @Autowired
    public DetailsServiceImpl(DetailsRepository detailsRepository) {
        this.detailsRepository = detailsRepository;
    }

    @Override
    public void save(Details details) {
        detailsRepository.save(details);
    }

    @Override
    public void deleteEmployeeById(long id) {
        detailsRepository.deleteById(id);
    }

    @Override
    public Details findById(long id) {
        return detailsRepository.findById(id).get();
    }
}
