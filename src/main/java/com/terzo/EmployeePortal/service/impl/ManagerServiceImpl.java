package com.terzo.EmployeePortal.service.impl;

import com.terzo.EmployeePortal.models.Managers;
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

    @Override
    public void save(Managers managers) {
        managerRepository.save(managers);
    }

    @Override
    public void deleteManagerById(long id) {
        managerRepository.deleteById(id);
    }

    @Override
    public Managers findById(long id) {
        return managerRepository.findById(id).get();
    }
}
