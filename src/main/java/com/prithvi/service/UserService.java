package com.prithvi.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.prithvi.model.User;

public interface UserService {

	ResponseEntity<Map<String, String>> registerUser(User user);

}
