package com.authentication.controllers;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.authentication.entities.UserLoginData;
import com.authentication.entities.Users;
import com.authentication.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/open_signup")
	public String open_signup() {
		return "signup";
	}
	
	@GetMapping("/open_signin")
	public String open_signin() {
		return "signin";
	}
	
	@PostMapping("/signup")
	public String signup(@ModelAttribute Users user, Model m) {
		String username = user.getUsername();
		boolean usernameExist = service.userNameExist(username);
		if(usernameExist == false) {
		service.signUp(user);
		m.addAttribute("msg","User Registeres Successfully!");
		return "signin";
		}
		else {
			m.addAttribute("msg","Username already exists!");
			return "signup";
		}
			
	}
	
	@PostMapping("/signin")
	public String signin(@ModelAttribute UserLoginData data, Model m) {
		Users dbUser = service.getUser(data.getUsername());
		if(dbUser != null) {
		if(data.getPassword().equals(dbUser.getPassword()))
			return "success";
		}
			m.addAttribute("errorMsg", "Wrong Credentials , try again!!");
		return "signin";
	
	}
	}
