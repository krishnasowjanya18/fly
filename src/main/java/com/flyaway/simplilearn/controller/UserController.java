package com.flyaway.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flyaway.simplilearn.dto.Userdto;
import com.flyaway.simplilearn.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	

	@PostMapping("/adminChangePassword")
	public ResponseEntity<String> adminChangePassword(@RequestBody Userdto adminChangePasswordDto) {
		userService.adminChangePassword(adminChangePasswordDto);
		return ResponseEntity.ok("password changed successfully");
	}

}
