package com.frames;

import javax.swing.JOptionPane;
import java.sql.*;

public class RegisterNewUser extends javax.swing.JFrame {
    
    private final String SQLURL = "jdbc:mysql://localhost:3306/Student Management System";
    private final String SQLUSERNAME = "user";
    private final String SQLPASSWORD = "user";
    
    public RegisterNewUser() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        createUserButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Student Management System - Register new User");

        usernameLabel.setText("Username");

        passwordLabel.setText("Password");

        createUserButton.setText("Create User");
        createUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createUserButtonMouseClicked(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordLabel)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(createUserButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createUserButton)
                    .addComponent(cancelButton))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void createUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createUserButtonMouseClicked
        registerNewUser(usernameField.getText(), String.valueOf(passwordField.getPassword()));
    }//GEN-LAST:event_createUserButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createUserButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    private void registerNewUser(String username, String password) {
        // Check for blank inputs
        if (username == null || username.isBlank() || password == null || password.isBlank()) {
            JOptionPane.showMessageDialog(null, "Username and Password must not be blank", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Insert new user into the database
        try (Connection conn = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD)) {
            String query = "INSERT INTO users (Username, Password, DateAdded) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "User added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                new Login().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error adding user", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Username already exists. Please choose a different username.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error adding user: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
