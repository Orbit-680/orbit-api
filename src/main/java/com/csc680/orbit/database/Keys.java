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
import database.tables.records.AccountLinkRecord;
import database.tables.records.AssignmentRecord;
import database.tables.records.CourseRecord;
import database.tables.records.GradeRecord;
import database.tables.records.MessageRecord;
import database.tables.records.PictureRecord;
import database.tables.records.ScheduleRecord;
import database.tables.records.StudentRecord;
import database.tables.records.TeacherRecord;
import database.tables.records.UserRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>orbit</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AccountLinkRecord, Integer> IDENTITY_ACCOUNT_LINK = Identities0.IDENTITY_ACCOUNT_LINK;
    public static final Identity<AssignmentRecord, Integer> IDENTITY_ASSIGNMENT = Identities0.IDENTITY_ASSIGNMENT;
    public static final Identity<CourseRecord, Integer> IDENTITY_COURSE = Identities0.IDENTITY_COURSE;
    public static final Identity<GradeRecord, Integer> IDENTITY_GRADE = Identities0.IDENTITY_GRADE;
    public static final Identity<MessageRecord, Integer> IDENTITY_MESSAGE = Identities0.IDENTITY_MESSAGE;
    public static final Identity<PictureRecord, Integer> IDENTITY_PICTURE = Identities0.IDENTITY_PICTURE;
    public static final Identity<ScheduleRecord, Integer> IDENTITY_SCHEDULE = Identities0.IDENTITY_SCHEDULE;
    public static final Identity<StudentRecord, Integer> IDENTITY_STUDENT = Identities0.IDENTITY_STUDENT;
    public static final Identity<TeacherRecord, Integer> IDENTITY_TEACHER = Identities0.IDENTITY_TEACHER;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountLinkRecord> KEY_ACCOUNT_LINK_PRIMARY = UniqueKeys0.KEY_ACCOUNT_LINK_PRIMARY;
    public static final UniqueKey<AssignmentRecord> KEY_ASSIGNMENT_PRIMARY = UniqueKeys0.KEY_ASSIGNMENT_PRIMARY;
    public static final UniqueKey<CourseRecord> KEY_COURSE_PRIMARY = UniqueKeys0.KEY_COURSE_PRIMARY;
    public static final UniqueKey<GradeRecord> KEY_GRADE_PRIMARY = UniqueKeys0.KEY_GRADE_PRIMARY;
    public static final UniqueKey<MessageRecord> KEY_MESSAGE_PRIMARY = UniqueKeys0.KEY_MESSAGE_PRIMARY;
    public static final UniqueKey<PictureRecord> KEY_PICTURE_PRIMARY = UniqueKeys0.KEY_PICTURE_PRIMARY;
    public static final UniqueKey<ScheduleRecord> KEY_SCHEDULE_PRIMARY = UniqueKeys0.KEY_SCHEDULE_PRIMARY;
    public static final UniqueKey<StudentRecord> KEY_STUDENT_PRIMARY = UniqueKeys0.KEY_STUDENT_PRIMARY;
    public static final UniqueKey<TeacherRecord> KEY_TEACHER_PRIMARY = UniqueKeys0.KEY_TEACHER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AccountLinkRecord, UserRecord> ACCOUNT_LINK_IBFK_1 = ForeignKeys0.ACCOUNT_LINK_IBFK_1;
    public static final ForeignKey<AccountLinkRecord, StudentRecord> ACCOUNT_LINK_IBFK_2 = ForeignKeys0.ACCOUNT_LINK_IBFK_2;
    public static final ForeignKey<AssignmentRecord, CourseRecord> ASSIGNMENT_IBFK_1 = ForeignKeys0.ASSIGNMENT_IBFK_1;
    public static final ForeignKey<CourseRecord, TeacherRecord> COURSE_IBFK_1 = ForeignKeys0.COURSE_IBFK_1;
    public static final ForeignKey<GradeRecord, StudentRecord> GRADE_IBFK_1 = ForeignKeys0.GRADE_IBFK_1;
    public static final ForeignKey<GradeRecord, CourseRecord> GRADE_IBFK_2 = ForeignKeys0.GRADE_IBFK_2;
    public static final ForeignKey<MessageRecord, UserRecord> MESSAGE_IBFK_1 = ForeignKeys0.MESSAGE_IBFK_1;
    public static final ForeignKey<PictureRecord, StudentRecord> PICTURE_IBFK_1 = ForeignKeys0.PICTURE_IBFK_1;
    public static final ForeignKey<ScheduleRecord, StudentRecord> SCHEDULE_IBFK_1 = ForeignKeys0.SCHEDULE_IBFK_1;
    public static final ForeignKey<ScheduleRecord, CourseRecord> SCHEDULE_IBFK_2 = ForeignKeys0.SCHEDULE_IBFK_2;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AccountLinkRecord, Integer> IDENTITY_ACCOUNT_LINK = createIdentity(AccountLink.ACCOUNT_LINK, AccountLink.ACCOUNT_LINK.ID);
        public static Identity<AssignmentRecord, Integer> IDENTITY_ASSIGNMENT = createIdentity(Assignment.ASSIGNMENT, Assignment.ASSIGNMENT.ID);
        public static Identity<CourseRecord, Integer> IDENTITY_COURSE = createIdentity(Course.COURSE, Course.COURSE.ID);
        public static Identity<GradeRecord, Integer> IDENTITY_GRADE = createIdentity(Grade.GRADE, Grade.GRADE.ID);
        public static Identity<MessageRecord, Integer> IDENTITY_MESSAGE = createIdentity(Message.MESSAGE, Message.MESSAGE.ID);
        public static Identity<PictureRecord, Integer> IDENTITY_PICTURE = createIdentity(Picture.PICTURE, Picture.PICTURE.ID);
        public static Identity<ScheduleRecord, Integer> IDENTITY_SCHEDULE = createIdentity(Schedule.SCHEDULE, Schedule.SCHEDULE.ID);
        public static Identity<StudentRecord, Integer> IDENTITY_STUDENT = createIdentity(Student.STUDENT, Student.STUDENT.ID);
        public static Identity<TeacherRecord, Integer> IDENTITY_TEACHER = createIdentity(Teacher.TEACHER, Teacher.TEACHER.ID);
        public static Identity<UserRecord, Integer> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AccountLinkRecord> KEY_ACCOUNT_LINK_PRIMARY = createUniqueKey(AccountLink.ACCOUNT_LINK, "KEY_account_link_PRIMARY", AccountLink.ACCOUNT_LINK.ID);
        public static final UniqueKey<AssignmentRecord> KEY_ASSIGNMENT_PRIMARY = createUniqueKey(Assignment.ASSIGNMENT, "KEY_assignment_PRIMARY", Assignment.ASSIGNMENT.ID);
        public static final UniqueKey<CourseRecord> KEY_COURSE_PRIMARY = createUniqueKey(Course.COURSE, "KEY_course_PRIMARY", Course.COURSE.ID);
        public static final UniqueKey<GradeRecord> KEY_GRADE_PRIMARY = createUniqueKey(Grade.GRADE, "KEY_grade_PRIMARY", Grade.GRADE.ID);
        public static final UniqueKey<MessageRecord> KEY_MESSAGE_PRIMARY = createUniqueKey(Message.MESSAGE, "KEY_message_PRIMARY", Message.MESSAGE.ID);
        public static final UniqueKey<PictureRecord> KEY_PICTURE_PRIMARY = createUniqueKey(Picture.PICTURE, "KEY_picture_PRIMARY", Picture.PICTURE.ID);
        public static final UniqueKey<ScheduleRecord> KEY_SCHEDULE_PRIMARY = createUniqueKey(Schedule.SCHEDULE, "KEY_schedule_PRIMARY", Schedule.SCHEDULE.ID);
        public static final UniqueKey<StudentRecord> KEY_STUDENT_PRIMARY = createUniqueKey(Student.STUDENT, "KEY_student_PRIMARY", Student.STUDENT.ID);
        public static final UniqueKey<TeacherRecord> KEY_TEACHER_PRIMARY = createUniqueKey(Teacher.TEACHER, "KEY_teacher_PRIMARY", Teacher.TEACHER.ID);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<AccountLinkRecord, UserRecord> ACCOUNT_LINK_IBFK_1 = createForeignKey(database.Keys.KEY_USER_PRIMARY, AccountLink.ACCOUNT_LINK, "account_link_ibfk_1", AccountLink.ACCOUNT_LINK.USER_ID);
        public static final ForeignKey<AccountLinkRecord, StudentRecord> ACCOUNT_LINK_IBFK_2 = createForeignKey(database.Keys.KEY_STUDENT_PRIMARY, AccountLink.ACCOUNT_LINK, "account_link_ibfk_2", AccountLink.ACCOUNT_LINK.STUDENT_ID);
        public static final ForeignKey<AssignmentRecord, CourseRecord> ASSIGNMENT_IBFK_1 = createForeignKey(database.Keys.KEY_COURSE_PRIMARY, Assignment.ASSIGNMENT, "assignment_ibfk_1", Assignment.ASSIGNMENT.COURSE_ID);
        public static final ForeignKey<CourseRecord, TeacherRecord> COURSE_IBFK_1 = createForeignKey(database.Keys.KEY_TEACHER_PRIMARY, Course.COURSE, "course_ibfk_1", Course.COURSE.TEACHER_ID);
        public static final ForeignKey<GradeRecord, StudentRecord> GRADE_IBFK_1 = createForeignKey(database.Keys.KEY_STUDENT_PRIMARY, Grade.GRADE, "grade_ibfk_1", Grade.GRADE.STUDENT_ID);
        public static final ForeignKey<GradeRecord, CourseRecord> GRADE_IBFK_2 = createForeignKey(database.Keys.KEY_COURSE_PRIMARY, Grade.GRADE, "grade_ibfk_2", Grade.GRADE.COURSE_ID);
        public static final ForeignKey<MessageRecord, UserRecord> MESSAGE_IBFK_1 = createForeignKey(database.Keys.KEY_USER_PRIMARY, Message.MESSAGE, "message_ibfk_1", Message.MESSAGE.USER_ID);
        public static final ForeignKey<PictureRecord, StudentRecord> PICTURE_IBFK_1 = createForeignKey(database.Keys.KEY_STUDENT_PRIMARY, Picture.PICTURE, "picture_ibfk_1", Picture.PICTURE.STUDENT_ID);
        public static final ForeignKey<ScheduleRecord, StudentRecord> SCHEDULE_IBFK_1 = createForeignKey(database.Keys.KEY_STUDENT_PRIMARY, Schedule.SCHEDULE, "schedule_ibfk_1", Schedule.SCHEDULE.STUDENT_ID);
        public static final ForeignKey<ScheduleRecord, CourseRecord> SCHEDULE_IBFK_2 = createForeignKey(database.Keys.KEY_COURSE_PRIMARY, Schedule.SCHEDULE, "schedule_ibfk_2", Schedule.SCHEDULE.COURSE_ID);
    }
}
