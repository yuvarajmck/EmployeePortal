package com.terzo.EmployeePortal.service.impl;

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
}
