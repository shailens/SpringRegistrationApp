package com.springApp.service;

import com.springApp.model.UserCredentials;

public interface UserService {
	 void save(UserCredentials user);

	 UserCredentials findByUsername(String username);
}
