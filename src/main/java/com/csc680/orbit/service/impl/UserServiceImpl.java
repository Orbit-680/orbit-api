package com.csc680.orbit.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.model.dto.AccountDetailsDTO;
import com.csc680.orbit.model.pojo.User;
import com.csc680.orbit.model.pojo.Student;
import com.csc680.orbit.model.pojo.Teacher;
import com.csc680.orbit.repository.StudentRepository;
import com.csc680.orbit.repository.TeacherRepository;
import com.csc680.orbit.repository.UserRepository;
import com.csc680.orbit.service.UserService;

import javassist.bytecode.stackmap.TypeData.ClassName;

import com.csc680.orbit.utils.Constants;

@Service ("userService")
public class UserServiceImpl implements UserService{
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public User addUser(AccountDetailsDTO accountDetails) {
		LOGGER.info("Adding user service hit...");
		User u = userRepository.save(accountDetails.getUser());
		
		if(u.getUid() != null){
			accountDetails.setUser(u);
			
			switch(u.getRole().getName()){
				case Constants.ROLE_TEACHER: {
					Teacher teacher = new Teacher();
					teacher.setFirstName(accountDetails.getFirstName());
					teacher.setLastName(accountDetails.getLastName());
					teacher.setDateOfBirth(accountDetails.getDob());
					Teacher newTeacher = teacherRepository.save(teacher);
					teacherRepository.linkTeacher(newTeacher, u.getUserID());
				}
				case Constants.ROLE_STUDENT: {
					Student student = new Student();
					student.setStudentFirstName(accountDetails.getFirstName());
					student.setStudentLastName(accountDetails.getLastName());
					student.setDateOfBirth(accountDetails.getDob());
					//Student newStudent = studentRepository.save(student);
					LOGGER.info("Wanting to carete this newStudent: " + student.toString());
				}
			}
		}
		
		return u;
	}

	@Override
	public User getUserByUID(String uid) {
		LOGGER.info("Get user service hit...");
		User u = userRepository.findOne(uid);
		return u;
	}

	@Override
	public List<User> getAllUsers() {
		LOGGER.info("getAllUsers service hit");
		List<User> users = (List<User>) userRepository.findAll();
		return users;
	}

}
