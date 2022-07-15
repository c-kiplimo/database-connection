package com.sql;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MysqlCon {

    public static void main(String[] args) {
	// write your code here
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select *from emp");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "" + rs.getString(2) + "" + rs.getString(3));
                System.out.println("Database connection established");

            }
        }
        catch (Exception e){
            System.err.println("Cannot connect to database server");
            System.out.println(e);
        }
    }
}

