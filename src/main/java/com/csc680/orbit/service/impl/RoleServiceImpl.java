package com.csc680.orbit.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.model.pojo.Role;
import com.csc680.orbit.model.pojo.User;
import com.csc680.orbit.repository.RoleRepository;
import com.csc680.orbit.service.RoleService;
import com.csc680.orbit.service.UserService;

import javassist.bytecode.stackmap.TypeData.ClassName;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
	
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserService userService;

	@Override
	public List<Role> getAllRoles() {
		LOGGER.info("GetAllRoles service hit");
		List<Role> roles = (List<Role>) roleRepository.findAll();
		return roles;
	}

	@Override
	public Role getRoleByID(String id) {
		Role role = roleRepository.findOne(id);
		return role;
	}
	
	@Override
	public Role getUsersRoleByUid(String uid) {
		User currentUser = userService.getUserByUID(uid);
		Role role = currentUser.getRole();
		return role;
	}
	
	

}
