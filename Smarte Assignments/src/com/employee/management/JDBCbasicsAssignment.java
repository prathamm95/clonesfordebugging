package com.employee.management;

import static com.employee.management.DeleteEmployeeDataMethod.deleteEmployeeData;
import static com.employee.management.DisplayAllEmployees.displayAllEmployeeData;
import static com.employee.management.InsertEmployeeDataMethod.insertEmployeeData;
import static com.employee.management.SearchEmployee.*;
import static com.employee.management.UpdateEmployeeDataMethod.*;

public class JDBCbasicsAssignment {

    public static void main(String[] args) {


        insertEmployeeData();
//        deleteEmployeeData();
//        updateEmployeeFirstName();
//        updateEmployeeLastName();
//        updateEmployeeEmail();
//        displayAllEmployeeData();
//        searchById();
//        searchByFirstName();
//        searchByLastName();
//        searchByEmail();

//        String url = "jdbc:mysql://localhost:3306/employees_database";

//        try {
//            //establishing the connection object
//            Connection conn = DriverManager.getConnection(url, "root", "1234");
//
//            //creating a statement object to send to the database
//            Statement statement = conn.createStatement();
//
//            //execute the statement object
//            ResultSet resultSet = statement.executeQuery("select * from employees_tbl");
//            ResultSetMetaData rsmd = resultSet.getMetaData();
//            int colcount = rsmd.getColumnCount();
//            while(resultSet.next()){
//                for(int i=1; i<=colcount;i++){
//
//                    String colValue = resultSet.getString(i);
//                    System.out.println(">>"+colValue +"  :: "+rsmd.getColumnName(i));
//                }
//
//            }

//            -----------------------------------------------------------------------

//            //insert method to insert data in the table
//            statement.executeUpdate("insert into employees_tbl(id, first_name, last_name, email) values (6, 'Juliet', 'Gomez', 'jgomez@email.com');");

        //delete method to delete an entry
//            statement.executeUpdate("delete from employees_tbl where id 6");
//            System.out.println("Executed delete query");
////
////            //update method to change an entry
////            statement.executeUpdate("update employees_tbl set name ? where id ?");
////
////            //processing & displaying the result
////            while (resultSet.next()) {
////                System.out.println(resultSet.getString("email"));
////            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }

}
