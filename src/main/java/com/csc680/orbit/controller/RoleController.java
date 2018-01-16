package com.csc680.orbit.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csc680.orbit.model.Role;
import com.csc680.orbit.service.RoleService;
import com.csc680.orbit.utils.Constants;

import javassist.bytecode.stackmap.TypeData.ClassName;

@RestController
public class RoleController {

	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private RoleService roleService;

	public RoleController(RoleService roleService) {
		this.roleService = roleService;
	}

	@RequestMapping(value = "/all-roles", method = RequestMethod.GET)
	public List<Role> allRoles() {
		LOGGER.info("AllRoles controller hit");
		List<Role> roles = roleService.getAllRoles();
		return roles;
	}

	@RequestMapping(value = "/get-role/{id}", method = RequestMethod.GET)
	public Role getRole(@PathVariable("id") String id) {
		LOGGER.info("GetRole controller hit, ID passed: " + id);
		Role role = roleService.getRoleByID(id);
		return role;
	}
	
	@RequestMapping(value = "/has-teacher-role/{uid}", method = RequestMethod.GET)
	public Boolean hasTeacherRole(@PathVariable("uid") String uid) {
		LOGGER.info("Checking to see if user has teacher role.");
		Role role = roleService.getUsersRoleByUid(uid);
		if(role.getName().equalsIgnoreCase(Constants.ROLE_TEACHER)){
			return true;
		}
		return false;
	}
	
	@RequestMapping(value = "/has-student-role/{uid}", method = RequestMethod.GET)
	public Boolean hasStudentRole(@PathVariable("uid") String uid) {
		LOGGER.info("Checking to see if user has student role.");
		Role role = roleService.getUsersRoleByUid(uid);
		if(role.getName().equalsIgnoreCase(Constants.ROLE_STUDENT)){
			return true;
		}
		return false;
	}
	
	@RequestMapping(value = "/has-admin-role/{uid}", method = RequestMethod.GET)
	public Boolean hasAdminRole(@PathVariable("uid") String uid) {
		LOGGER.info("Checking to see if user has admin role.");
		Role role = roleService.getUsersRoleByUid(uid);
		if(role.getName().equalsIgnoreCase(Constants.ROLE_ADMIN)){
			return true;
		}
		return false;
	}
	
	@RequestMapping(value = "/has-parent-role/{uid}", method = RequestMethod.GET)
	public Boolean hasParentRole(@PathVariable("uid") String uid) {
		LOGGER.info("Checking to see if user has parent role.");
		Role role = roleService.getUsersRoleByUid(uid);
		if(role.getName().equalsIgnoreCase(Constants.ROLE_PARENT)){
			return true;
		}
		return false;
	}
}
