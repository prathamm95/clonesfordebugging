package com.employee.management;

import java.sql.*;

public class DisplayAllEmployees {

    public static void displayAllEmployeeData() {

        try {

            ConnectionProvider cn = new ConnectionProvider();

            //establishing the connection object
            Connection conn = cn.getConnection();

            //creating a statement object to send to the database
            Statement statement = conn.createStatement();

            //execute the statement
            ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");

                System.out.println("Employee ID : " + id);
                System.out.println("First name - " + firstName);
                System.out.println("Last name - " + lastName);
                System.out.println("email - " + email);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
