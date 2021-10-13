package com.employee.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployeeDataMethod {

    public static void deleteEmployeeData() {

        String url = "jdbc:mysql://localhost:3306/employees_database";

        Scanner scanner = new Scanner(System.in);

        //set the variables to be used for deleting an entry & get input from the user using the scanner object
        System.out.print("Enter the ID: ");
        int id = scanner.nextInt();

        try {

            //establish connection to the database
            Connection conn = DriverManager.getConnection(url, "root", "1234");

            //create a prepared statement variable
            PreparedStatement prepStatement;

            //prepare the statement using the created variable "prepStatement"
            prepStatement = conn.prepareStatement("delete from employees_tbl where id = ?");

            //set the parameters to be inserted in place of placeholders
            prepStatement.setInt(1, id);

            //execute the SQL delete query using ".executeUpdate()" method
            prepStatement.executeUpdate();
            System.out.println("Deleted the entry successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
