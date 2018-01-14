package com.csc680.orbit.repository.impl;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import javassist.bytecode.stackmap.TypeData.ClassName;
import static com.csc680.orbit.database.Tables.STUDENT;
import static com.csc680.orbit.database.Tables.ACCOUNT_LINK_STUDENT;
import static com.csc680.orbit.database.Tables.USER;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import com.csc680.orbit.model.AccountLinkStudent;
import com.csc680.orbit.model.AccountLinkStudentDTO;
import com.csc680.orbit.model.Student;
import com.csc680.orbit.model.StudentDTO;
import com.csc680.orbit.model.User;
import com.csc680.orbit.recordmapper.AccountLinkRecordMapper;
import com.csc680.orbit.recordmapper.StudentRecordMapper;
import com.csc680.orbit.recordmapper.UserRecordMapper;
import com.csc680.orbit.service.DBConnection;
import com.csc680.orbit.repository.StudentRepository;


@Repository ("studentRepository")
public class StudentRepositoryImpl implements StudentRepository
{
	DSLContext dslContext = DBConnection.getConnection();
        private static final Logger LOGGER = 
                                    Logger.getLogger(ClassName.class.getName());
	
    @Override
    public long count() 
    {
        
        int studentCount = 0;  
        studentCount = this.dslContext.selectCount()
                             .from(STUDENT)
                             .fetchOne(0, int.class);
        return studentCount;
    }

    @Override
    public void delete(String arg0) 
    {
    	// TODO Auto-generated method stub
    }

    @Override
    public void delete(Student arg0) 
    {
	// TODO Auto-generated method stub
		
    }

    @Override
    public void delete(Iterable<? extends Student> arg0) 
    {
	// TODO Auto-generated method stub
    }

    @Override
    public void deleteAll() 
    {
	// TODO Auto-generated method stub
    }

    @Override
    public boolean exists(String arg0) 
    {	
    	boolean studentExists = false;
    	int studentId = Integer.parseInt(arg0);
        int studentCount = this.dslContext
                                   .selectCount()
                                   .from(STUDENT)
                                   .where(STUDENT.ID.eq(studentId))
                                   .fetchOne(0, int.class);
       
        
        if(studentCount != 0){
        	studentExists = true;
        }
        
        return studentExists;
    }

    @Override
    public Iterable<Student> findAll() 
    {
        List<Student> students = new ArrayList<Student>();
        students = this.dslContext.select(STUDENT.FIRST_NAME,
                                     STUDENT.LAST_NAME,
                                     STUDENT.ID,
                                     STUDENT.DATE_OF_BIRTH,
                                     STUDENT.SSN,
                                     STUDENT.ADDRESS_1,
                                     STUDENT.ADDRESS_2,
                                     STUDENT.CITY,
                                     STUDENT.STATE,
                                     STUDENT.ZIP_CODE,
                                     STUDENT.GRADE,
                                     STUDENT.MOTHER_FIRST_NAME,
                                     STUDENT.MOTHER_LAST_NAME,
                                     STUDENT.MOTHER_SSN,
                                     STUDENT.MOTHER_ADDRESS_1,
                                     STUDENT.MOTHER_ADDRESS_2,
                                     STUDENT.MOTHER_CITY, 
                                     STUDENT.MOTHER_STATE,
                                     STUDENT.MOTHER_ZIP_CODE,
                                     STUDENT.MOTHER_HOME_PHONE,
                                     STUDENT.MOTHER_CELL_PHONE,
                                     STUDENT.MOTHER_EMAIL,
                                     STUDENT.FATHER_FIRST_NAME,
                                     STUDENT.FATHER_LAST_NAME,
                                     STUDENT.FATHER_SSN,
                                     STUDENT.FATHER_ADDRESS_1,
                                     STUDENT.FATHER_ADDRESS_2,
                                     STUDENT.FATHER_CITY, 
                                     STUDENT.FATHER_STATE,
                                     STUDENT.FATHER_ZIP_CODE,
                                     STUDENT.FATHER_HOME_PHONE,
                                     STUDENT.FATHER_CELL_PHONE,
                                     STUDENT.FATHER_EMAIL)
                             .from(STUDENT)
                             .fetch()
                             .map(new StudentRecordMapper());
        return students;

    }

    public Iterable<Student> findAll(Iterable<String> arg0) 
    {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Student findOne(String arg0) 
    {
        List<Student> students = new ArrayList<Student>();
        int studentId = Integer.parseInt(arg0);
        students = this.dslContext.select(STUDENT.FIRST_NAME,
                                     STUDENT.LAST_NAME,
                                     STUDENT.ID,
                                     STUDENT.DATE_OF_BIRTH,
                                     STUDENT.SSN,
                                     STUDENT.ADDRESS_1,
                                     STUDENT.ADDRESS_2,
                                     STUDENT.CITY,
                                     STUDENT.STATE,
                                     STUDENT.ZIP_CODE,
                                     STUDENT.GRADE,
                                     STUDENT.MOTHER_FIRST_NAME,
                                     STUDENT.MOTHER_LAST_NAME,
                                     STUDENT.MOTHER_SSN,
                                     STUDENT.MOTHER_ADDRESS_1,
                                     STUDENT.MOTHER_ADDRESS_2,
                                     STUDENT.MOTHER_CITY, 
                                     STUDENT.MOTHER_STATE,
                                     STUDENT.MOTHER_ZIP_CODE,
                                     STUDENT.MOTHER_HOME_PHONE,
                                     STUDENT.MOTHER_CELL_PHONE,
                                     STUDENT.MOTHER_EMAIL,
                                     STUDENT.FATHER_FIRST_NAME,
                                     STUDENT.FATHER_LAST_NAME,
                                     STUDENT.FATHER_SSN,
                                     STUDENT.FATHER_ADDRESS_1,
                                     STUDENT.FATHER_ADDRESS_2,
                                     STUDENT.FATHER_CITY, 
                                     STUDENT.FATHER_STATE,
                                     STUDENT.FATHER_ZIP_CODE,
                                     STUDENT.FATHER_HOME_PHONE,
                                     STUDENT.FATHER_CELL_PHONE,
                                     STUDENT.FATHER_EMAIL)
                             .from(STUDENT)
                             .where(STUDENT.ID.eq(studentId))
                             .fetch()
                             .map(new StudentRecordMapper());
        return students.get(0);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public <S extends Student> S save(S arg0) 
    {
	// TODO Auto-generated method stub
        String studentFirstName = arg0.getStudentFirstName();
        String studentLastName = arg0.getStudentLastName();
        String studentDateOfBirth = arg0.getStudentDateOfBirth();
        String studentSSN = arg0.getStudentSSN();
        String studentAddress_1 = arg0.getStudentAddress_1();
        String studentAddress_2 = arg0.getStudentAddress_2();
        String studentCity = arg0.getStudentCity();
        String studentState = arg0.getStudentState();
        String studentZipCode = arg0.getStudentZipCode();
        String studentGrade = arg0.getStudentGrade();
        
        String motherFirstName = arg0.getMotherFirstName();
        String motherLastName = arg0.getMotherLastName();
        String motherSSN = arg0.getMotherSSN();
        String motherAddress_1 = arg0.getMotherAddress_1();
        String motherAddress_2 = arg0.getMotherAddress_2();
        String motherCity = arg0.getMotherCity();
        String motherState = arg0.getMotherState();
        String motherZipCode = arg0.getMotherZipCode();
        String motherHomePhone = arg0.getMotherHomePhone();
        String motherCellPhone = arg0.getMotherCellPhone();
        String motherEmail = arg0.getMotherEmail();
        
        String fatherFirstName = arg0.getFatherFirstName();
        String fatherLastName = arg0.getFatherLastName();
        String fatherSSN = arg0.getFatherSSN();
        String fatherAddress_1 = arg0.getFatherAddress_1();
        String fatherAddress_2 = arg0.getFatherAddress_2();
        String fatherCity = arg0.getFatherCity();
        String fatherState = arg0.getFatherState();
        String fatherZipCode = arg0.getFatherZipCode();
        String fatherHomePhone = arg0.getFatherHomePhone();
        String fatherCellPhone = arg0.getFatherCellPhone();
        String fatherEmail = arg0.getFatherEmail();
        
        Student iStudent = this.dslContext.insertInto(STUDENT, 
                                    STUDENT.FIRST_NAME,
                                    STUDENT.LAST_NAME,
                                    STUDENT.DATE_OF_BIRTH,
                                    STUDENT.SSN,
                                    STUDENT.ADDRESS_1,
                                    STUDENT.ADDRESS_2,
                                    STUDENT.CITY,
                                    STUDENT.STATE,
                                    STUDENT.ZIP_CODE,
                                    STUDENT.GRADE,
                                    STUDENT.MOTHER_FIRST_NAME,
                                    STUDENT.MOTHER_LAST_NAME,
                                    STUDENT.MOTHER_SSN,
                                    STUDENT.MOTHER_ADDRESS_1,
                                    STUDENT.MOTHER_ADDRESS_2,
                                    STUDENT.MOTHER_CITY, 
                                    STUDENT.MOTHER_STATE,
                                    STUDENT.MOTHER_ZIP_CODE,
                                    STUDENT.MOTHER_HOME_PHONE,
                                    STUDENT.MOTHER_CELL_PHONE,
                                    STUDENT.MOTHER_EMAIL,
                                    STUDENT.FATHER_FIRST_NAME,
                                    STUDENT.FATHER_LAST_NAME,
                                    STUDENT.FATHER_SSN,
                                    STUDENT.FATHER_ADDRESS_1,
                                    STUDENT.FATHER_ADDRESS_2,
                                    STUDENT.FATHER_CITY, 
                                    STUDENT.FATHER_STATE,
                                    STUDENT.FATHER_ZIP_CODE,
                                    STUDENT.FATHER_HOME_PHONE,
                                    STUDENT.FATHER_CELL_PHONE,
                                    STUDENT.FATHER_EMAIL)
                            .values(studentFirstName, studentLastName, 
                                    studentDateOfBirth, studentSSN, 
                                    studentAddress_1, studentAddress_2, 
                                    studentCity, studentState, studentZipCode,
                                    studentGrade,
                                    motherFirstName, motherLastName, motherSSN,
                                    motherAddress_1, motherAddress_2, 
                                    motherCity, motherState, motherZipCode,
                                    motherHomePhone, motherCellPhone, 
                                    motherEmail,
                                    fatherFirstName, fatherLastName, fatherSSN,
                                    fatherAddress_1, fatherAddress_2, 
                                    fatherCity, fatherState, fatherZipCode,
                                    fatherHomePhone, fatherCellPhone, 
                                    fatherEmail
                                    )
                            .returning(STUDENT.ID)
                            .fetchOne()
                            .map(new StudentRecordMapper());
        
        	Student newStudent = (Student)arg0;
            newStudent.setStudentId(iStudent.getStudentId());
            
	        if(newStudent != null){
	        	   LOGGER.info("Successfully added Student to DB: " + newStudent.toString());
	        }
        return (S)newStudent;
    }

    @Override
    public <S extends Student> Iterable<S> save(Iterable<S> arg0) 
    {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<Student> findById(String id) 
    {
	return null;
    }
    
    @Override
    public Student findStudent(StudentDTO studentDto) 
    {	
                
                List<Student> students = new ArrayList<Student>();
                students = this.dslContext.select(STUDENT.FIRST_NAME,
                                             STUDENT.LAST_NAME,
                                             STUDENT.ID,
                                             STUDENT.DATE_OF_BIRTH,
                                             STUDENT.SSN,
                                             STUDENT.ADDRESS_1,
                                             STUDENT.ADDRESS_2,
                                             STUDENT.CITY,
                                             STUDENT.STATE,
                                             STUDENT.ZIP_CODE,
                                             STUDENT.GRADE,
                                             STUDENT.MOTHER_FIRST_NAME,
                                             STUDENT.MOTHER_LAST_NAME,
                                             STUDENT.MOTHER_SSN,
                                             STUDENT.MOTHER_ADDRESS_1,
                                             STUDENT.MOTHER_ADDRESS_2,
                                             STUDENT.MOTHER_CITY, 
                                             STUDENT.MOTHER_STATE,
                                             STUDENT.MOTHER_ZIP_CODE,
                                             STUDENT.MOTHER_HOME_PHONE,
                                             STUDENT.MOTHER_CELL_PHONE,
                                             STUDENT.MOTHER_EMAIL,
                                             STUDENT.FATHER_FIRST_NAME,
                                             STUDENT.FATHER_LAST_NAME,
                                             STUDENT.FATHER_SSN,
                                             STUDENT.FATHER_ADDRESS_1,
                                             STUDENT.FATHER_ADDRESS_2,
                                             STUDENT.FATHER_CITY, 
                                             STUDENT.FATHER_STATE,
                                             STUDENT.FATHER_ZIP_CODE,
                                             STUDENT.FATHER_HOME_PHONE,
                                             STUDENT.FATHER_CELL_PHONE,
                                             STUDENT.FATHER_EMAIL)
								 .from(STUDENT)
								 .where(STUDENT.LAST_NAME.eq(studentDto.getLastName()))
								 .and(STUDENT.FIRST_NAME.eq(studentDto.getFirstName()))
								 .and(STUDENT.DATE_OF_BIRTH.eq(studentDto.getDateOfBirth()))
								 .and(STUDENT.SSN.eq(studentDto.getStudentSSN()))
								 .fetch()
								 .map(new StudentRecordMapper());
                
                if(students.isEmpty()){
                	return null;
                }
                
                return students.get(0);
                
    }
    
    public AccountLinkStudent linkStudent(AccountLinkStudentDTO accountLinkDto) 
    {    	
    	Calendar currenttime = Calendar.getInstance();
        Date now = new Date((currenttime.getTime()).getTime());
        int userID = 0;
        boolean isDuplicate = false;
        
        //find user ID
        List<User> searchUsers = new ArrayList<User>();
        searchUsers = this.dslContext.select(USER.ID, 
        									USER.ROLE_ID, 
        									USER.EMAIL,
        									USER.UID,
        									USER.LAST_LOGIN, 
        									USER.INVALID_ATTEMPTS, 
        									USER.ACTIVE)
                             .from(USER)
                             .fetch()
                             .map(new UserRecordMapper());
        
        
        if(!searchUsers.isEmpty())
        {
        	userID = searchUsers.get(0).getUserID();
        }    	


        //check for duplicate link records for this user UID and student
        List<AccountLinkStudent> duplicateLinks = new ArrayList<AccountLinkStudent>();
        duplicateLinks = this.dslContext.select(ACCOUNT_LINK_STUDENT.DATE_LINKED, 
				        		ACCOUNT_LINK_STUDENT.ACTIVE,
				        		ACCOUNT_LINK_STUDENT.USER_ID, 
				        		ACCOUNT_LINK_STUDENT.STUDENT_ID)
                             .from(ACCOUNT_LINK_STUDENT)
                             .where(ACCOUNT_LINK_STUDENT.USER_ID.eq(userID))
							 .and(ACCOUNT_LINK_STUDENT.STUDENT_ID.eq(accountLinkDto.getStudentID()))
                             .fetch()
                             .map(new AccountLinkRecordMapper());
        
        
        if(!duplicateLinks.isEmpty())
        	isDuplicate = true;
        
        //if not a duplicate then create link record
        if(!isDuplicate)
        {
	    	AccountLinkStudent account = this.dslContext.insertInto(ACCOUNT_LINK_STUDENT, 
								    			ACCOUNT_LINK_STUDENT.DATE_LINKED,
								    			ACCOUNT_LINK_STUDENT.ACTIVE,
								    			ACCOUNT_LINK_STUDENT.USER_ID,
								    			ACCOUNT_LINK_STUDENT.STUDENT_ID)
								        		.values(now,
								        				"Y",
								        				userID,
								        				accountLinkDto.getStudentID())
								                .returning(ACCOUNT_LINK_STUDENT.ID)
								                .fetchOne()
								                .map(new AccountLinkRecordMapper());
			
			if(account != null){
				account.setMessage("Successfully linked student to user account!");
				LOGGER.info("Successfully linked student to user account: " + account.toString());
			}
			return account;
        }
        else
        {
        	AccountLinkStudent blankAccount = new AccountLinkStudent();
        	blankAccount.setMessage("Account already linked to student.");
        	return blankAccount;
        }
        
        
                
    }
    
    
}
