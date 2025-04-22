package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDB {

    public static Connection connection;

    public static Connection createDBConnection() {
        connection = null;

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/student_manage";
        String username = "root"; // your MySQL username
        String password = "Vrush@2003"; // your MySQL password

        try {
            // Optional: Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the database
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }

        return connection;
    }
}
