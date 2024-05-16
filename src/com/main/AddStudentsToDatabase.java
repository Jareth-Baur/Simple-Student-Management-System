package com.main;

import java.sql.*;
import java.time.LocalDate;

public class AddStudentsToDatabase {
    private static final String SQLURL = "jdbc:mysql://localhost:3306/student management system";
    private static final String SQLUSERNAME = "user";
    private static final String SQLPASSWORD = "user";

    public static void main(String[] args) {
        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);

            // Prepare the SQL statement for insertion
            String query = "INSERT INTO Students (StudentID, FirstName, LastName, DateOfBirth, Gender, Email, PhoneNumber, ProgramDepartment, Address, YearLevel, DateAdded) " +
                           "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            LocalDate dateAdded = LocalDate.now();
            java.sql.Date dateAddedSql = java.sql.Date.valueOf(dateAdded);
            // Insert 20 students
            for (int i = 1; i <= 20; i++) {
                // Generate random student data
                int studentID = i;
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String dateOfBirth = "2000-01-01"; // Sample date of birth
                String gender = "Male"; // Sample gender
                String email = "student" + i + "@example.com";
                String phoneNumber = "123456789" + i;
                String program = "Computer Science"; // Sample program/department
                String address = "Address" + i;
                int yearLevel = 1; // Sample year level

                // Set parameters for the SQL statement
                pstmt.setInt(1, studentID);
                pstmt.setString(2, firstName);
                pstmt.setString(3, lastName);
                pstmt.setString(4, dateOfBirth);
                pstmt.setString(5, gender);
                pstmt.setString(6, email);
                pstmt.setString(7, phoneNumber);
                pstmt.setString(8, program);
                pstmt.setString(9, address);
                pstmt.setInt(10, yearLevel);
                pstmt.setDate(11, dateAddedSql);
                // Execute the SQL statement
                pstmt.executeUpdate();
            }

            // Close the resources
            pstmt.close();
            conn.close();

            System.out.println("Successfully added 20 students to the database.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
