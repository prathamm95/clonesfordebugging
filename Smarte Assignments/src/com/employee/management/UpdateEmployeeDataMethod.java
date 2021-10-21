package com.employee.management;

import java.sql.*;
import java.util.Scanner;

public class UpdateEmployeeDataMethod {

    public static void updateEmployeeFirstName() {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the ID: ");
            int enterID = scanner.nextInt();

            //establish connection to the database
            Connection conn = ConnectionProvider.getConnection();

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("select * from employees_tbl where id = ?");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setInt(1, enterID);

            //execute the prepared statement query and assign it to the ResultSet variable
            ResultSet resultSet = prepStatement.executeQuery();

            if (resultSet.next() == false) {
                System.out.println("No such record found in the database. Re-enter a correct input.");
                updateEmployeeFirstName();

            } else {

                System.out.print("Enter new first name: ");
                String firstName = scanner.next();

                PreparedStatement prepStatement1;

                //prepare the statement using the created variable "prepStatement"
                prepStatement1 = conn.prepareStatement("update employees_tbl set first_name = ? where id = ?");

                prepStatement1.setString(1, firstName);
                prepStatement1.setInt(2, enterID);

                //execute the SQL delete query using ".executeUpdate()" method
                prepStatement1.executeUpdate();

                System.out.println("Updated the entry for ID " + enterID + " successfully");

            }

        } catch (Exception e) {
            System.out.println("No such record found in the database. Re-enter a correct input.");
            updateEmployeeFirstName();
        }

    }

    public static void updateEmployeeLastName() {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the ID: ");
            int enterID = scanner.nextInt();

            //establish connection to the database
            Connection conn = ConnectionProvider.getConnection();

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("select * from employees_tbl where id = ?");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setInt(1, enterID);

            //execute the prepared statement query and assign it to the ResultSet variable
            ResultSet resultSet = prepStatement.executeQuery();

            if (resultSet.next() == false) {
                System.out.println("No such record found in the database. Re-enter a correct input.");
                updateEmployeeLastName();

            } else {

                System.out.print("Enter new last name: ");
                String lastName = scanner.next();

                PreparedStatement prepStatement1;

                //prepare the statement using the created variable "prepStatement"
                prepStatement1 = conn.prepareStatement("update employees_tbl set last_name = ? where id = ?");

                prepStatement1.setString(1, lastName);
                prepStatement1.setInt(2, enterID);

                //execute the SQL delete query using ".executeUpdate()" method
                prepStatement1.executeUpdate();

                System.out.println("Updated the entry for ID " + enterID + " successfully");

            }

        } catch (Exception e) {
            System.out.println("No such record found in the database. Re-enter a correct input.");
            updateEmployeeLastName();
        }

    }

    public static void updateEmployeeEmail() {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the ID: ");
            int enterID = scanner.nextInt();

            //establish connection to the database
            Connection conn = ConnectionProvider.getConnection();

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("select * from employees_tbl where id = ?");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setInt(1, enterID);

            //execute the prepared statement query and assign it to the ResultSet variable
            ResultSet resultSet = prepStatement.executeQuery();

            if (resultSet.next() == false) {
                System.out.println("No such record found in the database. Re-enter a correct input.");
                updateEmployeeEmail();

            } else {

                System.out.print("Enter new email: ");
                String email = scanner.next();

                PreparedStatement prepStatement1;

                //prepare the statement using the created variable "prepStatement"
                prepStatement1 = conn.prepareStatement("update employees_tbl set email = ? where id = ?");

                prepStatement1.setString(1, email);
                prepStatement1.setInt(2, enterID);

                //execute the SQL delete query using ".executeUpdate()" method
                prepStatement1.executeUpdate();

                System.out.println("Updated the entry for ID " + enterID + " successfully");

            }

        } catch (Exception e) {
            System.out.println("No such record found in the database. Re-enter a correct input.");
            updateEmployeeEmail();
        }

    }

}
//    public static void updateEmployeeLastName() {
//
//        try {
//
//            String url = "jdbc:mysql://localhost:3306/employees_database";
//
//            Scanner scanner = new Scanner(System.in);
//
//            //set the variables to be used for inserting values & get input from the user using the scanner object
//            System.out.print("Enter the ID: ");
//            int id = scanner.nextInt();
//
//            System.out.print("Enter new last name: ");
//            String lastName = scanner.next();
//
//            //establish connection to the database
//            Connection conn = DriverManager.getConnection(url, "root", "1234");
//
//            //create a prepared statement variable
//            PreparedStatement prepStatement;
//
//            //prepare the statement using the created variable "prepStatement"
//            prepStatement = conn.prepareStatement("update employees_tbl set last_name = ? where id = ?;");
//
//            //set the parameters to be inserted in place of placeholders
//            prepStatement.setString(1, lastName);
//            prepStatement.setInt(2, id);
//
//            //execute the SQL update last name query using ".executeUpdate()" method
//            prepStatement.executeUpdate();
//            System.out.println("Updated the last name to \"" + lastName + "\" for employee ID: " + id + " successfully!");
//
//        } catch (Exception e) {
//            System.out.println("Invalid ID input, please re-enter the correct ID input");
//            updateEmployeeLastName();
//        }
//
//    }
//
//    public static void updateEmployeeEmail() {
//
//        try {
//
//            String url = "jdbc:mysql://localhost:3306/employees_database";
//
//            Scanner scanner = new Scanner(System.in);
//
//            //set the variables to be used for inserting values & get input from the user using the scanner object
//            System.out.print("Enter the ID: ");
//            int id = scanner.nextInt();
//
//            System.out.print("Enter new email: ");
//            String email = scanner.next();
//
//            //establish connection to the database
//            Connection conn = DriverManager.getConnection(url, "root", "1234");
//
//            //create a prepared statement variable
//            PreparedStatement prepStatement;
//
//            //prepare the statement using the created variable "prepStatement"
//            prepStatement = conn.prepareStatement("update employees_tbl set email = ? where id = ?;");
//
//            //set the parameters to be inserted in place of placeholders
//            prepStatement.setString(1, email);
//            prepStatement.setInt(2, id);
//
//            //execute the SQL update last name query using ".executeUpdate()" method
//            prepStatement.executeUpdate();
//            System.out.println("Updated the email to \"" + email + "\" for employee ID: " + id + " successfully!");
//
//        } catch (Exception e) {
//            System.out.println("Invalid ID input, please re-enter the correct ID input");
//            updateEmployeeEmail();
//        }
