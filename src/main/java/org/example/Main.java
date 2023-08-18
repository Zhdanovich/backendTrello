package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres"; // my url for DB in datagrip
        String username = "admin";
        String password = "admin";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            System.out.println("Connected to PostgreSQL database!");
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();
            String createDatabaseQuery = "CREATE DATABASE new_database";
            statement.executeUpdate(createDatabaseQuery);
            System.out.println("Database created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}