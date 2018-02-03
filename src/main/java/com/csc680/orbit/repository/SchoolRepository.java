package com.csc680.orbit.repository;

import org.springframework.data.repository.CrudRepository;

import com.csc680.orbit.model.pojo.School;

public interface SchoolRepository extends CrudRepository<School, String> {

}
