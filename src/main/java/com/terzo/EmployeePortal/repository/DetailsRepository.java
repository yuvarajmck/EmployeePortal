package com.terzo.EmployeePortal.repository;

import com.terzo.EmployeePortal.models.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<Details, Long> {
}
