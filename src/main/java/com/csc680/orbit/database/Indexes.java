/*
 * This file is generated by jOOQ.
*/
package database;


import database.tables.AccountLink;
import database.tables.Assignment;
import database.tables.Course;
import database.tables.Grade;
import database.tables.Message;
import database.tables.Picture;
import database.tables.Schedule;
import database.tables.Student;
import database.tables.Teacher;
import database.tables.User;

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

    public static final Index ACCOUNT_LINK_PRIMARY = Indexes0.ACCOUNT_LINK_PRIMARY;
    public static final Index ACCOUNT_LINK_STUDENT_ID = Indexes0.ACCOUNT_LINK_STUDENT_ID;
    public static final Index ACCOUNT_LINK_USER_ID = Indexes0.ACCOUNT_LINK_USER_ID;
    public static final Index ASSIGNMENT_COURSE_ID = Indexes0.ASSIGNMENT_COURSE_ID;
    public static final Index ASSIGNMENT_PRIMARY = Indexes0.ASSIGNMENT_PRIMARY;
    public static final Index COURSE_PRIMARY = Indexes0.COURSE_PRIMARY;
    public static final Index COURSE_TEACHER_ID = Indexes0.COURSE_TEACHER_ID;
    public static final Index GRADE_COURSE_ID = Indexes0.GRADE_COURSE_ID;
    public static final Index GRADE_PRIMARY = Indexes0.GRADE_PRIMARY;
    public static final Index GRADE_STUDENT_ID = Indexes0.GRADE_STUDENT_ID;
    public static final Index MESSAGE_PRIMARY = Indexes0.MESSAGE_PRIMARY;
    public static final Index MESSAGE_USER_ID = Indexes0.MESSAGE_USER_ID;
    public static final Index PICTURE_PRIMARY = Indexes0.PICTURE_PRIMARY;
    public static final Index PICTURE_STUDENT_ID = Indexes0.PICTURE_STUDENT_ID;
    public static final Index SCHEDULE_COURSE_ID = Indexes0.SCHEDULE_COURSE_ID;
    public static final Index SCHEDULE_PRIMARY = Indexes0.SCHEDULE_PRIMARY;
    public static final Index SCHEDULE_STUDENT_ID = Indexes0.SCHEDULE_STUDENT_ID;
    public static final Index STUDENT_PRIMARY = Indexes0.STUDENT_PRIMARY;
    public static final Index TEACHER_PRIMARY = Indexes0.TEACHER_PRIMARY;
    public static final Index USER_PRIMARY = Indexes0.USER_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index ACCOUNT_LINK_PRIMARY = createIndex("PRIMARY", AccountLink.ACCOUNT_LINK, new OrderField[] { AccountLink.ACCOUNT_LINK.ID }, true);
        public static Index ACCOUNT_LINK_STUDENT_ID = createIndex("Student_ID", AccountLink.ACCOUNT_LINK, new OrderField[] { AccountLink.ACCOUNT_LINK.STUDENT_ID }, false);
        public static Index ACCOUNT_LINK_USER_ID = createIndex("User_ID", AccountLink.ACCOUNT_LINK, new OrderField[] { AccountLink.ACCOUNT_LINK.USER_ID }, false);
        public static Index ASSIGNMENT_COURSE_ID = createIndex("Course_ID", Assignment.ASSIGNMENT, new OrderField[] { Assignment.ASSIGNMENT.COURSE_ID }, false);
        public static Index ASSIGNMENT_PRIMARY = createIndex("PRIMARY", Assignment.ASSIGNMENT, new OrderField[] { Assignment.ASSIGNMENT.ID }, true);
        public static Index COURSE_PRIMARY = createIndex("PRIMARY", Course.COURSE, new OrderField[] { Course.COURSE.ID }, true);
        public static Index COURSE_TEACHER_ID = createIndex("Teacher_ID", Course.COURSE, new OrderField[] { Course.COURSE.TEACHER_ID }, false);
        public static Index GRADE_COURSE_ID = createIndex("Course_ID", Grade.GRADE, new OrderField[] { Grade.GRADE.COURSE_ID }, false);
        public static Index GRADE_PRIMARY = createIndex("PRIMARY", Grade.GRADE, new OrderField[] { Grade.GRADE.ID }, true);
        public static Index GRADE_STUDENT_ID = createIndex("Student_ID", Grade.GRADE, new OrderField[] { Grade.GRADE.STUDENT_ID }, false);
        public static Index MESSAGE_PRIMARY = createIndex("PRIMARY", Message.MESSAGE, new OrderField[] { Message.MESSAGE.ID }, true);
        public static Index MESSAGE_USER_ID = createIndex("User_ID", Message.MESSAGE, new OrderField[] { Message.MESSAGE.USER_ID }, false);
        public static Index PICTURE_PRIMARY = createIndex("PRIMARY", Picture.PICTURE, new OrderField[] { Picture.PICTURE.ID }, true);
        public static Index PICTURE_STUDENT_ID = createIndex("Student_ID", Picture.PICTURE, new OrderField[] { Picture.PICTURE.STUDENT_ID }, false);
        public static Index SCHEDULE_COURSE_ID = createIndex("Course_ID", Schedule.SCHEDULE, new OrderField[] { Schedule.SCHEDULE.COURSE_ID }, false);
        public static Index SCHEDULE_PRIMARY = createIndex("PRIMARY", Schedule.SCHEDULE, new OrderField[] { Schedule.SCHEDULE.ID }, true);
        public static Index SCHEDULE_STUDENT_ID = createIndex("Student_ID", Schedule.SCHEDULE, new OrderField[] { Schedule.SCHEDULE.STUDENT_ID }, false);
        public static Index STUDENT_PRIMARY = createIndex("PRIMARY", Student.STUDENT, new OrderField[] { Student.STUDENT.ID }, true);
        public static Index TEACHER_PRIMARY = createIndex("PRIMARY", Teacher.TEACHER, new OrderField[] { Teacher.TEACHER.ID }, true);
        public static Index USER_PRIMARY = createIndex("PRIMARY", User.USER, new OrderField[] { User.USER.ID }, true);
    }
}
