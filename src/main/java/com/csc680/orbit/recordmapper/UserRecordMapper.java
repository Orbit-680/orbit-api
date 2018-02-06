package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.User.USER;
import static com.csc680.orbit.database.tables.Role.ROLE;

import org.jooq.Record;
import org.jooq.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.csc680.orbit.model.pojo.Role;
import com.csc680.orbit.model.pojo.User;
import com.csc680.orbit.repository.RoleRepository;

public class UserRecordMapper implements RecordMapper<Record, User>{
	
	@Autowired
	RoleRepository roleReposityory;
	
	@Override
	public User map(Record r) {
//		String id = r.getValue(USER.ROLE_ID).toString();
//		Role role = roleReposityory.findOne(id);
		// Role role = new Role(r.getValue(USER.ROLE_ID), r.getValue(ROLE.NAME));
		Role role = new Role(r.getValue(USER.ROLE_ID));
		return new User(
				r.getValue(USER.ID),
				r.getValue(USER.EMAIL),
				r.getValue(USER.UID),
				r.getValue(USER.LAST_LOGIN),
				r.getValue(USER.INVALID_ATTEMPTS),
				r.getValue(USER.ACTIVE),
				role);
	}

}
