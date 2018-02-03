package com.csc680.orbit.repository;

import java.util.List;

import com.csc680.orbit.model.dto.AccountLinkStudentDTO;
import com.csc680.orbit.model.dto.StudentDTO;
import com.csc680.orbit.model.pojo.AccountLinkStudent;
import com.csc680.orbit.model.pojo.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String>
{
    List<Student> findById(String Id);

	Student findStudent(StudentDTO studentDto);
	AccountLinkStudent linkStudent(AccountLinkStudentDTO accountLinkDto);
	List<Student> findLinkedStudents(String UID);
}
