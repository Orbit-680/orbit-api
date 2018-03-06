package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.User.USER;
import static com.csc680.orbit.database.tables.Role.ROLE;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.pojo.Role;
import com.csc680.orbit.model.pojo.User;

public class UserRecordMapper implements RecordMapper<Record, User>{
	
	
	@Override
	public User map(Record r) {
		Role role = null;
		try{
			role = new Role(r.getValue(USER.ROLE_ID), r.getValue(ROLE.NAME));
		}
		catch (Exception e){
			role = new Role(r.getValue(USER.ROLE_ID));
		}

		return new User(
				r.getValue(USER.ID),
				r.getValue(USER.EMAIL),
				r.getValue(USER.UID),
				r.getValue(USER.LAST_LOGIN),
				r.getValue(USER.INVALID_ATTEMPTS),
				r.getValue(USER.ACTIVE),
				role,
				r.getValue(USER.FIRST_NAME),
				r.getValue(USER.LAST_NAME));
	}

}
