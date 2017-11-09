package com.csc680.orbit.recordmapper;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.Role;
import static com.csc680.orbit.database.tables.Role.ROLE;

public class RoleRecordMapper implements RecordMapper<Record, Role> {

	@Override
	public Role map(Record r) {
		return new Role(r.getValue(ROLE.ID), r.getValue(ROLE.NAME));
	}

}
