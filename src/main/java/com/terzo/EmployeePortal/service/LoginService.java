package com.terzo.EmployeePortal.service;

import com.terzo.EmployeePortal.Dto.AuthenticationDto;
import com.terzo.EmployeePortal.Dto.LoginDto;
import com.terzo.EmployeePortal.Dto.UsersDto;
import com.terzo.EmployeePortal.authmodels.Users;
import com.terzo.EmployeePortal.models.Employee;

import com.terzo.EmployeePortal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    JwtService jwtService;
    AuthenticationManager authenticationManager;
    private com.terzo.EmployeePortal.repository.UserRepository userRepository;

    @Autowired
    public LoginService(JwtService jwtService, AuthenticationManager authenticationManager, com.terzo.EmployeePortal.repository.UserRepository userRepository) {
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
    }



    public AuthenticationDto authenticate(LoginDto loginDto) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDto.getEmail(),
                        loginDto.getPassword()
                )
        );
        Users users = userRepository.findByEmail(loginDto.getEmail());
        return AuthenticationDto.builder()
                .jwt(jwtService.generateToken(new UsersDto(users)))
                .build();
    }
}
