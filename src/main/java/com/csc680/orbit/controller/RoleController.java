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
}
