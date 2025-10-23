package com.prithvi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prithvi.model.User;
import com.prithvi.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;	

	@DeleteMapping(value = "/register")
	public ResponseEntity<Map<String, String>> registerUser(@RequestBody User user) {
		System.out.println("Inside Controller, Register");
		return userService.registerUser(user);
	}

}
