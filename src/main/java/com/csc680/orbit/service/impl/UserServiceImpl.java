package com.csc680.orbit.service.impl;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.model.User;
import com.csc680.orbit.repository.UserRepository;
import com.csc680.orbit.service.UserService;

import javassist.bytecode.stackmap.TypeData.ClassName;

@Service ("userService")
public class UserServiceImpl implements UserService{
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		LOGGER.info("Adding user service hit...");
		User u = userRepository.save(user);
		return u;
	}

}
