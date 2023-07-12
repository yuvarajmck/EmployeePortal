package com.terzo.EmployeePortal.repository;

import com.terzo.EmployeePortal.models.Managers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Managers, Long> {
}
