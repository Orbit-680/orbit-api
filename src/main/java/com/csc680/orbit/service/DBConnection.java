package com.csc680.orbit.service;

import java.sql.Connection;
import java.sql.DriverManager;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;



public class DBConnection 
{
    private static final String USERNAME = "APIacc";
    private static final String PASSWORD = "KU5K3vxAAC";
    private static final String URL = "jdbc:mysql://18.220.78.140:3306/orbit";
    static Connection conn = null;
    static DSLContext dslContext = null;
    public static DSLContext getConnection()
    {
        if(conn != null) 
            return dslContext;
        else
            return getConnection(URL,USERNAME,PASSWORD);
    }
    
    private static DSLContext getConnection(String url, String pwd, String usrName)
    {
        try
        {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            dslContext = DSL.using(conn, SQLDialect.MYSQL);
        }catch(Exception e)
        {
            e.printStackTrace();
        }        
        return dslContext;
    }
        
}