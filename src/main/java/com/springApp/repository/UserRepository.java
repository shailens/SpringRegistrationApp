package com.springApp.repository;

import com.springApp.model.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserCredentials, Long>{
	UserCredentials findByUsername(String username);
}
