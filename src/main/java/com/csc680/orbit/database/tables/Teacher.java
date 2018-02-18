/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database.tables;


import com.csc680.orbit.database.Indexes;
import com.csc680.orbit.database.Keys;
import com.csc680.orbit.database.Orbit;
import com.csc680.orbit.database.tables.records.TeacherRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Teacher extends TableImpl<TeacherRecord> {

    private static final long serialVersionUID = 1490615049;

    /**
     * The reference instance of <code>orbit.teacher</code>
     */
    public static final Teacher TEACHER = new Teacher();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TeacherRecord> getRecordType() {
        return TeacherRecord.class;
    }

    /**
     * The column <code>orbit.teacher.ID</code>.
     */
    public final TableField<TeacherRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>orbit.teacher.First_Name</code>.
     */
    public final TableField<TeacherRecord, String> FIRST_NAME = createField("First_Name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.teacher.Last_Name</code>.
     */
    public final TableField<TeacherRecord, String> LAST_NAME = createField("Last_Name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.teacher.Date_Of_Birth</code>.
     */
    public final TableField<TeacherRecord, String> DATE_OF_BIRTH = createField("Date_Of_Birth", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>orbit.teacher.SSN</code>.
     */
    public final TableField<TeacherRecord, String> SSN = createField("SSN", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>orbit.teacher.Address_1</code>.
     */
    public final TableField<TeacherRecord, String> ADDRESS_1 = createField("Address_1", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>orbit.teacher.Address_2</code>.
     */
    public final TableField<TeacherRecord, String> ADDRESS_2 = createField("Address_2", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>orbit.teacher.City</code>.
     */
    public final TableField<TeacherRecord, String> CITY = createField("City", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>orbit.teacher.State</code>.
     */
    public final TableField<TeacherRecord, String> STATE = createField("State", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>orbit.teacher.Zip_Code</code>.
     */
    public final TableField<TeacherRecord, String> ZIP_CODE = createField("Zip_Code", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * Create a <code>orbit.teacher</code> table reference
     */
    public Teacher() {
        this(DSL.name("teacher"), null);
    }

    /**
     * Create an aliased <code>orbit.teacher</code> table reference
     */
    public Teacher(String alias) {
        this(DSL.name(alias), TEACHER);
    }

    /**
     * Create an aliased <code>orbit.teacher</code> table reference
     */
    public Teacher(Name alias) {
        this(alias, TEACHER);
    }

    private Teacher(Name alias, Table<TeacherRecord> aliased) {
        this(alias, aliased, null);
    }

    private Teacher(Name alias, Table<TeacherRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Orbit.ORBIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TEACHER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TeacherRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TEACHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TeacherRecord> getPrimaryKey() {
        return Keys.KEY_TEACHER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TeacherRecord>> getKeys() {
        return Arrays.<UniqueKey<TeacherRecord>>asList(Keys.KEY_TEACHER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Teacher as(String alias) {
        return new Teacher(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Teacher as(Name alias) {
        return new Teacher(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Teacher rename(String name) {
        return new Teacher(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Teacher rename(Name name) {
        return new Teacher(name, null);
    }
}
