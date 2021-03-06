/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database.tables.records;


import com.csc680.orbit.database.tables.Grade;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class GradeRecord extends UpdatableRecordImpl<GradeRecord> implements Record6<Integer, String, String, Integer, Integer, Integer> {

    private static final long serialVersionUID = 707284826;

    /**
     * Setter for <code>orbit.grade.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>orbit.grade.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>orbit.grade.Grade</code>.
     */
    public void setGrade(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>orbit.grade.Grade</code>.
     */
    public String getGrade() {
        return (String) get(1);
    }

    /**
     * Setter for <code>orbit.grade.Year</code>.
     */
    public void setYear(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>orbit.grade.Year</code>.
     */
    public String getYear() {
        return (String) get(2);
    }

    /**
     * Setter for <code>orbit.grade.Student_ID</code>.
     */
    public void setStudentId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>orbit.grade.Student_ID</code>.
     */
    public Integer getStudentId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>orbit.grade.Course_ID</code>.
     */
    public void setCourseId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>orbit.grade.Course_ID</code>.
     */
    public Integer getCourseId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>orbit.grade.Assignment_ID</code>.
     */
    public void setAssignmentId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>orbit.grade.Assignment_ID</code>.
     */
    public Integer getAssignmentId() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Integer, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Integer, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Grade.GRADE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Grade.GRADE.GRADE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Grade.GRADE.YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Grade.GRADE.STUDENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Grade.GRADE.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Grade.GRADE.ASSIGNMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getAssignmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getAssignmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GradeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GradeRecord value2(String value) {
        setGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GradeRecord value3(String value) {
        setYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GradeRecord value4(Integer value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GradeRecord value5(Integer value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GradeRecord value6(Integer value) {
        setAssignmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GradeRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GradeRecord
     */
    public GradeRecord() {
        super(Grade.GRADE);
    }

    /**
     * Create a detached, initialised GradeRecord
     */
    public GradeRecord(Integer id, String grade, String year, Integer studentId, Integer courseId, Integer assignmentId) {
        super(Grade.GRADE);

        set(0, id);
        set(1, grade);
        set(2, year);
        set(3, studentId);
        set(4, courseId);
        set(5, assignmentId);
    }
}
