package com.frames;

import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private final String SQLURL = "jdbc:mysql://localhost:3306/Student Management System";
    private final String SQLUSERNAME = "user";
    private final String SQLPASSWORD = "user";

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Student Management System - Login");
        setResizable(false);

        rootPanel.setMaximumSize(new java.awt.Dimension(445, 300));
        rootPanel.setPreferredSize(new java.awt.Dimension(445, 300));

        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        usernameField.setBorder(javax.swing.BorderFactory.createTitledBorder("Username"));

        passwordField.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));

        registerButton.setText("Register");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("New User? Register Here");

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(rootPanelLayout.createSequentialGroup()
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerButton)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(cancelButton))
                .addGap(31, 31, 31)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(jLabel1))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());
        if (checkLogin(username, password)) {
            new MainFrame().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        new RegisterNewUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
    public boolean checkLogin(String username, String password) {
        // Check for blank inputs
        if (username == null || username.isBlank() || password == null || password.isBlank()) {
            JOptionPane.showMessageDialog(null, "Username and Password must not be blank", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Check username and password in the database
        try (Connection conn = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD)) {
            String query = "SELECT * FROM users WHERE Username = ? AND Password = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);  // Password should be hashed in a real application

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Login successful
                JOptionPane.showMessageDialog(null, "Login Successful!\nWelcome back, " + username + "!", "Success", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                // Login failed
                JOptionPane.showMessageDialog(null, "Login Failed!\nIncorrect username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error during login: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
