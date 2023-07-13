package com.terzo.EmployeePortal.service;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public interface JwtService {

    String extractEmail(String jwt);

    boolean isTokenValid(String jwt, UserDetails userDetails);
    String generateToken(UserDetails userDetails);
    String generateToken(
            Map<String, Object> extraClaims,
            UserDetails userDetails
    );
}
