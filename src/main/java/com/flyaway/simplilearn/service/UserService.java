package com.flyaway.simplilearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyaway.simplilearn.dto.Userdto;
import com.flyaway.simplilearn.entity.UserClass;
import com.flyaway.simplilearn.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public void adminChangePassword(Userdto adminChangePasswordDto ) {
			UserClass user = userRepository.getAdmin("admin");
			if (adminChangePasswordDto.getUserclass().getUserName().equalsIgnoreCase("admin") && adminChangePasswordDto.getUserclass().getPassword().equalsIgnoreCase(user.getPassword()))
				userRepository.adminChangePassword("admin",adminChangePasswordDto.getNewPassword());
		}
		
	
	
	

}
