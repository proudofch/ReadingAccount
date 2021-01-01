package com.ra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ra.persistence.UserRepository;
import com.ra.vo.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User signUp(User user) {
		User userResult = userRepository.save(user);
		return userResult;
	}
	
}
