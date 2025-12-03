package com.authentication.services;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.entities.Users;
import com.authentication.repository.UserRepository;

@Service
public class UserServiceImplementation 
implements UserService{

	@Autowired
	UserRepository repo;
	@Override
	public void signUp(Users user) {
	repo.save(user);
	}
	public boolean userNameExist(String username) {
		Users user = repo.findByUsername(username);
		if(user != null)
		return true;
		else
		return false;
	}
	public Users getUser(String username) {
		return repo.findByUsername(username);
	} 
	

}
