/*
 * This file is generated by jOOQ.
*/
package database.tables;


import database.Indexes;
import database.Keys;
import database.Orbit;
import database.tables.records.AccountLinkRecord;

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
public class AccountLink extends TableImpl<AccountLinkRecord> {

    private static final long serialVersionUID = -588234572;

    /**
     * The reference instance of <code>orbit.account_link</code>
     */
    public static final AccountLink ACCOUNT_LINK = new AccountLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountLinkRecord> getRecordType() {
        return AccountLinkRecord.class;
    }

    /**
     * The column <code>orbit.account_link.ID</code>.
     */
    public final TableField<AccountLinkRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>orbit.account_link.Date_Linked</code>.
     */
    public final TableField<AccountLinkRecord, Date> DATE_LINKED = createField("Date_Linked", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>orbit.account_link.Active</code>.
     */
    public final TableField<AccountLinkRecord, String> ACTIVE = createField("Active", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.account_link.User_ID</code>.
     */
    public final TableField<AccountLinkRecord, Integer> USER_ID = createField("User_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>orbit.account_link.Student_ID</code>.
     */
    public final TableField<AccountLinkRecord, Integer> STUDENT_ID = createField("Student_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>orbit.account_link</code> table reference
     */
    public AccountLink() {
        this(DSL.name("account_link"), null);
    }

    /**
     * Create an aliased <code>orbit.account_link</code> table reference
     */
    public AccountLink(String alias) {
        this(DSL.name(alias), ACCOUNT_LINK);
    }

    /**
     * Create an aliased <code>orbit.account_link</code> table reference
     */
    public AccountLink(Name alias) {
        this(alias, ACCOUNT_LINK);
    }

    private AccountLink(Name alias, Table<AccountLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private AccountLink(Name alias, Table<AccountLinkRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ACCOUNT_LINK_PRIMARY, Indexes.ACCOUNT_LINK_STUDENT_ID, Indexes.ACCOUNT_LINK_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AccountLinkRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ACCOUNT_LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AccountLinkRecord> getPrimaryKey() {
        return Keys.KEY_ACCOUNT_LINK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AccountLinkRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountLinkRecord>>asList(Keys.KEY_ACCOUNT_LINK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AccountLinkRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AccountLinkRecord, ?>>asList(Keys.ACCOUNT_LINK_IBFK_1, Keys.ACCOUNT_LINK_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountLink as(String alias) {
        return new AccountLink(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountLink as(Name alias) {
        return new AccountLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountLink rename(String name) {
        return new AccountLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountLink rename(Name name) {
        return new AccountLink(name, null);
    }
}
