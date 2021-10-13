package com.employee.management;

import java.sql.*;
import java.util.Scanner;

public class DisplayAllEmployees {

    public static void displayAllEmployeeData() {

        String url = "jdbc:mysql://localhost:3306/employees_database";

        try {

            //establishing the connection object
            Connection conn = DriverManager.getConnection(url, "root", "1234");

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
