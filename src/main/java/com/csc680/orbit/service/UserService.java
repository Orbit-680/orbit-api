package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.dto.AccountDetailsDTO;
import com.csc680.orbit.model.pojo.User;

public interface UserService {
    User addUser(AccountDetailsDTO accountDetails);
	List <User> getAllUsers(); 
    User getUserByUID(String uid);
}
