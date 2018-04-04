/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database.tables;


import com.csc680.orbit.database.Indexes;
import com.csc680.orbit.database.Keys;
import com.csc680.orbit.database.Orbit;
import com.csc680.orbit.database.tables.records.AttendanceRecord;

import java.sql.Date;
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
public class Attendance extends TableImpl<AttendanceRecord> {

    private static final long serialVersionUID = 625915632;

    /**
     * The reference instance of <code>orbit.attendance</code>
     */
    public static final Attendance ATTENDANCE = new Attendance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttendanceRecord> getRecordType() {
        return AttendanceRecord.class;
    }

    /**
     * The column <code>orbit.attendance.ID</code>.
     */
    public final TableField<AttendanceRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>orbit.attendance.Year</code>.
     */
    public final TableField<AttendanceRecord, String> YEAR = createField("Year", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.attendance.Date</code>.
     */
    public final TableField<AttendanceRecord, Date> DATE = createField("Date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>orbit.attendance.Status</code>.
     */
    public final TableField<AttendanceRecord, String> STATUS = createField("Status", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>orbit.attendance.Comment</code>.
     */
    public final TableField<AttendanceRecord, String> COMMENT = createField("Comment", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>orbit.attendance.Course_ID</code>.
     */
    public final TableField<AttendanceRecord, Integer> COURSE_ID = createField("Course_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>orbit.attendance.Student_ID</code>.
     */
    public final TableField<AttendanceRecord, Integer> STUDENT_ID = createField("Student_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>orbit.attendance</code> table reference
     */
    public Attendance() {
        this(DSL.name("attendance"), null);
    }

    /**
     * Create an aliased <code>orbit.attendance</code> table reference
     */
    public Attendance(String alias) {
        this(DSL.name(alias), ATTENDANCE);
    }

    /**
     * Create an aliased <code>orbit.attendance</code> table reference
     */
    public Attendance(Name alias) {
        this(alias, ATTENDANCE);
    }

    private Attendance(Name alias, Table<AttendanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Attendance(Name alias, Table<AttendanceRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ATTENDANCE_COURSE_ID, Indexes.ATTENDANCE_PRIMARY, Indexes.ATTENDANCE_STUDENT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AttendanceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ATTENDANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AttendanceRecord> getPrimaryKey() {
        return Keys.KEY_ATTENDANCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AttendanceRecord>> getKeys() {
        return Arrays.<UniqueKey<AttendanceRecord>>asList(Keys.KEY_ATTENDANCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AttendanceRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AttendanceRecord, ?>>asList(Keys.ATTENDANCE_IBFK_2, Keys.ATTENDANCE_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Attendance as(String alias) {
        return new Attendance(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Attendance as(Name alias) {
        return new Attendance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Attendance rename(String name) {
        return new Attendance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Attendance rename(Name name) {
        return new Attendance(name, null);
    }
}
