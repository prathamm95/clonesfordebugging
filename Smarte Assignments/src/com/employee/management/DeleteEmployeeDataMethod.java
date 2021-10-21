package com.employee.management;

import java.sql.*;
import java.util.Scanner;

public class DeleteEmployeeDataMethod {

    public static void deleteEmployeeData() {

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
                deleteEmployeeData();

            } else {

                PreparedStatement prepStatement1;

                //prepare the statement using the created variable "prepStatement"
                prepStatement1 = conn.prepareStatement("delete from employees_tbl where id = " + enterID);

                //execute the SQL delete query using ".executeUpdate()" method
                prepStatement1.executeUpdate();

                System.out.println("Deleted the entry for ID " + enterID + " successfully");

            }

        } catch (Exception e) {
            System.out.println("No such record found in the database. Re-enter a correct input.");
            deleteEmployeeData();
        }


       /* try {

            String url = "jdbc:mysql://localhost:3306/employees_database";

            Scanner scanner = new Scanner(System.in);

            //set the variables to be used for deleting an entry & get input from the user using the scanner object
            System.out.print("Enter the ID: ");
            int id = scanner.nextInt();

            //establish connection to the database
            Connection conn = DriverManager.getConnection(url, "root", "1234");

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("delete from employees_tbl where id = ?");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setInt(1, id);

            //execute the SQL delete query using ".executeUpdate()" method
            ResultSet resultSet = prepStatement.executeQuery();

            if (resultSet.next() == false) {
                System.out.println("No such record found in the database. Re-enter a correct input.");
                deleteEmployeeData();

            } else {

                while (resultSet.next()) {

                    System.out.println("Deleted the entry successfully");

                }
            }

        } catch (Exception e) {
            System.out.println("Invalid ID input, please re-enter the correct ID input");
            deleteEmployeeData();
        }*/

    }

}
