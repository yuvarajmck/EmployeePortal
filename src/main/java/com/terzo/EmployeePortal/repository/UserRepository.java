package com.terzo.EmployeePortal.repository;

import com.terzo.EmployeePortal.authmodels.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByEmail(String email);
}
