/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database.tables;


import com.csc680.orbit.database.Indexes;
import com.csc680.orbit.database.Keys;
import com.csc680.orbit.database.Orbit;
import com.csc680.orbit.database.tables.records.ConductRecord;

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
public class Conduct extends TableImpl<ConductRecord> {

    private static final long serialVersionUID = 369367162;

    /**
     * The reference instance of <code>orbit.conduct</code>
     */
    public static final Conduct CONDUCT = new Conduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConductRecord> getRecordType() {
        return ConductRecord.class;
    }

    /**
     * The column <code>orbit.conduct.ID</code>.
     */
    public final TableField<ConductRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>orbit.conduct.Year</code>.
     */
    public final TableField<ConductRecord, String> YEAR = createField("Year", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.conduct.Date</code>.
     */
    public final TableField<ConductRecord, Date> DATE = createField("Date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>orbit.conduct.Score</code>.
     */
    public final TableField<ConductRecord, Integer> SCORE = createField("Score", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>orbit.conduct.Comment</code>.
     */
    public final TableField<ConductRecord, String> COMMENT = createField("Comment", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>orbit.conduct.Course_ID</code>.
     */
    public final TableField<ConductRecord, Integer> COURSE_ID = createField("Course_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>orbit.conduct.Student_ID</code>.
     */
    public final TableField<ConductRecord, Integer> STUDENT_ID = createField("Student_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>orbit.conduct</code> table reference
     */
    public Conduct() {
        this(DSL.name("conduct"), null);
    }

    /**
     * Create an aliased <code>orbit.conduct</code> table reference
     */
    public Conduct(String alias) {
        this(DSL.name(alias), CONDUCT);
    }

    /**
     * Create an aliased <code>orbit.conduct</code> table reference
     */
    public Conduct(Name alias) {
        this(alias, CONDUCT);
    }

    private Conduct(Name alias, Table<ConductRecord> aliased) {
        this(alias, aliased, null);
    }

    private Conduct(Name alias, Table<ConductRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CONDUCT_COURSE_ID, Indexes.CONDUCT_PRIMARY, Indexes.CONDUCT_STUDENT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ConductRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CONDUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ConductRecord> getPrimaryKey() {
        return Keys.KEY_CONDUCT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ConductRecord>> getKeys() {
        return Arrays.<UniqueKey<ConductRecord>>asList(Keys.KEY_CONDUCT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ConductRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ConductRecord, ?>>asList(Keys.CONDUCT_IBFK_2, Keys.CONDUCT_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Conduct as(String alias) {
        return new Conduct(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Conduct as(Name alias) {
        return new Conduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Conduct rename(String name) {
        return new Conduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Conduct rename(Name name) {
        return new Conduct(name, null);
    }
}
