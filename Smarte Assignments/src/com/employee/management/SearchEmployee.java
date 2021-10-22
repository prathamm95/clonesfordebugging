package com.employee.management;

import java.sql.*;
import java.util.Scanner;

public class SearchEmployee {

    public static void searchById() {

        try {

            ConnectionProvider cn = new ConnectionProvider();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the ID: ");
            int enterID = scanner.nextInt();

            //establish connection to the database
            Connection conn = cn.getConnection();

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
                searchById();

            } else {

                while (resultSet.next()) {

                    int id = resultSet.getInt("id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String email = resultSet.getString("email");

                    System.out.println("ID : " + id + ", Full Name - " + firstName + " " + lastName + ", Email - " + email);

                    System.out.println("Searched the entry successfully");

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void searchByFirstName() {

        try {

            ConnectionProvider cn = new ConnectionProvider();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter First Name of the Employee: ");
            String enterFirstName = scanner.next();

            //establish connection to the database
            Connection conn = cn.getConnection();

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("select * from employees_tbl where first_name = ?");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setString(1, enterFirstName);

            //execute the prepared statement query
            ResultSet resultSet = prepStatement.executeQuery();


            if (resultSet.next() == false) {
                System.out.println("No such record found in the database. Re-enter a correct input.");
                searchByFirstName();

            } else {

                while (resultSet.next()) {

                    int id = resultSet.getInt("id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String email = resultSet.getString("email");

                    System.out.println("ID : " + id + ", Full Name - " + firstName + " " + lastName + ", Email - " + email);

                    System.out.println("Searched the entry successfully");

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void searchByLastName() {

        try {

            ConnectionProvider cn = new ConnectionProvider();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Last Name of the Employee: ");
            String enterLastName = scanner.next();

            //establish connection to the database
            Connection conn = cn.getConnection();

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("select * from employees_tbl where last_name = ?");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setString(1, enterLastName);

            //execute the prepared statement query
            ResultSet resultSet = prepStatement.executeQuery();

            if (resultSet.next() == false) {
                System.out.println("No such record found in the database. Re-enter a correct input.");
                searchByLastName();

            } else {

                while (resultSet.next()) {

                    int id = resultSet.getInt("id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String email = resultSet.getString("email");

                    System.out.println("ID : " + id + ", Full Name - " + firstName + " " + lastName + ", Email - " + email);

                    System.out.println("Searched the entry successfully");

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void searchByEmail() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Email of the Employee: ");
        String enterEmail = scanner.next();

        try {

            ConnectionProvider cn = new ConnectionProvider();

            //establish connection to the database
            Connection conn = cn.getConnection();

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("select * from employees_tbl where email = ?");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setString(1, enterEmail);

            //execute the prepared statement query
            ResultSet resultSet = prepStatement.executeQuery();

            if (resultSet.next() == false) {
                System.out.println("No such record found in the database. Re-enter a correct input.");
                searchByEmail();

            } else {

                while (resultSet.next()) {

                    int id = resultSet.getInt("id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String email = resultSet.getString("email");

                    System.out.println("ID : " + id + ", Full Name - " + firstName + " " + lastName + ", Email - " + email);

                    System.out.println("Searched the entry successfully");

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}