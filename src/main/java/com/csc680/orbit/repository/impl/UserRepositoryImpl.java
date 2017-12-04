package com.csc680.orbit.repository.impl;

import static com.csc680.orbit.database.Tables.USER;

import java.sql.Date;
import java.util.logging.Logger;

import org.jooq.DSLContext;

import com.csc680.orbit.model.Role;
import com.csc680.orbit.model.User;
import com.csc680.orbit.recordmapper.UserRecordMapper;
import com.csc680.orbit.repository.UserRepository;
import com.csc680.orbit.service.DBConnection;
import javassist.bytecode.stackmap.TypeData.ClassName;

public class UserRepositoryImpl implements UserRepository {

	DSLContext dslContext = DBConnection.getConnection();
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@SuppressWarnings("unchecked")
	@Override
	public <S extends User> S save(S user) {
		String username = user.getUsername();
		String uid = user.getUid();
		Date lastLogin = user.getLastLogin();
		int invalidAttempts = user.getInvalidAttempts();
		String active = user.isActive();
		Role role = user.getRole();
		
		User inUser = this.dslContext.insertInto(USER,
						USER.USERNAME,
						USER.UID,
						USER.LAST_LOGIN,
						USER.INVALID_ATTEMPTS,
						USER.ACTIVE,
						USER.ROLE_ID)
						.values(username, uid, lastLogin, invalidAttempts, active, role.getRoleID())
						.returning(USER.ID, USER.USERNAME, USER.UID, USER.LAST_LOGIN, USER.INVALID_ATTEMPTS, USER.ACTIVE, USER.ROLE_ID)
						.fetchOne()
						.map(new UserRecordMapper());
		
        User newUser = (User)user;
        newUser.setUserID(inUser.getUserID());
        if(newUser != null){
        	   LOGGER.info("Successfully added User to DB: " + newUser.toString());
        }
        
		return (S)newUser;
	}

	@Override
	public <S extends User> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<User> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
