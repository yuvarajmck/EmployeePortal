package com.terzo.EmployeePortal.service;

import com.terzo.EmployeePortal.models.Managers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ManagerService {
    void save(Managers managers);

    void deleteManagerById(long id);

    Managers findById(long id);

    List<Managers> findAll();
}
