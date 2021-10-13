package com.employee.management;

import java.sql.*;
import java.util.Scanner;

public class InsertEmployeeDataMethod {


    public static void insertEmployeeData() {

        String url = "jdbc:mysql://localhost:3306/employees_database";

        Scanner scanner = new Scanner(System.in);

        //set the variables to be used for inserting values & get input from the user using the scanner object
        System.out.print("Enter the ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter your first name: ");
        String firstName = scanner.next();

        System.out.print("Enter your last name: ");
        String lastName = scanner.next();

        System.out.print("Enter your email: ");
        String email = scanner.next();

        try {

            //establish connection to the database
            Connection conn = DriverManager.getConnection(url, "root", "1234");

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("insert into employees_tbl(id, first_name, last_name, email) values (?, ?, ?, ?);");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setInt(1, id);
            prepStatement.setString(2, firstName);
            prepStatement.setString(3, lastName);
            prepStatement.setString(4, email);

            //execute the SQL insert query using ".executeUpdate()" method
            prepStatement.executeUpdate();
            System.out.println("Inserted new employee data successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
