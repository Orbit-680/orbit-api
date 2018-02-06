package com.csc680.orbit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.csc680.orbit.model.pojo.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, String>{
	List<Teacher> findById(String Id);
	Teacher findOneByUid(String uid);
	void linkTeacher(Teacher newTeacher, int userId);
}
