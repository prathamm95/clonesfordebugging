package com.employee.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployeeDataMethod {

    public static void updateEmployeeFirstName() {

        String url = "jdbc:mysql://localhost:3306/employees_database";

        Scanner scanner = new Scanner(System.in);

        //set the variables to be used for inserting values & get input from the user using the scanner object
        System.out.print("Enter the ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter new first name: ");
        String firstName = scanner.next();

        try {

            //establish connection to the database
            Connection conn = DriverManager.getConnection(url, "root", "1234");

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("update employees_tbl set first_name = ? where id = ?;");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setString(1, firstName);
            prepStatement.setInt(2, id);

            //execute the SQL update first name query using ".executeUpdate()" method
            prepStatement.executeUpdate();
            System.out.println("Updated the first name to \"" + firstName + "\" for employee ID: " + id + " successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updateEmployeeLastName() {

        String url = "jdbc:mysql://localhost:3306/employees_database";

        Scanner scanner = new Scanner(System.in);

        //set the variables to be used for inserting values & get input from the user using the scanner object
        System.out.print("Enter the ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter new last name: ");
        String lastName = scanner.next();

        try {

            //establish connection to the database
            Connection conn = DriverManager.getConnection(url, "root", "1234");

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("update employees_tbl set last_name = ? where id = ?;");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setString(1, lastName);
            prepStatement.setInt(2, id);

            //execute the SQL update last name query using ".executeUpdate()" method
            prepStatement.executeUpdate();
            System.out.println("Updated the last name to \"" + lastName + "\" for employee ID: " + id + " successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updateEmployeeEmail() {

        String url = "jdbc:mysql://localhost:3306/employees_database";

        Scanner scanner = new Scanner(System.in);

        //set the variables to be used for inserting values & get input from the user using the scanner object
        System.out.print("Enter the ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter new email: ");
        String email = scanner.next();

        try {

            //establish connection to the database
            Connection conn = DriverManager.getConnection(url, "root", "1234");

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("update employees_tbl set email = ? where id = ?;");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setString(1, email);
            prepStatement.setInt(2, id);

            //execute the SQL update last name query using ".executeUpdate()" method
            prepStatement.executeUpdate();
            System.out.println("Updated the email to \"" + email + "\" for employee ID: " + id + " successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
