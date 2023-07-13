package com.terzo.EmployeePortal.controller;

import com.terzo.EmployeePortal.Dto.AuthenticationDto;
import com.terzo.EmployeePortal.Dto.LoginDto;
import com.terzo.EmployeePortal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class AuthController {
    LoginService loginService;

    @Autowired
    public AuthController(LoginService loginService) {
        this.loginService = loginService;
    }
    @PostMapping("/login")
    public AuthenticationDto login(@RequestBody LoginDto loginDto){
        AuthenticationDto responseDto = loginService.authenticate(loginDto);
        return responseDto;
    }

}
