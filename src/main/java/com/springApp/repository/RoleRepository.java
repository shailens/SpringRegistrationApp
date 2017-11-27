package com.springApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springApp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
