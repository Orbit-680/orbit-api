/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database.tables;


import com.csc680.orbit.database.Indexes;
import com.csc680.orbit.database.Keys;
import com.csc680.orbit.database.Orbit;
import com.csc680.orbit.database.tables.records.RoleRecord;

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
public class Role extends TableImpl<RoleRecord> {

    private static final long serialVersionUID = 1559000087;

    /**
     * The reference instance of <code>orbit.role</code>
     */
    public static final Role ROLE = new Role();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleRecord> getRecordType() {
        return RoleRecord.class;
    }

    /**
     * The column <code>orbit.role.ID</code>.
     */
    public final TableField<RoleRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>orbit.role.Name</code>.
     */
    public final TableField<RoleRecord, String> NAME = createField("Name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * Create a <code>orbit.role</code> table reference
     */
    public Role() {
        this(DSL.name("role"), null);
    }

    /**
     * Create an aliased <code>orbit.role</code> table reference
     */
    public Role(String alias) {
        this(DSL.name(alias), ROLE);
    }

    /**
     * Create an aliased <code>orbit.role</code> table reference
     */
    public Role(Name alias) {
        this(alias, ROLE);
    }

    private Role(Name alias, Table<RoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Role(Name alias, Table<RoleRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RoleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RoleRecord> getPrimaryKey() {
        return Keys.KEY_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RoleRecord>> getKeys() {
        return Arrays.<UniqueKey<RoleRecord>>asList(Keys.KEY_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Role as(String alias) {
        return new Role(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Role as(Name alias) {
        return new Role(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Role rename(String name) {
        return new Role(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Role rename(Name name) {
        return new Role(name, null);
    }
}
