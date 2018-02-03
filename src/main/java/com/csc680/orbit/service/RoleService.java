package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.pojo.Role;

public interface RoleService {
	List<Role> getAllRoles();
	Role getRoleByID(String id);
	Role getUsersRoleByUid(String email);
}
