package com.csc680.orbit.repository;

import java.util.List;
import com.csc680.orbit.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, String>{
	List<Teacher> findById(String Id);
}
