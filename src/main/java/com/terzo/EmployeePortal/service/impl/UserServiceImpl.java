package com.terzo.EmployeePortal.service.impl;

import com.terzo.EmployeePortal.Dto.UsersDto;
import com.terzo.EmployeePortal.repository.UserRepository;
import com.terzo.EmployeePortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails =new UsersDto(userRepository.findByEmail(username)) ;
        return userDetails;
    }
}
