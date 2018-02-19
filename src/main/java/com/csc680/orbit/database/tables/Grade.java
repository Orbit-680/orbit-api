/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database.tables;


import com.csc680.orbit.database.Indexes;
import com.csc680.orbit.database.Keys;
import com.csc680.orbit.database.Orbit;
import com.csc680.orbit.database.tables.records.GradeRecord;

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
public class Grade extends TableImpl<GradeRecord> {

    private static final long serialVersionUID = -1783065183;

    /**
     * The reference instance of <code>orbit.grade</code>
     */
    public static final Grade GRADE = new Grade();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GradeRecord> getRecordType() {
        return GradeRecord.class;
    }

    /**
     * The column <code>orbit.grade.ID</code>.
     */
    public final TableField<GradeRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>orbit.grade.Grade</code>.
     */
    public final TableField<GradeRecord, String> GRADE_ = createField("Grade", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.grade.Year</code>.
     */
    public final TableField<GradeRecord, String> YEAR = createField("Year", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.grade.Student_ID</code>.
     */
    public final TableField<GradeRecord, Integer> STUDENT_ID = createField("Student_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>orbit.grade.Course_ID</code>.
     */
    public final TableField<GradeRecord, Integer> COURSE_ID = createField("Course_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>orbit.grade.Assignment_ID</code>.
     */
    public final TableField<GradeRecord, Integer> ASSIGNMENT_ID = createField("Assignment_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>orbit.grade</code> table reference
     */
    public Grade() {
        this(DSL.name("grade"), null);
    }

    /**
     * Create an aliased <code>orbit.grade</code> table reference
     */
    public Grade(String alias) {
        this(DSL.name(alias), GRADE);
    }

    /**
     * Create an aliased <code>orbit.grade</code> table reference
     */
    public Grade(Name alias) {
        this(alias, GRADE);
    }

    private Grade(Name alias, Table<GradeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Grade(Name alias, Table<GradeRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.GRADE_ASSIGNMENT_ID, Indexes.GRADE_COURSE_ID, Indexes.GRADE_PRIMARY, Indexes.GRADE_STUDENT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GradeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GradeRecord> getPrimaryKey() {
        return Keys.KEY_GRADE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GradeRecord>> getKeys() {
        return Arrays.<UniqueKey<GradeRecord>>asList(Keys.KEY_GRADE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<GradeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GradeRecord, ?>>asList(Keys.GRADE_IBFK_1, Keys.GRADE_IBFK_2, Keys.GRADE_IBFK_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Grade as(String alias) {
        return new Grade(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Grade as(Name alias) {
        return new Grade(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Grade rename(String name) {
        return new Grade(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Grade rename(Name name) {
        return new Grade(name, null);
    }
}
