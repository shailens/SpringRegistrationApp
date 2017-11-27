package com.springApp.service;


import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springApp.model.Role;
import com.springApp.model.UserCredentials;
import com.springApp.repository.RoleRepository;
import com.springApp.repository.UserRepository;

public class UserServiceImpl implements UserService{
	@Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

   
    public void save(UserCredentials user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<Role>(roleRepository.findAll()));
        userRepository.save(user);
    }

   
    public UserCredentials findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
