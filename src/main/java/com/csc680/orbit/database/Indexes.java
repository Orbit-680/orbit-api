/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database;


import com.csc680.orbit.database.tables.AccountLinkStudent;
import com.csc680.orbit.database.tables.AccountLinkTeacher;
import com.csc680.orbit.database.tables.Assignment;
import com.csc680.orbit.database.tables.Attendance;
import com.csc680.orbit.database.tables.Conduct;
import com.csc680.orbit.database.tables.Course;
import com.csc680.orbit.database.tables.Grade;
import com.csc680.orbit.database.tables.Message;
import com.csc680.orbit.database.tables.Picture;
import com.csc680.orbit.database.tables.Role;
import com.csc680.orbit.database.tables.Schedule;
import com.csc680.orbit.database.tables.School;
import com.csc680.orbit.database.tables.SchoolStudent;
import com.csc680.orbit.database.tables.Student;
import com.csc680.orbit.database.tables.Teacher;
import com.csc680.orbit.database.tables.Tickets;
import com.csc680.orbit.database.tables.User;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling indexes of tables of the <code>orbit</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACCOUNT_LINK_STUDENT_PRIMARY = Indexes0.ACCOUNT_LINK_STUDENT_PRIMARY;
    public static final Index ACCOUNT_LINK_STUDENT_STUDENT_ID = Indexes0.ACCOUNT_LINK_STUDENT_STUDENT_ID;
    public static final Index ACCOUNT_LINK_STUDENT_USER_ID = Indexes0.ACCOUNT_LINK_STUDENT_USER_ID;
    public static final Index ACCOUNT_LINK_TEACHER_ACCOUNT_LINK_TEACHER_IBFK_2 = Indexes0.ACCOUNT_LINK_TEACHER_ACCOUNT_LINK_TEACHER_IBFK_2;
    public static final Index ACCOUNT_LINK_TEACHER_ACCOUNT_LINK_USER_IBFK_1 = Indexes0.ACCOUNT_LINK_TEACHER_ACCOUNT_LINK_USER_IBFK_1;
    public static final Index ACCOUNT_LINK_TEACHER_PRIMARY = Indexes0.ACCOUNT_LINK_TEACHER_PRIMARY;
    public static final Index ASSIGNMENT_COURSE_ID = Indexes0.ASSIGNMENT_COURSE_ID;
    public static final Index ASSIGNMENT_PRIMARY = Indexes0.ASSIGNMENT_PRIMARY;
    public static final Index ATTENDANCE_COURSE_ID = Indexes0.ATTENDANCE_COURSE_ID;
    public static final Index ATTENDANCE_PRIMARY = Indexes0.ATTENDANCE_PRIMARY;
    public static final Index ATTENDANCE_STUDENT_ID = Indexes0.ATTENDANCE_STUDENT_ID;
    public static final Index CONDUCT_COURSE_ID = Indexes0.CONDUCT_COURSE_ID;
    public static final Index CONDUCT_PRIMARY = Indexes0.CONDUCT_PRIMARY;
    public static final Index CONDUCT_STUDENT_ID = Indexes0.CONDUCT_STUDENT_ID;
    public static final Index COURSE_COURSE_IBFK_1 = Indexes0.COURSE_COURSE_IBFK_1;
    public static final Index COURSE_PRIMARY = Indexes0.COURSE_PRIMARY;
    public static final Index GRADE_ASSIGNMENT_ID = Indexes0.GRADE_ASSIGNMENT_ID;
    public static final Index GRADE_COURSE_ID = Indexes0.GRADE_COURSE_ID;
    public static final Index GRADE_PRIMARY = Indexes0.GRADE_PRIMARY;
    public static final Index GRADE_STUDENT_ID = Indexes0.GRADE_STUDENT_ID;
    public static final Index MESSAGE_PRIMARY = Indexes0.MESSAGE_PRIMARY;
    public static final Index MESSAGE_USER_ID = Indexes0.MESSAGE_USER_ID;
    public static final Index PICTURE_PRIMARY = Indexes0.PICTURE_PRIMARY;
    public static final Index PICTURE_STUDENT_ID = Indexes0.PICTURE_STUDENT_ID;
    public static final Index ROLE_PRIMARY = Indexes0.ROLE_PRIMARY;
    public static final Index SCHEDULE_COURSE_ID = Indexes0.SCHEDULE_COURSE_ID;
    public static final Index SCHEDULE_PRIMARY = Indexes0.SCHEDULE_PRIMARY;
    public static final Index SCHEDULE_STUDENT_ID = Indexes0.SCHEDULE_STUDENT_ID;
    public static final Index SCHOOL_PRIMARY = Indexes0.SCHOOL_PRIMARY;
    public static final Index SCHOOL_STUDENT_PRIMARY = Indexes0.SCHOOL_STUDENT_PRIMARY;
    public static final Index SCHOOL_STUDENT_SCHOOL_ID = Indexes0.SCHOOL_STUDENT_SCHOOL_ID;
    public static final Index SCHOOL_STUDENT_STUDENT_ID = Indexes0.SCHOOL_STUDENT_STUDENT_ID;
    public static final Index STUDENT_PRIMARY = Indexes0.STUDENT_PRIMARY;
    public static final Index TEACHER_PRIMARY = Indexes0.TEACHER_PRIMARY;
    public static final Index TICKETS_PRIMARY = Indexes0.TICKETS_PRIMARY;
    public static final Index TICKETS_USER_ID = Indexes0.TICKETS_USER_ID;
    public static final Index USER_PRIMARY = Indexes0.USER_PRIMARY;
    public static final Index USER_ROLE_ID = Indexes0.USER_ROLE_ID;
    public static final Index USER_USERNAME = Indexes0.USER_USERNAME;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index ACCOUNT_LINK_STUDENT_PRIMARY = createIndex("PRIMARY", AccountLinkStudent.ACCOUNT_LINK_STUDENT, new OrderField[] { AccountLinkStudent.ACCOUNT_LINK_STUDENT.ID }, true);
        public static Index ACCOUNT_LINK_STUDENT_STUDENT_ID = createIndex("Student_ID", AccountLinkStudent.ACCOUNT_LINK_STUDENT, new OrderField[] { AccountLinkStudent.ACCOUNT_LINK_STUDENT.STUDENT_ID }, false);
        public static Index ACCOUNT_LINK_STUDENT_USER_ID = createIndex("User_ID", AccountLinkStudent.ACCOUNT_LINK_STUDENT, new OrderField[] { AccountLinkStudent.ACCOUNT_LINK_STUDENT.USER_ID }, false);
        public static Index ACCOUNT_LINK_TEACHER_ACCOUNT_LINK_TEACHER_IBFK_2 = createIndex("account_link_teacher_ibfk_2", AccountLinkTeacher.ACCOUNT_LINK_TEACHER, new OrderField[] { AccountLinkTeacher.ACCOUNT_LINK_TEACHER.TEACHER_ID }, false);
        public static Index ACCOUNT_LINK_TEACHER_ACCOUNT_LINK_USER_IBFK_1 = createIndex("account_link_user_ibfk_1", AccountLinkTeacher.ACCOUNT_LINK_TEACHER, new OrderField[] { AccountLinkTeacher.ACCOUNT_LINK_TEACHER.USER_ID }, false);
        public static Index ACCOUNT_LINK_TEACHER_PRIMARY = createIndex("PRIMARY", AccountLinkTeacher.ACCOUNT_LINK_TEACHER, new OrderField[] { AccountLinkTeacher.ACCOUNT_LINK_TEACHER.ID }, true);
        public static Index ASSIGNMENT_COURSE_ID = createIndex("Course_ID", Assignment.ASSIGNMENT, new OrderField[] { Assignment.ASSIGNMENT.COURSE_ID }, false);
        public static Index ASSIGNMENT_PRIMARY = createIndex("PRIMARY", Assignment.ASSIGNMENT, new OrderField[] { Assignment.ASSIGNMENT.ID }, true);
        public static Index ATTENDANCE_COURSE_ID = createIndex("Course_ID", Attendance.ATTENDANCE, new OrderField[] { Attendance.ATTENDANCE.COURSE_ID }, false);
        public static Index ATTENDANCE_PRIMARY = createIndex("PRIMARY", Attendance.ATTENDANCE, new OrderField[] { Attendance.ATTENDANCE.ID }, true);
        public static Index ATTENDANCE_STUDENT_ID = createIndex("Student_ID", Attendance.ATTENDANCE, new OrderField[] { Attendance.ATTENDANCE.STUDENT_ID }, false);
        public static Index CONDUCT_COURSE_ID = createIndex("Course_ID", Conduct.CONDUCT, new OrderField[] { Conduct.CONDUCT.COURSE_ID }, false);
        public static Index CONDUCT_PRIMARY = createIndex("PRIMARY", Conduct.CONDUCT, new OrderField[] { Conduct.CONDUCT.ID }, true);
        public static Index CONDUCT_STUDENT_ID = createIndex("Student_ID", Conduct.CONDUCT, new OrderField[] { Conduct.CONDUCT.STUDENT_ID }, false);
        public static Index COURSE_COURSE_IBFK_1 = createIndex("course_ibfk_1", Course.COURSE, new OrderField[] { Course.COURSE.TEACHER_ID }, false);
        public static Index COURSE_PRIMARY = createIndex("PRIMARY", Course.COURSE, new OrderField[] { Course.COURSE.ID }, true);
        public static Index GRADE_ASSIGNMENT_ID = createIndex("Assignment_ID", Grade.GRADE, new OrderField[] { Grade.GRADE.ASSIGNMENT_ID }, false);
        public static Index GRADE_COURSE_ID = createIndex("Course_ID", Grade.GRADE, new OrderField[] { Grade.GRADE.COURSE_ID }, false);
        public static Index GRADE_PRIMARY = createIndex("PRIMARY", Grade.GRADE, new OrderField[] { Grade.GRADE.ID }, true);
        public static Index GRADE_STUDENT_ID = createIndex("Student_ID", Grade.GRADE, new OrderField[] { Grade.GRADE.STUDENT_ID }, false);
        public static Index MESSAGE_PRIMARY = createIndex("PRIMARY", Message.MESSAGE, new OrderField[] { Message.MESSAGE.ID }, true);
        public static Index MESSAGE_USER_ID = createIndex("User_ID", Message.MESSAGE, new OrderField[] { Message.MESSAGE.USER_ID }, false);
        public static Index PICTURE_PRIMARY = createIndex("PRIMARY", Picture.PICTURE, new OrderField[] { Picture.PICTURE.ID }, true);
        public static Index PICTURE_STUDENT_ID = createIndex("Student_ID", Picture.PICTURE, new OrderField[] { Picture.PICTURE.STUDENT_ID }, false);
        public static Index ROLE_PRIMARY = createIndex("PRIMARY", Role.ROLE, new OrderField[] { Role.ROLE.ID }, true);
        public static Index SCHEDULE_COURSE_ID = createIndex("Course_ID", Schedule.SCHEDULE, new OrderField[] { Schedule.SCHEDULE.COURSE_ID }, false);
        public static Index SCHEDULE_PRIMARY = createIndex("PRIMARY", Schedule.SCHEDULE, new OrderField[] { Schedule.SCHEDULE.ID }, true);
        public static Index SCHEDULE_STUDENT_ID = createIndex("Student_ID", Schedule.SCHEDULE, new OrderField[] { Schedule.SCHEDULE.STUDENT_ID }, false);
        public static Index SCHOOL_PRIMARY = createIndex("PRIMARY", School.SCHOOL, new OrderField[] { School.SCHOOL.ID }, true);
        public static Index SCHOOL_STUDENT_PRIMARY = createIndex("PRIMARY", SchoolStudent.SCHOOL_STUDENT, new OrderField[] { SchoolStudent.SCHOOL_STUDENT.ID }, true);
        public static Index SCHOOL_STUDENT_SCHOOL_ID = createIndex("School_ID", SchoolStudent.SCHOOL_STUDENT, new OrderField[] { SchoolStudent.SCHOOL_STUDENT.SCHOOL_ID }, false);
        public static Index SCHOOL_STUDENT_STUDENT_ID = createIndex("Student_ID", SchoolStudent.SCHOOL_STUDENT, new OrderField[] { SchoolStudent.SCHOOL_STUDENT.STUDENT_ID }, false);
        public static Index STUDENT_PRIMARY = createIndex("PRIMARY", Student.STUDENT, new OrderField[] { Student.STUDENT.ID }, true);
        public static Index TEACHER_PRIMARY = createIndex("PRIMARY", Teacher.TEACHER, new OrderField[] { Teacher.TEACHER.ID }, true);
        public static Index TICKETS_PRIMARY = createIndex("PRIMARY", Tickets.TICKETS, new OrderField[] { Tickets.TICKETS.ID }, true);
        public static Index TICKETS_USER_ID = createIndex("User_ID", Tickets.TICKETS, new OrderField[] { Tickets.TICKETS.USER_ID }, false);
        public static Index USER_PRIMARY = createIndex("PRIMARY", User.USER, new OrderField[] { User.USER.ID }, true);
        public static Index USER_ROLE_ID = createIndex("Role_ID", User.USER, new OrderField[] { User.USER.ROLE_ID }, false);
        public static Index USER_USERNAME = createIndex("Username", User.USER, new OrderField[] { User.USER.EMAIL }, true);
    }
}
