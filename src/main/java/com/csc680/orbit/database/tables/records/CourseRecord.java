/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database.tables.records;


import com.csc680.orbit.database.tables.Course;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class CourseRecord extends UpdatableRecordImpl<CourseRecord> implements Record4<Integer, String, String, Integer> {

    private static final long serialVersionUID = -1096792621;

    /**
     * Setter for <code>orbit.course.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>orbit.course.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>orbit.course.Year</code>.
     */
    public void setYear(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>orbit.course.Year</code>.
     */
    public String getYear() {
        return (String) get(1);
    }

    /**
     * Setter for <code>orbit.course.Name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>orbit.course.Name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>orbit.course.Teacher_ID</code>.
     */
    public void setTeacherId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>orbit.course.Teacher_ID</code>.
     */
    public Integer getTeacherId() {
        return (Integer) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Course.COURSE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Course.COURSE.YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Course.COURSE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Course.COURSE.TEACHER_ID;
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
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getTeacherId();
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
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getTeacherId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value2(String value) {
        setYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value4(Integer value) {
        setTeacherId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord values(Integer value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CourseRecord
     */
    public CourseRecord() {
        super(Course.COURSE);
    }

    /**
     * Create a detached, initialised CourseRecord
     */
    public CourseRecord(Integer id, String year, String name, Integer teacherId) {
        super(Course.COURSE);

        set(0, id);
        set(1, year);
        set(2, name);
        set(3, teacherId);
    }
}
