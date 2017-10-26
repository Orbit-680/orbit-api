/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database.tables.records;


import com.csc680.orbit.database.tables.AccountLink;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class AccountLinkRecord extends UpdatableRecordImpl<AccountLinkRecord> implements Record5<Integer, Date, String, Integer, Integer> {

    private static final long serialVersionUID = -1053312640;

    /**
     * Setter for <code>orbit.account_link.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>orbit.account_link.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>orbit.account_link.Date_Linked</code>.
     */
    public void setDateLinked(Date value) {
        set(1, value);
    }

    /**
     * Getter for <code>orbit.account_link.Date_Linked</code>.
     */
    public Date getDateLinked() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>orbit.account_link.Active</code>.
     */
    public void setActive(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>orbit.account_link.Active</code>.
     */
    public String getActive() {
        return (String) get(2);
    }

    /**
     * Setter for <code>orbit.account_link.User_ID</code>.
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>orbit.account_link.User_ID</code>.
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>orbit.account_link.Student_ID</code>.
     */
    public void setStudentId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>orbit.account_link.Student_ID</code>.
     */
    public Integer getStudentId() {
        return (Integer) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Date, String, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Date, String, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AccountLink.ACCOUNT_LINK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field2() {
        return AccountLink.ACCOUNT_LINK.DATE_LINKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AccountLink.ACCOUNT_LINK.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return AccountLink.ACCOUNT_LINK.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return AccountLink.ACCOUNT_LINK.STUDENT_ID;
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
    public Date component2() {
        return getDateLinked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getStudentId();
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
    public Date value2() {
        return getDateLinked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountLinkRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountLinkRecord value2(Date value) {
        setDateLinked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountLinkRecord value3(String value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountLinkRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountLinkRecord value5(Integer value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountLinkRecord values(Integer value1, Date value2, String value3, Integer value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountLinkRecord
     */
    public AccountLinkRecord() {
        super(AccountLink.ACCOUNT_LINK);
    }

    /**
     * Create a detached, initialised AccountLinkRecord
     */
    public AccountLinkRecord(Integer id, Date dateLinked, String active, Integer userId, Integer studentId) {
        super(AccountLink.ACCOUNT_LINK);

        set(0, id);
        set(1, dateLinked);
        set(2, active);
        set(3, userId);
        set(4, studentId);
    }
}