package com.csc680.orbit.repository;

import java.util.List;

import com.csc680.orbit.model.AccountLink;
import com.csc680.orbit.model.Student;
import com.csc680.orbit.model.StudentDTO;
import com.csc680.orbit.model.AccountLinkDTO;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String>
{
    List<Student> findById(String Id);

	Student findStudent(StudentDTO studentDto);
	AccountLink linkStudent(AccountLinkDTO accountLinkDto);
}
