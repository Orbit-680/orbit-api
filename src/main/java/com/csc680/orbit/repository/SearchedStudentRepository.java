package com.csc680.orbit.repository;
import org.springframework.data.repository.CrudRepository;
import com.csc680.orbit.model.SearchedStudent;

public interface SearchedStudentRepository extends CrudRepository<SearchedStudent, String>
{
    
}
