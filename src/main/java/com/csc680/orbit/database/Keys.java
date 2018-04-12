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
import com.csc680.orbit.database.tables.records.AccountLinkStudentRecord;
import com.csc680.orbit.database.tables.records.AccountLinkTeacherRecord;
import com.csc680.orbit.database.tables.records.AssignmentRecord;
import com.csc680.orbit.database.tables.records.AttendanceRecord;
import com.csc680.orbit.database.tables.records.ConductRecord;
import com.csc680.orbit.database.tables.records.CourseRecord;
import com.csc680.orbit.database.tables.records.GradeRecord;
import com.csc680.orbit.database.tables.records.MessageRecord;
import com.csc680.orbit.database.tables.records.PictureRecord;
import com.csc680.orbit.database.tables.records.RoleRecord;
import com.csc680.orbit.database.tables.records.ScheduleRecord;
import com.csc680.orbit.database.tables.records.SchoolRecord;
import com.csc680.orbit.database.tables.records.SchoolStudentRecord;
import com.csc680.orbit.database.tables.records.StudentRecord;
import com.csc680.orbit.database.tables.records.TeacherRecord;
import com.csc680.orbit.database.tables.records.TicketsRecord;
import com.csc680.orbit.database.tables.records.UserRecord;

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

    public static final Identity<AccountLinkStudentRecord, Integer> IDENTITY_ACCOUNT_LINK_STUDENT = Identities0.IDENTITY_ACCOUNT_LINK_STUDENT;
    public static final Identity<AccountLinkTeacherRecord, Integer> IDENTITY_ACCOUNT_LINK_TEACHER = Identities0.IDENTITY_ACCOUNT_LINK_TEACHER;
    public static final Identity<AssignmentRecord, Integer> IDENTITY_ASSIGNMENT = Identities0.IDENTITY_ASSIGNMENT;
    public static final Identity<AttendanceRecord, Integer> IDENTITY_ATTENDANCE = Identities0.IDENTITY_ATTENDANCE;
    public static final Identity<ConductRecord, Integer> IDENTITY_CONDUCT = Identities0.IDENTITY_CONDUCT;
    public static final Identity<CourseRecord, Integer> IDENTITY_COURSE = Identities0.IDENTITY_COURSE;
    public static final Identity<GradeRecord, Integer> IDENTITY_GRADE = Identities0.IDENTITY_GRADE;
    public static final Identity<MessageRecord, Integer> IDENTITY_MESSAGE = Identities0.IDENTITY_MESSAGE;
    public static final Identity<PictureRecord, Integer> IDENTITY_PICTURE = Identities0.IDENTITY_PICTURE;
    public static final Identity<RoleRecord, Integer> IDENTITY_ROLE = Identities0.IDENTITY_ROLE;
    public static final Identity<ScheduleRecord, Integer> IDENTITY_SCHEDULE = Identities0.IDENTITY_SCHEDULE;
    public static final Identity<SchoolRecord, Integer> IDENTITY_SCHOOL = Identities0.IDENTITY_SCHOOL;
    public static final Identity<SchoolStudentRecord, Integer> IDENTITY_SCHOOL_STUDENT = Identities0.IDENTITY_SCHOOL_STUDENT;
    public static final Identity<StudentRecord, Integer> IDENTITY_STUDENT = Identities0.IDENTITY_STUDENT;
    public static final Identity<TeacherRecord, Integer> IDENTITY_TEACHER = Identities0.IDENTITY_TEACHER;
    public static final Identity<TicketsRecord, Integer> IDENTITY_TICKETS = Identities0.IDENTITY_TICKETS;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountLinkStudentRecord> KEY_ACCOUNT_LINK_STUDENT_PRIMARY = UniqueKeys0.KEY_ACCOUNT_LINK_STUDENT_PRIMARY;
    public static final UniqueKey<AccountLinkTeacherRecord> KEY_ACCOUNT_LINK_TEACHER_PRIMARY = UniqueKeys0.KEY_ACCOUNT_LINK_TEACHER_PRIMARY;
    public static final UniqueKey<AssignmentRecord> KEY_ASSIGNMENT_PRIMARY = UniqueKeys0.KEY_ASSIGNMENT_PRIMARY;
    public static final UniqueKey<AttendanceRecord> KEY_ATTENDANCE_PRIMARY = UniqueKeys0.KEY_ATTENDANCE_PRIMARY;
    public static final UniqueKey<ConductRecord> KEY_CONDUCT_PRIMARY = UniqueKeys0.KEY_CONDUCT_PRIMARY;
    public static final UniqueKey<CourseRecord> KEY_COURSE_PRIMARY = UniqueKeys0.KEY_COURSE_PRIMARY;
    public static final UniqueKey<GradeRecord> KEY_GRADE_PRIMARY = UniqueKeys0.KEY_GRADE_PRIMARY;
    public static final UniqueKey<MessageRecord> KEY_MESSAGE_PRIMARY = UniqueKeys0.KEY_MESSAGE_PRIMARY;
    public static final UniqueKey<PictureRecord> KEY_PICTURE_PRIMARY = UniqueKeys0.KEY_PICTURE_PRIMARY;
    public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = UniqueKeys0.KEY_ROLE_PRIMARY;
    public static final UniqueKey<ScheduleRecord> KEY_SCHEDULE_PRIMARY = UniqueKeys0.KEY_SCHEDULE_PRIMARY;
    public static final UniqueKey<SchoolRecord> KEY_SCHOOL_PRIMARY = UniqueKeys0.KEY_SCHOOL_PRIMARY;
    public static final UniqueKey<SchoolStudentRecord> KEY_SCHOOL_STUDENT_PRIMARY = UniqueKeys0.KEY_SCHOOL_STUDENT_PRIMARY;
    public static final UniqueKey<StudentRecord> KEY_STUDENT_PRIMARY = UniqueKeys0.KEY_STUDENT_PRIMARY;
    public static final UniqueKey<TeacherRecord> KEY_TEACHER_PRIMARY = UniqueKeys0.KEY_TEACHER_PRIMARY;
    public static final UniqueKey<TicketsRecord> KEY_TICKETS_PRIMARY = UniqueKeys0.KEY_TICKETS_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_USERNAME = UniqueKeys0.KEY_USER_USERNAME;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AccountLinkStudentRecord, UserRecord> ACCOUNT_LINK_STUDENT_IBFK_1 = ForeignKeys0.ACCOUNT_LINK_STUDENT_IBFK_1;
    public static final ForeignKey<AccountLinkStudentRecord, StudentRecord> ACCOUNT_LINK_STUDENT_IBFK_2 = ForeignKeys0.ACCOUNT_LINK_STUDENT_IBFK_2;
    public static final ForeignKey<AccountLinkTeacherRecord, UserRecord> ACCOUNT_LINK_USER_IBFK_1 = ForeignKeys0.ACCOUNT_LINK_USER_IBFK_1;
    public static final ForeignKey<AccountLinkTeacherRecord, TeacherRecord> ACCOUNT_LINK_TEACHER_IBFK_2 = ForeignKeys0.ACCOUNT_LINK_TEACHER_IBFK_2;
    public static final ForeignKey<AssignmentRecord, CourseRecord> ASSIGNMENT_IBFK_1 = ForeignKeys0.ASSIGNMENT_IBFK_1;
    public static final ForeignKey<AttendanceRecord, CourseRecord> ATTENDANCE_IBFK_2 = ForeignKeys0.ATTENDANCE_IBFK_2;
    public static final ForeignKey<AttendanceRecord, StudentRecord> ATTENDANCE_IBFK_1 = ForeignKeys0.ATTENDANCE_IBFK_1;
    public static final ForeignKey<ConductRecord, CourseRecord> CONDUCT_IBFK_2 = ForeignKeys0.CONDUCT_IBFK_2;
    public static final ForeignKey<ConductRecord, StudentRecord> CONDUCT_IBFK_1 = ForeignKeys0.CONDUCT_IBFK_1;
    public static final ForeignKey<CourseRecord, TeacherRecord> COURSE_IBFK_1 = ForeignKeys0.COURSE_IBFK_1;
    public static final ForeignKey<GradeRecord, StudentRecord> GRADE_IBFK_1 = ForeignKeys0.GRADE_IBFK_1;
    public static final ForeignKey<GradeRecord, CourseRecord> GRADE_IBFK_2 = ForeignKeys0.GRADE_IBFK_2;
    public static final ForeignKey<GradeRecord, AssignmentRecord> GRADE_IBFK_3 = ForeignKeys0.GRADE_IBFK_3;
    public static final ForeignKey<MessageRecord, UserRecord> MESSAGE_IBFK_1 = ForeignKeys0.MESSAGE_IBFK_1;
    public static final ForeignKey<PictureRecord, StudentRecord> PICTURE_IBFK_1 = ForeignKeys0.PICTURE_IBFK_1;
    public static final ForeignKey<ScheduleRecord, StudentRecord> SCHEDULE_IBFK_1 = ForeignKeys0.SCHEDULE_IBFK_1;
    public static final ForeignKey<ScheduleRecord, CourseRecord> SCHEDULE_IBFK_2 = ForeignKeys0.SCHEDULE_IBFK_2;
    public static final ForeignKey<SchoolStudentRecord, SchoolRecord> SCHOOL_STUDENT_IBFK_1 = ForeignKeys0.SCHOOL_STUDENT_IBFK_1;
    public static final ForeignKey<SchoolStudentRecord, StudentRecord> SCHOOL_STUDENT_IBFK_2 = ForeignKeys0.SCHOOL_STUDENT_IBFK_2;
    public static final ForeignKey<TicketsRecord, UserRecord> TICKETS_IBFK_1 = ForeignKeys0.TICKETS_IBFK_1;
    public static final ForeignKey<UserRecord, RoleRecord> USER_IBFK_1 = ForeignKeys0.USER_IBFK_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AccountLinkStudentRecord, Integer> IDENTITY_ACCOUNT_LINK_STUDENT = createIdentity(AccountLinkStudent.ACCOUNT_LINK_STUDENT, AccountLinkStudent.ACCOUNT_LINK_STUDENT.ID);
        public static Identity<AccountLinkTeacherRecord, Integer> IDENTITY_ACCOUNT_LINK_TEACHER = createIdentity(AccountLinkTeacher.ACCOUNT_LINK_TEACHER, AccountLinkTeacher.ACCOUNT_LINK_TEACHER.ID);
        public static Identity<AssignmentRecord, Integer> IDENTITY_ASSIGNMENT = createIdentity(Assignment.ASSIGNMENT, Assignment.ASSIGNMENT.ID);
        public static Identity<AttendanceRecord, Integer> IDENTITY_ATTENDANCE = createIdentity(Attendance.ATTENDANCE, Attendance.ATTENDANCE.ID);
        public static Identity<ConductRecord, Integer> IDENTITY_CONDUCT = createIdentity(Conduct.CONDUCT, Conduct.CONDUCT.ID);
        public static Identity<CourseRecord, Integer> IDENTITY_COURSE = createIdentity(Course.COURSE, Course.COURSE.ID);
        public static Identity<GradeRecord, Integer> IDENTITY_GRADE = createIdentity(Grade.GRADE, Grade.GRADE.ID);
        public static Identity<MessageRecord, Integer> IDENTITY_MESSAGE = createIdentity(Message.MESSAGE, Message.MESSAGE.ID);
        public static Identity<PictureRecord, Integer> IDENTITY_PICTURE = createIdentity(Picture.PICTURE, Picture.PICTURE.ID);
        public static Identity<RoleRecord, Integer> IDENTITY_ROLE = createIdentity(Role.ROLE, Role.ROLE.ID);
        public static Identity<ScheduleRecord, Integer> IDENTITY_SCHEDULE = createIdentity(Schedule.SCHEDULE, Schedule.SCHEDULE.ID);
        public static Identity<SchoolRecord, Integer> IDENTITY_SCHOOL = createIdentity(School.SCHOOL, School.SCHOOL.ID);
        public static Identity<SchoolStudentRecord, Integer> IDENTITY_SCHOOL_STUDENT = createIdentity(SchoolStudent.SCHOOL_STUDENT, SchoolStudent.SCHOOL_STUDENT.ID);
        public static Identity<StudentRecord, Integer> IDENTITY_STUDENT = createIdentity(Student.STUDENT, Student.STUDENT.ID);
        public static Identity<TeacherRecord, Integer> IDENTITY_TEACHER = createIdentity(Teacher.TEACHER, Teacher.TEACHER.ID);
        public static Identity<TicketsRecord, Integer> IDENTITY_TICKETS = createIdentity(Tickets.TICKETS, Tickets.TICKETS.ID);
        public static Identity<UserRecord, Integer> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AccountLinkStudentRecord> KEY_ACCOUNT_LINK_STUDENT_PRIMARY = createUniqueKey(AccountLinkStudent.ACCOUNT_LINK_STUDENT, "KEY_account_link_student_PRIMARY", AccountLinkStudent.ACCOUNT_LINK_STUDENT.ID);
        public static final UniqueKey<AccountLinkTeacherRecord> KEY_ACCOUNT_LINK_TEACHER_PRIMARY = createUniqueKey(AccountLinkTeacher.ACCOUNT_LINK_TEACHER, "KEY_account_link_teacher_PRIMARY", AccountLinkTeacher.ACCOUNT_LINK_TEACHER.ID);
        public static final UniqueKey<AssignmentRecord> KEY_ASSIGNMENT_PRIMARY = createUniqueKey(Assignment.ASSIGNMENT, "KEY_assignment_PRIMARY", Assignment.ASSIGNMENT.ID);
        public static final UniqueKey<AttendanceRecord> KEY_ATTENDANCE_PRIMARY = createUniqueKey(Attendance.ATTENDANCE, "KEY_attendance_PRIMARY", Attendance.ATTENDANCE.ID);
        public static final UniqueKey<ConductRecord> KEY_CONDUCT_PRIMARY = createUniqueKey(Conduct.CONDUCT, "KEY_conduct_PRIMARY", Conduct.CONDUCT.ID);
        public static final UniqueKey<CourseRecord> KEY_COURSE_PRIMARY = createUniqueKey(Course.COURSE, "KEY_course_PRIMARY", Course.COURSE.ID);
        public static final UniqueKey<GradeRecord> KEY_GRADE_PRIMARY = createUniqueKey(Grade.GRADE, "KEY_grade_PRIMARY", Grade.GRADE.ID);
        public static final UniqueKey<MessageRecord> KEY_MESSAGE_PRIMARY = createUniqueKey(Message.MESSAGE, "KEY_message_PRIMARY", Message.MESSAGE.ID);
        public static final UniqueKey<PictureRecord> KEY_PICTURE_PRIMARY = createUniqueKey(Picture.PICTURE, "KEY_picture_PRIMARY", Picture.PICTURE.ID);
        public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = createUniqueKey(Role.ROLE, "KEY_role_PRIMARY", Role.ROLE.ID);
        public static final UniqueKey<ScheduleRecord> KEY_SCHEDULE_PRIMARY = createUniqueKey(Schedule.SCHEDULE, "KEY_schedule_PRIMARY", Schedule.SCHEDULE.ID);
        public static final UniqueKey<SchoolRecord> KEY_SCHOOL_PRIMARY = createUniqueKey(School.SCHOOL, "KEY_school_PRIMARY", School.SCHOOL.ID);
        public static final UniqueKey<SchoolStudentRecord> KEY_SCHOOL_STUDENT_PRIMARY = createUniqueKey(SchoolStudent.SCHOOL_STUDENT, "KEY_school_student_PRIMARY", SchoolStudent.SCHOOL_STUDENT.ID);
        public static final UniqueKey<StudentRecord> KEY_STUDENT_PRIMARY = createUniqueKey(Student.STUDENT, "KEY_student_PRIMARY", Student.STUDENT.ID);
        public static final UniqueKey<TeacherRecord> KEY_TEACHER_PRIMARY = createUniqueKey(Teacher.TEACHER, "KEY_teacher_PRIMARY", Teacher.TEACHER.ID);
        public static final UniqueKey<TicketsRecord> KEY_TICKETS_PRIMARY = createUniqueKey(Tickets.TICKETS, "KEY_tickets_PRIMARY", Tickets.TICKETS.ID);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
        public static final UniqueKey<UserRecord> KEY_USER_USERNAME = createUniqueKey(User.USER, "KEY_user_Username", User.USER.EMAIL);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<AccountLinkStudentRecord, UserRecord> ACCOUNT_LINK_STUDENT_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_USER_PRIMARY, AccountLinkStudent.ACCOUNT_LINK_STUDENT, "account_link_student_ibfk_1", AccountLinkStudent.ACCOUNT_LINK_STUDENT.USER_ID);
        public static final ForeignKey<AccountLinkStudentRecord, StudentRecord> ACCOUNT_LINK_STUDENT_IBFK_2 = createForeignKey(com.csc680.orbit.database.Keys.KEY_STUDENT_PRIMARY, AccountLinkStudent.ACCOUNT_LINK_STUDENT, "account_link_student_ibfk_2", AccountLinkStudent.ACCOUNT_LINK_STUDENT.STUDENT_ID);
        public static final ForeignKey<AccountLinkTeacherRecord, UserRecord> ACCOUNT_LINK_USER_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_USER_PRIMARY, AccountLinkTeacher.ACCOUNT_LINK_TEACHER, "account_link_user_ibfk_1", AccountLinkTeacher.ACCOUNT_LINK_TEACHER.USER_ID);
        public static final ForeignKey<AccountLinkTeacherRecord, TeacherRecord> ACCOUNT_LINK_TEACHER_IBFK_2 = createForeignKey(com.csc680.orbit.database.Keys.KEY_TEACHER_PRIMARY, AccountLinkTeacher.ACCOUNT_LINK_TEACHER, "account_link_teacher_ibfk_2", AccountLinkTeacher.ACCOUNT_LINK_TEACHER.TEACHER_ID);
        public static final ForeignKey<AssignmentRecord, CourseRecord> ASSIGNMENT_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_COURSE_PRIMARY, Assignment.ASSIGNMENT, "assignment_ibfk_1", Assignment.ASSIGNMENT.COURSE_ID);
        public static final ForeignKey<AttendanceRecord, CourseRecord> ATTENDANCE_IBFK_2 = createForeignKey(com.csc680.orbit.database.Keys.KEY_COURSE_PRIMARY, Attendance.ATTENDANCE, "attendance_ibfk_2", Attendance.ATTENDANCE.COURSE_ID);
        public static final ForeignKey<AttendanceRecord, StudentRecord> ATTENDANCE_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_STUDENT_PRIMARY, Attendance.ATTENDANCE, "attendance_ibfk_1", Attendance.ATTENDANCE.STUDENT_ID);
        public static final ForeignKey<ConductRecord, CourseRecord> CONDUCT_IBFK_2 = createForeignKey(com.csc680.orbit.database.Keys.KEY_COURSE_PRIMARY, Conduct.CONDUCT, "conduct_ibfk_2", Conduct.CONDUCT.COURSE_ID);
        public static final ForeignKey<ConductRecord, StudentRecord> CONDUCT_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_STUDENT_PRIMARY, Conduct.CONDUCT, "conduct_ibfk_1", Conduct.CONDUCT.STUDENT_ID);
        public static final ForeignKey<CourseRecord, TeacherRecord> COURSE_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_TEACHER_PRIMARY, Course.COURSE, "course_ibfk_1", Course.COURSE.TEACHER_ID);
        public static final ForeignKey<GradeRecord, StudentRecord> GRADE_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_STUDENT_PRIMARY, Grade.GRADE, "grade_ibfk_1", Grade.GRADE.STUDENT_ID);
        public static final ForeignKey<GradeRecord, CourseRecord> GRADE_IBFK_2 = createForeignKey(com.csc680.orbit.database.Keys.KEY_COURSE_PRIMARY, Grade.GRADE, "grade_ibfk_2", Grade.GRADE.COURSE_ID);
        public static final ForeignKey<GradeRecord, AssignmentRecord> GRADE_IBFK_3 = createForeignKey(com.csc680.orbit.database.Keys.KEY_ASSIGNMENT_PRIMARY, Grade.GRADE, "grade_ibfk_3", Grade.GRADE.ASSIGNMENT_ID);
        public static final ForeignKey<MessageRecord, UserRecord> MESSAGE_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_USER_PRIMARY, Message.MESSAGE, "message_ibfk_1", Message.MESSAGE.USER_ID);
        public static final ForeignKey<PictureRecord, StudentRecord> PICTURE_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_STUDENT_PRIMARY, Picture.PICTURE, "picture_ibfk_1", Picture.PICTURE.STUDENT_ID);
        public static final ForeignKey<ScheduleRecord, StudentRecord> SCHEDULE_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_STUDENT_PRIMARY, Schedule.SCHEDULE, "schedule_ibfk_1", Schedule.SCHEDULE.STUDENT_ID);
        public static final ForeignKey<ScheduleRecord, CourseRecord> SCHEDULE_IBFK_2 = createForeignKey(com.csc680.orbit.database.Keys.KEY_COURSE_PRIMARY, Schedule.SCHEDULE, "schedule_ibfk_2", Schedule.SCHEDULE.COURSE_ID);
        public static final ForeignKey<SchoolStudentRecord, SchoolRecord> SCHOOL_STUDENT_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_SCHOOL_PRIMARY, SchoolStudent.SCHOOL_STUDENT, "school_student_ibfk_1", SchoolStudent.SCHOOL_STUDENT.SCHOOL_ID);
        public static final ForeignKey<SchoolStudentRecord, StudentRecord> SCHOOL_STUDENT_IBFK_2 = createForeignKey(com.csc680.orbit.database.Keys.KEY_STUDENT_PRIMARY, SchoolStudent.SCHOOL_STUDENT, "school_student_ibfk_2", SchoolStudent.SCHOOL_STUDENT.STUDENT_ID);
        public static final ForeignKey<TicketsRecord, UserRecord> TICKETS_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_USER_PRIMARY, Tickets.TICKETS, "tickets_ibfk_1", Tickets.TICKETS.USER_ID);
        public static final ForeignKey<UserRecord, RoleRecord> USER_IBFK_1 = createForeignKey(com.csc680.orbit.database.Keys.KEY_ROLE_PRIMARY, User.USER, "user_ibfk_1", User.USER.ROLE_ID);
    }
}
