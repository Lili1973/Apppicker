package com.tieste;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBaseWork {
    public static void main(String[] args) {
        Connection connection = null;
        Statement stmt = null;
        try
        {
            String userName = "root";
            String password = "edcvfr";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName ("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection established");
            //stmt = connection.createStatement();
            //stmt.execute("DELETE FROM EMPLOYEE WHERE ID >= 1");
        }
        catch (Exception e) {
            System.err.println ("Cannot connect to database server");
            e.printStackTrace();

        }finally {
            try {
                stmt.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}