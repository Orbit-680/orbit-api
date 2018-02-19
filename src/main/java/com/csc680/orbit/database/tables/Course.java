/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database.tables;


import com.csc680.orbit.database.Indexes;
import com.csc680.orbit.database.Keys;
import com.csc680.orbit.database.Orbit;
import com.csc680.orbit.database.tables.records.CourseRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Course extends TableImpl<CourseRecord> {

    private static final long serialVersionUID = -193162422;

    /**
     * The reference instance of <code>orbit.course</code>
     */
    public static final Course COURSE = new Course();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CourseRecord> getRecordType() {
        return CourseRecord.class;
    }

    /**
     * The column <code>orbit.course.ID</code>.
     */
    public final TableField<CourseRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>orbit.course.Year</code>.
     */
    public final TableField<CourseRecord, String> YEAR = createField("Year", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.course.Name</code>.
     */
    public final TableField<CourseRecord, String> NAME = createField("Name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.course.Teacher_ID</code>.
     */
    public final TableField<CourseRecord, Integer> TEACHER_ID = createField("Teacher_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>orbit.course</code> table reference
     */
    public Course() {
        this(DSL.name("course"), null);
    }

    /**
     * Create an aliased <code>orbit.course</code> table reference
     */
    public Course(String alias) {
        this(DSL.name(alias), COURSE);
    }

    /**
     * Create an aliased <code>orbit.course</code> table reference
     */
    public Course(Name alias) {
        this(alias, COURSE);
    }

    private Course(Name alias, Table<CourseRecord> aliased) {
        this(alias, aliased, null);
    }

    private Course(Name alias, Table<CourseRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.COURSE_COURSE_IBFK_1, Indexes.COURSE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CourseRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COURSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CourseRecord> getPrimaryKey() {
        return Keys.KEY_COURSE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CourseRecord>> getKeys() {
        return Arrays.<UniqueKey<CourseRecord>>asList(Keys.KEY_COURSE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CourseRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CourseRecord, ?>>asList(Keys.COURSE_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Course as(String alias) {
        return new Course(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Course as(Name alias) {
        return new Course(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Course rename(String name) {
        return new Course(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Course rename(Name name) {
        return new Course(name, null);
    }
}
