package com.frames;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class EditDetails extends javax.swing.JFrame {

    private final String studentID;
    private final String SQLURL = "jdbc:mysql://localhost:3306/Student Management System";
    private final String SQLUSERNAME = "user";
    private final String SQLPASSWORD = "user";

    public EditDetails(int studentID) {
        initComponents();
        this.studentID = studentID + "";
        populateFields(studentID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        addNewRecordInnerPanel = new javax.swing.JPanel();
        studentIDField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        yearLevelComboBox = new javax.swing.JComboBox<>();
        addressField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        firstNameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        dateOfBirthField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        programField = new javax.swing.JTextField();
        saveDetailsButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Student Management System - Edit Details");
        setResizable(false);

        studentIDField.setBorder(javax.swing.BorderFactory.createTitledBorder("Student ID"));

        lastNameField.setBorder(javax.swing.BorderFactory.createTitledBorder("Last Name"));

        yearLevelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        yearLevelComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Year Level"));

        addressField.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Gender"));

        firstNameField.setBorder(javax.swing.BorderFactory.createTitledBorder("First Name"));

        emailField.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));

        dateOfBirthField.setBorder(javax.swing.BorderFactory.createTitledBorder("Date Of Birth (yyyy-mm-dd)"));

        phoneNumberField.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone Number"));

        programField.setBorder(javax.swing.BorderFactory.createTitledBorder("Program / Department"));

        javax.swing.GroupLayout addNewRecordInnerPanelLayout = new javax.swing.GroupLayout(addNewRecordInnerPanel);
        addNewRecordInnerPanel.setLayout(addNewRecordInnerPanelLayout);
        addNewRecordInnerPanelLayout.setHorizontalGroup(
            addNewRecordInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewRecordInnerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addNewRecordInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addNewRecordInnerPanelLayout.createSequentialGroup()
                        .addGroup(addNewRecordInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentIDField)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addNewRecordInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addNewRecordInnerPanelLayout.createSequentialGroup()
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateOfBirthField))
                            .addGroup(addNewRecordInnerPanelLayout.createSequentialGroup()
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phoneNumberField))))
                    .addGroup(addNewRecordInnerPanelLayout.createSequentialGroup()
                        .addComponent(programField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yearLevelComboBox, 0, 173, Short.MAX_VALUE)))
                .addContainerGap())
        );
        addNewRecordInnerPanelLayout.setVerticalGroup(
            addNewRecordInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewRecordInnerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addNewRecordInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateOfBirthField)
                    .addComponent(lastNameField)
                    .addComponent(studentIDField)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewRecordInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(phoneNumberField)
                    .addComponent(emailField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addNewRecordInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(programField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saveDetailsButton.setText("Save Details");
        saveDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveDetailsButtonMouseClicked(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(saveDetailsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addNewRecordInnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addNewRecordInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveDetailsButton)
                    .addComponent(cancelButton))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveDetailsButtonMouseClicked
        updateStudent();
    }//GEN-LAST:event_saveDetailsButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel editing?", "Editing Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.out.println("Canceled.");
            this.dispose();
        } else {
            System.out.println("Canceled.");
        }
    }//GEN-LAST:event_cancelButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addNewRecordInnerPanel;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField dateOfBirthField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField programField;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JButton saveDetailsButton;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JComboBox<String> yearLevelComboBox;
    // End of variables declaration//GEN-END:variables
    private void updateStudent() {
        // Get input from text fields
        String sID = studentIDField.getText();
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String phoneNumber = phoneNumberField.getText();
        String program = programField.getText();
        String address = addressField.getText();
        String gender = (String) genderComboBox.getSelectedItem();
        String yearLevel = (String) yearLevelComboBox.getSelectedItem();
        String dateOfBirthString = dateOfBirthField.getText();

        // Check for empty fields
        if (sID.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()
                || phoneNumber.isEmpty() || program.isEmpty() || address.isEmpty() || gender == null || yearLevel == null || dateOfBirthString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Parse date of birth
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateOfBirth;
        try {
            dateOfBirth = dateFormat.parse(dateOfBirthString);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Invalid date format", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Apply date filtering if needed
        // Update student record in the database
        try {
            Connection conn = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String query = "UPDATE students SET StudentID = ?, FirstName = ?, LastName = ?, DateOfBirth = ?, Gender = ?, Email = ?, PhoneNumber = ?, ProgramDepartment = ?, Address = ?, YearLevel = ?, DateAdded = ? WHERE StudentID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(sID));
            pstmt.setString(2, firstName);
            pstmt.setString(3, lastName);
            pstmt.setDate(4, new java.sql.Date(dateOfBirth.getTime()));
            pstmt.setString(5, gender);
            pstmt.setString(6, email);
            pstmt.setString(7, phoneNumber);
            pstmt.setString(8, program);
            pstmt.setString(9, address);
            pstmt.setInt(10, Integer.parseInt(yearLevel));
            LocalDate dateAdded = LocalDate.now();
            java.sql.Date newdateAddedSql = java.sql.Date.valueOf(dateAdded);
            pstmt.setDate(11, newdateAddedSql);
            // Set the new StudentID for the WHERE clause
            pstmt.setInt(12, Integer.parseInt(this.studentID));

            int rowsAffected = pstmt.executeUpdate();

            // Close the resources
            pstmt.close();
            conn.close();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Student updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No student found with the provided ID", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error updating student: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }

    private void populateFields(int studentID) {
        try {
            Connection conn = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String query = "SELECT * FROM students WHERE StudentID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, studentID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Populate the fields with the retrieved data
                studentIDField.setText(rs.getInt("StudentID") + "");
                firstNameField.setText(rs.getString("FirstName"));
                lastNameField.setText(rs.getString("LastName"));
                emailField.setText(rs.getString("Email"));
                phoneNumberField.setText(rs.getString("PhoneNumber"));
                programField.setText(rs.getString("ProgramDepartment"));
                addressField.setText(rs.getString("Address"));
                genderComboBox.setSelectedItem(rs.getString("Gender"));
                yearLevelComboBox.setSelectedItem(rs.getInt("YearLevel"));
                dateOfBirthField.setText(rs.getDate("DateOfBirth").toString());
            } else {
                JOptionPane.showMessageDialog(this, "No student found with the provided ID", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Close the resources
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error retrieving student information: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
