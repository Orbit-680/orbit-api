package com.csc680.orbit.repository;

import org.springframework.data.repository.CrudRepository;

import com.csc680.orbit.model.User;

public interface UserRepository extends CrudRepository<User, String>{

}
