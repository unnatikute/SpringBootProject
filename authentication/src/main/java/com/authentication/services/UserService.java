package com.authentication.services;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import com.authentication.entities.Users;


public interface UserService {

	void signUp(Users user);

	boolean userNameExist(String username);
	
	Users getUser(String username);
}
