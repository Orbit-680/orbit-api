package com.csc680.orbit.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csc680.orbit.exceptions.BadRequestException;
import com.csc680.orbit.model.dto.AssignCourseToTeacherDTO;
import com.csc680.orbit.model.dto.ResponseStatusDTO;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.service.CourseService;
import com.csc680.orbit.utils.Constants;

import javassist.bytecode.stackmap.TypeData.ClassName;

@RestController
public class CourseController {

	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private CourseService courseService;

	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}

	@RequestMapping(value = "/all-courses", method = RequestMethod.GET)
	public List<Course> allCourses() {
		LOGGER.info("AllCourses controller hit");
		List<Course> courses = courseService.getAllCourses();		
		return courses;
	}

	@RequestMapping(value = "/get-course/{id}", method = RequestMethod.GET)
	public Course getCourse(@PathVariable("id") String id) {
		LOGGER.info("GetCourse ontroller hit, ID passed: " + id);
		Course course = courseService.getCourseByID(id);
		return course;
	}
	
	@RequestMapping(value = "/get-courses-by-teacher-id/{teacherId}", method = RequestMethod.GET)
	public List<Course> getCoursesByTeacherId(@PathVariable("teacherId") String teacherId) {
		LOGGER.info("GetCourses where teacher id is " + teacherId);
		List<Course> courses = courseService.getCoursesByTeacherId(teacherId);
		LOGGER.info("Here are the courses found " + courses);
		return courses;
	}
	
	@RequestMapping(value = "/assign-course-to-teacher/{teacherId}", method = RequestMethod.POST)
	public ResponseStatusDTO assignCoursesToTeacher(@RequestBody AssignCourseToTeacherDTO assignDTO, @PathVariable("teacherId") String teacherId) {
		LOGGER.info("Assigning courses to teacher endpoint hit. ");
		String status = courseService.assignCoursesToTeacher(assignDTO.getCourseList(), teacherId);
		if(status.equals(Constants.SUCCESS_STATUS)){
			LOGGER.info("Successfully assigned teacher to courses. ");
			return new ResponseStatusDTO(true);	
		}
		throw new BadRequestException("Something went wrong trying to assign teacher to a course.");
	}
	
}
