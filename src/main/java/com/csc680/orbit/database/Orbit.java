/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database;


import com.csc680.orbit.database.tables.AccountLink;
import com.csc680.orbit.database.tables.Assignment;
import com.csc680.orbit.database.tables.Course;
import com.csc680.orbit.database.tables.Grade;
import com.csc680.orbit.database.tables.Message;
import com.csc680.orbit.database.tables.Picture;
import com.csc680.orbit.database.tables.Schedule;
import com.csc680.orbit.database.tables.School;
import com.csc680.orbit.database.tables.SchoolStudent;
import com.csc680.orbit.database.tables.Student;
import com.csc680.orbit.database.tables.Teacher;
import com.csc680.orbit.database.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Orbit extends SchemaImpl {

    private static final long serialVersionUID = 746742383;

    /**
     * The reference instance of <code>orbit</code>
     */
    public static final Orbit ORBIT = new Orbit();

    /**
     * The table <code>orbit.account_link</code>.
     */
    public final AccountLink ACCOUNT_LINK = com.csc680.orbit.database.tables.AccountLink.ACCOUNT_LINK;

    /**
     * The table <code>orbit.assignment</code>.
     */
    public final Assignment ASSIGNMENT = com.csc680.orbit.database.tables.Assignment.ASSIGNMENT;

    /**
     * The table <code>orbit.course</code>.
     */
    public final Course COURSE = com.csc680.orbit.database.tables.Course.COURSE;

    /**
     * The table <code>orbit.grade</code>.
     */
    public final Grade GRADE = com.csc680.orbit.database.tables.Grade.GRADE;

    /**
     * The table <code>orbit.message</code>.
     */
    public final Message MESSAGE = com.csc680.orbit.database.tables.Message.MESSAGE;

    /**
     * The table <code>orbit.picture</code>.
     */
    public final Picture PICTURE = com.csc680.orbit.database.tables.Picture.PICTURE;

    /**
     * The table <code>orbit.schedule</code>.
     */
    public final Schedule SCHEDULE = com.csc680.orbit.database.tables.Schedule.SCHEDULE;

    /**
     * The table <code>orbit.school</code>.
     */
    public final School SCHOOL = com.csc680.orbit.database.tables.School.SCHOOL;

    /**
     * The table <code>orbit.school_student</code>.
     */
    public final SchoolStudent SCHOOL_STUDENT = com.csc680.orbit.database.tables.SchoolStudent.SCHOOL_STUDENT;

    /**
     * The table <code>orbit.student</code>.
     */
    public final Student STUDENT = com.csc680.orbit.database.tables.Student.STUDENT;

    /**
     * The table <code>orbit.teacher</code>.
     */
    public final Teacher TEACHER = com.csc680.orbit.database.tables.Teacher.TEACHER;

    /**
     * The table <code>orbit.user</code>.
     */
    public final User USER = com.csc680.orbit.database.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Orbit() {
        super("orbit", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            AccountLink.ACCOUNT_LINK,
            Assignment.ASSIGNMENT,
            Course.COURSE,
            Grade.GRADE,
            Message.MESSAGE,
            Picture.PICTURE,
            Schedule.SCHEDULE,
            School.SCHOOL,
            SchoolStudent.SCHOOL_STUDENT,
            Student.STUDENT,
            Teacher.TEACHER,
            User.USER);
    }
}
