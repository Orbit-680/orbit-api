/*
 * This file is generated by jOOQ.
*/
package com.csc680.orbit.database;


import com.csc680.orbit.database.routines.DefaultDataLoad;
import com.csc680.orbit.database.routines.LoadCourses;
import com.csc680.orbit.database.routines.LoadRoles;
import com.csc680.orbit.database.routines.LoadSchools;
import com.csc680.orbit.database.routines.LoadStudents;
import com.csc680.orbit.database.routines.LoadTeachers;

import javax.annotation.Generated;

import org.jooq.Configuration;


/**
 * Convenience access to all stored procedures and functions in orbit
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * Call <code>orbit.default_data_load</code>
     */
    public static void defaultDataLoad(Configuration configuration) {
        DefaultDataLoad p = new DefaultDataLoad();

        p.execute(configuration);
    }

    /**
     * Call <code>orbit.load_courses</code>
     */
    public static void loadCourses(Configuration configuration) {
        LoadCourses p = new LoadCourses();

        p.execute(configuration);
    }

    /**
     * Call <code>orbit.load_roles</code>
     */
    public static void loadRoles(Configuration configuration) {
        LoadRoles p = new LoadRoles();

        p.execute(configuration);
    }

    /**
     * Call <code>orbit.load_schools</code>
     */
    public static void loadSchools(Configuration configuration) {
        LoadSchools p = new LoadSchools();

        p.execute(configuration);
    }

    /**
     * Call <code>orbit.load_students</code>
     */
    public static void loadStudents(Configuration configuration) {
        LoadStudents p = new LoadStudents();

        p.execute(configuration);
    }

    /**
     * Call <code>orbit.load_teachers</code>
     */
    public static void loadTeachers(Configuration configuration) {
        LoadTeachers p = new LoadTeachers();

        p.execute(configuration);
    }
}
