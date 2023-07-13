package com.terzo.EmployeePortal.service;

import com.terzo.EmployeePortal.Dto.AuthenticationDto;
import com.terzo.EmployeePortal.Dto.LoginDto;
import com.terzo.EmployeePortal.Dto.UsersDto;
import com.terzo.EmployeePortal.authmodels.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

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
        System.out.println("Hola");
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getEmail(),
                loginDto.getPassword()
        ));

        System.out.println("Hello");
        Users users = userRepository.findByEmail(loginDto.getEmail());
        System.out.println(users.toString());
        System.out.println(jwtService.generateToken((new UsersDto(users))));
        AuthenticationDto authenticationDto = AuthenticationDto.builder()
                .jwt(jwtService.generateToken((new UsersDto(users))))
                .build();
        return authenticationDto;
    }
}
