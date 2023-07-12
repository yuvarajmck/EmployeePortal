package com.terzo.EmployeePortal.service.impl;

import com.terzo.EmployeePortal.repository.ManagerRepository;
import com.terzo.EmployeePortal.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {
    private final ManagerRepository managerRepository;

    @Autowired
    public ManagerServiceImpl(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }
}
