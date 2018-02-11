package com.csc680.orbit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.csc680.orbit.model.dto.CreateAssignmentDTO;
import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Student;

public interface AssignmentRepository extends CrudRepository<Assignment, String>{
	List<Assignment> findAllAssignmentsForCourse(int courseID);
}
