package com.employee.management;

import java.sql.*;
import java.util.Scanner;

public class SearchEmployee {

    public static void searchById() {

        String url = "jdbc:mysql://localhost:3306/employees_database";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the ID: ");
        int enterID = scanner.nextInt();

        try {

            //establish connection to the database
            Connection conn = DriverManager.getConnection(url, "root", "1234");

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("select * from employees_tbl where id = ?");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setInt(1, enterID);

            //execute the prepared statement query and assign it to the ResultSet variable
            ResultSet resultSet = prepStatement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");

                System.out.println("ID : " + id + ", Full Name - " + firstName + " " + lastName + ", Email - " + email);

                System.out.println("Searched the entry successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void searchByFirstName() {

        String url = "jdbc:mysql://localhost:3306/employees_database";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name of the Employee: ");
        String enterFirstName = scanner.next();

        try {

            //establish connection to the database
            Connection conn = DriverManager.getConnection(url, "root", "1234");

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("select * from employees_tbl where first_name = ?");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setString(1, enterFirstName);

            //execute the prepared statement query
            ResultSet resultSet = prepStatement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");

                System.out.println("ID : " + id + ", Full Name - " + firstName + " " + lastName + ", Email - " + email);

                System.out.println("Searched the entry successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void searchByLastName() {

        String url = "jdbc:mysql://localhost:3306/employees_database";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Last Name of the Employee: ");
        String enterLastName = scanner.next();

        try {

            //establish connection to the database
            Connection conn = DriverManager.getConnection(url, "root", "1234");

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("select * from employees_tbl where last_name = ?");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setString(1, enterLastName);

            //execute the prepared statement query
            ResultSet resultSet = prepStatement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");

                System.out.println("ID : " + id + ", Full Name - " + firstName + " " + lastName + ", Email - " + email);

                System.out.println("Searched the entry successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void searchByEmail() {

        String url = "jdbc:mysql://localhost:3306/employees_database";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Email of the Employee: ");
        String enterEmail = scanner.next();

        try {

            //establish connection to the database
            Connection conn = DriverManager.getConnection(url, "root", "1234");

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("select * from employees_tbl where email = ?");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setString(1, enterEmail);

            //execute the prepared statement query
            ResultSet resultSet = prepStatement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");

                System.out.println("ID : " + id + ", Full Name - " + firstName + " " + lastName + ", Email - " + email);

                System.out.println("Searched the entry successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}