package com.csc680.orbit.repository;

import org.springframework.data.repository.CrudRepository;

import com.csc680.orbit.model.dto.AccountDetailsDTO;
import com.csc680.orbit.model.pojo.User;

public interface UserRepository extends CrudRepository<User, String>{

}
