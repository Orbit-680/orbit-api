/*
 * This file is generated by jOOQ.
*/
package database.tables;


import database.Indexes;
import database.Keys;
import database.Orbit;
import database.tables.records.StudentRecord;

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
public class Student extends TableImpl<StudentRecord> {

    private static final long serialVersionUID = 695411141;

    /**
     * The reference instance of <code>orbit.student</code>
     */
    public static final Student STUDENT = new Student();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentRecord> getRecordType() {
        return StudentRecord.class;
    }

    /**
     * The column <code>orbit.student.ID</code>.
     */
    public final TableField<StudentRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>orbit.student.First_Name</code>.
     */
    public final TableField<StudentRecord, String> FIRST_NAME = createField("First_Name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Last_Name</code>.
     */
    public final TableField<StudentRecord, String> LAST_NAME = createField("Last_Name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Date_Of_Birth</code>.
     */
    public final TableField<StudentRecord, String> DATE_OF_BIRTH = createField("Date_Of_Birth", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.SSN</code>.
     */
    public final TableField<StudentRecord, String> SSN = createField("SSN", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Address_1</code>.
     */
    public final TableField<StudentRecord, String> ADDRESS_1 = createField("Address_1", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Address_2</code>.
     */
    public final TableField<StudentRecord, String> ADDRESS_2 = createField("Address_2", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.City</code>.
     */
    public final TableField<StudentRecord, String> CITY = createField("City", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.State</code>.
     */
    public final TableField<StudentRecord, String> STATE = createField("State", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Zip_Code</code>.
     */
    public final TableField<StudentRecord, String> ZIP_CODE = createField("Zip_Code", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Grade</code>.
     */
    public final TableField<StudentRecord, String> GRADE = createField("Grade", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Mother_First_Name</code>.
     */
    public final TableField<StudentRecord, String> MOTHER_FIRST_NAME = createField("Mother_First_Name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Mother_Last_Name</code>.
     */
    public final TableField<StudentRecord, String> MOTHER_LAST_NAME = createField("Mother_Last_Name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Mother_SSN</code>.
     */
    public final TableField<StudentRecord, String> MOTHER_SSN = createField("Mother_SSN", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Mother_Address_1</code>.
     */
    public final TableField<StudentRecord, String> MOTHER_ADDRESS_1 = createField("Mother_Address_1", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Mother_Address_2</code>.
     */
    public final TableField<StudentRecord, String> MOTHER_ADDRESS_2 = createField("Mother_Address_2", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Mother_City</code>.
     */
    public final TableField<StudentRecord, String> MOTHER_CITY = createField("Mother_City", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Mother_State</code>.
     */
    public final TableField<StudentRecord, String> MOTHER_STATE = createField("Mother_State", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Mother_Zip_Code</code>.
     */
    public final TableField<StudentRecord, String> MOTHER_ZIP_CODE = createField("Mother_Zip_Code", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Mother_Home_Phone</code>.
     */
    public final TableField<StudentRecord, String> MOTHER_HOME_PHONE = createField("Mother_Home_Phone", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Mother_Cell_Phone</code>.
     */
    public final TableField<StudentRecord, String> MOTHER_CELL_PHONE = createField("Mother_Cell_Phone", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Mother_Email</code>.
     */
    public final TableField<StudentRecord, String> MOTHER_EMAIL = createField("Mother_Email", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Father_First_Name</code>.
     */
    public final TableField<StudentRecord, String> FATHER_FIRST_NAME = createField("Father_First_Name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Father_Last_Name</code>.
     */
    public final TableField<StudentRecord, String> FATHER_LAST_NAME = createField("Father_Last_Name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Father_SSN</code>.
     */
    public final TableField<StudentRecord, String> FATHER_SSN = createField("Father_SSN", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Father_Address_1</code>.
     */
    public final TableField<StudentRecord, String> FATHER_ADDRESS_1 = createField("Father_Address_1", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Father_Address_2</code>.
     */
    public final TableField<StudentRecord, String> FATHER_ADDRESS_2 = createField("Father_Address_2", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Father_City</code>.
     */
    public final TableField<StudentRecord, String> FATHER_CITY = createField("Father_City", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Father_State</code>.
     */
    public final TableField<StudentRecord, String> FATHER_STATE = createField("Father_State", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Father_Zip_Code</code>.
     */
    public final TableField<StudentRecord, String> FATHER_ZIP_CODE = createField("Father_Zip_Code", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Father_Home_Phone</code>.
     */
    public final TableField<StudentRecord, String> FATHER_HOME_PHONE = createField("Father_Home_Phone", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Father_Cell_Phone</code>.
     */
    public final TableField<StudentRecord, String> FATHER_CELL_PHONE = createField("Father_Cell_Phone", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>orbit.student.Father_Email</code>.
     */
    public final TableField<StudentRecord, String> FATHER_EMAIL = createField("Father_Email", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * Create a <code>orbit.student</code> table reference
     */
    public Student() {
        this(DSL.name("student"), null);
    }

    /**
     * Create an aliased <code>orbit.student</code> table reference
     */
    public Student(String alias) {
        this(DSL.name(alias), STUDENT);
    }

    /**
     * Create an aliased <code>orbit.student</code> table reference
     */
    public Student(Name alias) {
        this(alias, STUDENT);
    }

    private Student(Name alias, Table<StudentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Student(Name alias, Table<StudentRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.STUDENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StudentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STUDENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StudentRecord> getPrimaryKey() {
        return Keys.KEY_STUDENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StudentRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentRecord>>asList(Keys.KEY_STUDENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Student as(String alias) {
        return new Student(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Student as(Name alias) {
        return new Student(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(String name) {
        return new Student(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(Name name) {
        return new Student(name, null);
    }
}
