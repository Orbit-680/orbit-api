package com.csc680.orbit.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;

import static com.csc680.orbit.database.tables.Role.ROLE;

import com.csc680.orbit.model.Role;
import com.csc680.orbit.recordmapper.RoleRecordMapper;
import com.csc680.orbit.repository.RoleRepository;
import com.csc680.orbit.service.DBConnection;

public class RoleRepositoryImpl implements RoleRepository {
	
	DSLContext dslContext = DBConnection.getConnection();

	@Override
	public <S extends Role> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Role> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role findOne(String id) {
		List<Role> roles = new ArrayList<Role>();
		int roleId = Integer.parseInt(id);
		roles = this.dslContext.select(
				ROLE.ID,
				ROLE.NAME)
				.from(ROLE)
				.where(ROLE.ID.eq(roleId))
				.fetch()
				.map(new RoleRecordMapper());
		return roles.get(0);
	}

	@Override
	public boolean exists(String id) {
		boolean roleExists = false;
		int roleID = Integer.parseInt(id);
		int roleCount = this.dslContext
				.selectCount()
				.from(ROLE)
				.where(ROLE.ID.eq(roleID))
				.fetchOne(0, int.class);
		
		if (roleCount != 0) {
			roleExists = true;
		}
		
		return roleExists;
	}

	@Override
	public Iterable<Role> findAll() {
		List<Role> roles = new ArrayList<Role>();
		roles = this.dslContext.select(
				ROLE.ID,
				ROLE.NAME)
				.from(ROLE)
				.fetch()
				.map(new RoleRecordMapper());
		return roles;
	}

	@Override
	public Iterable<Role> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		int roleCount = 0;
		roleCount = this.dslContext
				.selectCount()
				.from(ROLE)
				.fetchOne(0, int.class);
		return roleCount;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Role entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Role> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
