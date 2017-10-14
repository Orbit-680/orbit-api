/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database.tables.records;


import com.csc680.orbit.database.tables.Teacher;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class TeacherRecord extends UpdatableRecordImpl<TeacherRecord> implements Record10<Integer, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 220631274;

    /**
     * Setter for <code>orbit.teacher.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>orbit.teacher.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>orbit.teacher.First_Name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>orbit.teacher.First_Name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>orbit.teacher.Last_Name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>orbit.teacher.Last_Name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>orbit.teacher.Date_Of_Birth</code>.
     */
    public void setDateOfBirth(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>orbit.teacher.Date_Of_Birth</code>.
     */
    public String getDateOfBirth() {
        return (String) get(3);
    }

    /**
     * Setter for <code>orbit.teacher.SSN</code>.
     */
    public void setSsn(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>orbit.teacher.SSN</code>.
     */
    public String getSsn() {
        return (String) get(4);
    }

    /**
     * Setter for <code>orbit.teacher.Address_1</code>.
     */
    public void setAddress_1(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>orbit.teacher.Address_1</code>.
     */
    public String getAddress_1() {
        return (String) get(5);
    }

    /**
     * Setter for <code>orbit.teacher.Address_2</code>.
     */
    public void setAddress_2(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>orbit.teacher.Address_2</code>.
     */
    public String getAddress_2() {
        return (String) get(6);
    }

    /**
     * Setter for <code>orbit.teacher.City</code>.
     */
    public void setCity(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>orbit.teacher.City</code>.
     */
    public String getCity() {
        return (String) get(7);
    }

    /**
     * Setter for <code>orbit.teacher.State</code>.
     */
    public void setState(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>orbit.teacher.State</code>.
     */
    public String getState() {
        return (String) get(8);
    }

    /**
     * Setter for <code>orbit.teacher.Zip_Code</code>.
     */
    public void setZipCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>orbit.teacher.Zip_Code</code>.
     */
    public String getZipCode() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Teacher.TEACHER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Teacher.TEACHER.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Teacher.TEACHER.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Teacher.TEACHER.DATE_OF_BIRTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Teacher.TEACHER.SSN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Teacher.TEACHER.ADDRESS_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Teacher.TEACHER.ADDRESS_2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Teacher.TEACHER.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Teacher.TEACHER.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Teacher.TEACHER.ZIP_CODE;
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
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDateOfBirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAddress_1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAddress_2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getZipCode();
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
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDateOfBirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAddress_1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAddress_2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getZipCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherRecord value3(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherRecord value4(String value) {
        setDateOfBirth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherRecord value5(String value) {
        setSsn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherRecord value6(String value) {
        setAddress_1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherRecord value7(String value) {
        setAddress_2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherRecord value8(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherRecord value9(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherRecord value10(String value) {
        setZipCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TeacherRecord
     */
    public TeacherRecord() {
        super(Teacher.TEACHER);
    }

    /**
     * Create a detached, initialised TeacherRecord
     */
    public TeacherRecord(Integer id, String firstName, String lastName, String dateOfBirth, String ssn, String address_1, String address_2, String city, String state, String zipCode) {
        super(Teacher.TEACHER);

        set(0, id);
        set(1, firstName);
        set(2, lastName);
        set(3, dateOfBirth);
        set(4, ssn);
        set(5, address_1);
        set(6, address_2);
        set(7, city);
        set(8, state);
        set(9, zipCode);
    }
}
