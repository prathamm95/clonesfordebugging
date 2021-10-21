package com.employee.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    private static Connection conn;

    public static Connection getConnection(){

        try{

            if (conn == null){

                //load driver class
                Class.forName("com.mysql.jdbc.Driver");

                //create connection
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_database","root","1234");
            }

        } catch (Exception e){

            e.printStackTrace();
            System.out.println("Connection error");

        }

        return conn;

    }

}
