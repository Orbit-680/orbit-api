package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.User.USER;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.Role;
import com.csc680.orbit.model.User;

public class UserRecordMapper implements RecordMapper<Record, User>{

	@Override
	public User map(Record r) {
		Role role = new Role(r.getValue(USER.ROLE_ID));
		return new User(
				r.getValue(USER.ID),
				r.getValue(USER.USERNAME),
				r.getValue(USER.UID),
				r.getValue(USER.LAST_LOGIN),
				r.getValue(USER.INVALID_ATTEMPTS),
				r.getValue(USER.ACTIVE),
				role);
	}

}
