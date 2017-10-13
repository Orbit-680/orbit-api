package com.csc680.orbit.repository;

import java.util.List;
import com.csc680.orbit.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String>
{
    List<Student> findById(String Id);
}