package com.frames;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.text.ParseException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    private final String SQLURL = "jdbc:mysql://localhost:3306/student management system";
    private final String SQLUSERNAME = "user";
    private final String SQLPASSWORD = "user";

    public MainFrame() {
        initComponents();
        getTotalStudentCount();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        navPanel = new javax.swing.JPanel();
        dashboardButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        dashBoardPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        studentCountLabel = new javax.swing.JLabel();
        viewMoreButton = new javax.swing.JButton();
        addNewRecordPanel = new javax.swing.JPanel();
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
        addStudentButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        viewRecordPanel = new javax.swing.JPanel();
        viewRecordsScrollPane = new javax.swing.JScrollPane();
        viewRecordsTable = new javax.swing.JTable();
        viewRecordsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTextArea = new javax.swing.JTextArea();
        editDetailsButton = new javax.swing.JButton();
        deletePanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentInfoTextArea = new javax.swing.JTextArea();
        deleteStudentButton = new javax.swing.JButton();
        settingsPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Student Management System - Main Frame");
        setResizable(false);

        rootPanel.setLayout(new java.awt.BorderLayout());

        navPanel.setBackground(new java.awt.Color(204, 204, 204));
        navPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        navPanel.setPreferredSize(new java.awt.Dimension(130, 488));

        dashboardButton.setText("Dash Board");
        dashboardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardButtonMouseClicked(evt);
            }
        });

        viewButton.setText("View");
        viewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewButton.setPreferredSize(new java.awt.Dimension(95, 25));
        viewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewButtonMouseClicked(evt);
            }
        });

        settingsButton.setText("Settings");
        settingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
        });

        logoutButton.setText("Log out");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("SMS");

        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        addButton.setText("Add Record");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(dashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardButton)
                .addGap(51, 51, 51)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addGap(18, 18, 18)
                .addComponent(settingsButton)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        rootPanel.add(navPanel, java.awt.BorderLayout.WEST);

        contentPanel.setBackground(new java.awt.Color(102, 102, 102));
        contentPanel.setPreferredSize(new java.awt.Dimension(715, 488));
        contentPanel.setLayout(new java.awt.CardLayout());

        dashBoardPanel.setBackground(new java.awt.Color(210, 210, 210));
        dashBoardPanel.setPreferredSize(new java.awt.Dimension(715, 488));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("    Welcome to the Student Management System!\n\n   This system allows you to manage student records.\n   You can perform the following actions:\n\n       1. Add new students to the database.\n       2. Update existing student information.\n       3. Delete student records from the database.\n       4. View student information, including student ID,\n           first name, last name, program, and year level.\n\n    Please use the provided interface to navigate through\n    the system and manage student data efficiently.\n\n    Enjoy using our Student Management System!");
        jScrollPane3.setViewportView(jTextArea1);

        jLabel2.setText("Total Student Count");

        studentCountLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentCountLabel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(studentCountLabel)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentCountLabel)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        viewMoreButton.setText("View More");
        viewMoreButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewMoreButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMoreButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dashBoardPanelLayout = new javax.swing.GroupLayout(dashBoardPanel);
        dashBoardPanel.setLayout(dashBoardPanelLayout);
        dashBoardPanelLayout.setHorizontalGroup(
            dashBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashBoardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewMoreButton)
                .addGap(307, 307, 307))
            .addGroup(dashBoardPanelLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dashBoardPanelLayout.setVerticalGroup(
            dashBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewMoreButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        contentPanel.add(dashBoardPanel, "card2");

        addNewRecordPanel.setBackground(new java.awt.Color(210, 210, 210));

        studentIDField.setBorder(javax.swing.BorderFactory.createTitledBorder("Student ID"));

        lastNameField.setBorder(javax.swing.BorderFactory.createTitledBorder("Last Name"));

        yearLevelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        yearLevelComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Year Level"));

        addressField.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Gender"));

        firstNameField.setBorder(javax.swing.BorderFactory.createTitledBorder("First Name"));

        emailField.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));

        dateOfBirthField.setBorder(javax.swing.BorderFactory.createTitledBorder("Date Of Birth"));

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
                                .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addNewRecordInnerPanelLayout.createSequentialGroup()
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addNewRecordInnerPanelLayout.createSequentialGroup()
                        .addComponent(programField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yearLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(addNewRecordInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addNewRecordInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addNewRecordInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(programField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        addStudentButton.setText("Add Student");
        addStudentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addStudentButtonMouseClicked(evt);
            }
        });

        clearButton.setText("Clear all Fields");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addNewRecordPanelLayout = new javax.swing.GroupLayout(addNewRecordPanel);
        addNewRecordPanel.setLayout(addNewRecordPanelLayout);
        addNewRecordPanelLayout.setHorizontalGroup(
            addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewRecordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addNewRecordInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addNewRecordPanelLayout.createSequentialGroup()
                        .addComponent(addStudentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearButton)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        addNewRecordPanelLayout.setVerticalGroup(
            addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewRecordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addNewRecordInnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudentButton)
                    .addComponent(clearButton))
                .addGap(237, 237, 237))
        );

        contentPanel.add(addNewRecordPanel, "card3");

        viewRecordPanel.setBackground(new java.awt.Color(210, 210, 210));

        viewRecordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Program", "Year Level"
            }
        ));
        viewRecordsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRecordsTableMouseClicked(evt);
            }
        });
        viewRecordsScrollPane.setViewportView(viewRecordsTable);

        viewRecordsButton.setText("View Records");
        viewRecordsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewRecordsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRecordsButtonMouseClicked(evt);
            }
        });

        viewTextArea.setColumns(20);
        viewTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewTextArea.setRows(5);
        viewTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        viewTextArea.setEnabled(false);
        jScrollPane2.setViewportView(viewTextArea);

        editDetailsButton.setText("Edit Details");
        editDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editDetailsButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout viewRecordPanelLayout = new javax.swing.GroupLayout(viewRecordPanel);
        viewRecordPanel.setLayout(viewRecordPanelLayout);
        viewRecordPanelLayout.setHorizontalGroup(
            viewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewRecordsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addGroup(viewRecordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewRecordsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        viewRecordPanelLayout.setVerticalGroup(
            viewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewRecordPanelLayout.createSequentialGroup()
                .addComponent(viewRecordsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(viewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewRecordPanelLayout.createSequentialGroup()
                        .addComponent(viewRecordsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editDetailsButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(viewRecordPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        contentPanel.add(viewRecordPanel, "card4");

        deletePanel.setBackground(new java.awt.Color(210, 210, 210));

        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.setText("Enter Student ID To Delete");
        searchField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });

        searchButton.setText("Check Student");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        studentInfoTextArea.setColumns(20);
        studentInfoTextArea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentInfoTextArea.setRows(5);
        studentInfoTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        studentInfoTextArea.setEnabled(false);
        jScrollPane1.setViewportView(studentInfoTextArea);

        deleteStudentButton.setText("Delete Student");
        deleteStudentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteStudentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteStudentButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addGroup(deletePanelLayout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteStudentButton)))
                .addContainerGap())
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteStudentButton)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        contentPanel.add(deletePanel, "card6");

        settingsPanel.setBackground(new java.awt.Color(210, 210, 210));

        jButton1.setText("View Terms & Conditions");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setText("Language & Preferences");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton3.setText("Themes");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton4.setText("System Settings");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(278, 278, 278))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        contentPanel.add(settingsPanel, "card5");

        rootPanel.add(contentPanel, java.awt.BorderLayout.EAST);

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMouseClicked
        swapPanels(dashBoardPanel);
    }//GEN-LAST:event_dashboardButtonMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        swapPanels(addNewRecordPanel);
    }//GEN-LAST:event_addButtonMouseClicked

    private void viewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewButtonMouseClicked
        swapPanels(viewRecordPanel);
    }//GEN-LAST:event_viewButtonMouseClicked

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
        swapPanels(settingsPanel);
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.out.println("Logging out...");
            new Home().setVisible(true);
            this.dispose();
        } else {
            System.out.println("Logout canceled.");
        }
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.out.println("Exiting...");
            this.dispose();
        } else {
            System.out.println("Exit canceled.");
        }
    }//GEN-LAST:event_exitButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        swapPanels(deletePanel);
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void addStudentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStudentButtonMouseClicked
        addStudentInfo();
    }//GEN-LAST:event_addStudentButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all fields?", "Clear Fields Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.out.println("Cleared...");
            clearFields();
        } else {
            System.out.println("Canceled.");
        }
    }//GEN-LAST:event_clearButtonMouseClicked

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        setTextFieldPlaceholder(searchField, "Enter Student ID To Delete");
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        removeTextFieldPlaceholder(searchField, "Enter Student ID To Delete");
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        searchField.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_searchFieldKeyPressed

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        if (searchField.getText() != "Enter Student ID To Delete") {
            searchStudent(searchField.getText(), studentInfoTextArea);
        }
    }//GEN-LAST:event_searchButtonMouseClicked

    private void deleteStudentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteStudentButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the student?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            deleteStudent();
        } else {
            System.out.println("Delete canceled.");
        }
    }//GEN-LAST:event_deleteStudentButtonMouseClicked

    private void viewRecordsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordsButtonMouseClicked
        populateStudentTable();
    }//GEN-LAST:event_viewRecordsButtonMouseClicked

    private void viewRecordsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordsTableMouseClicked
        int row = viewRecordsTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) viewRecordsTable.getModel();
        if (model.getValueAt(row, 0) != null) {
            searchStudent(model.getValueAt(row, 0) + "", viewTextArea);
        }
    }//GEN-LAST:event_viewRecordsTableMouseClicked

    private void viewMoreButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMoreButtonMouseClicked
        swapPanels(viewRecordPanel);
        populateStudentTable();
    }//GEN-LAST:event_viewMoreButtonMouseClicked

    private void editDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDetailsButtonMouseClicked
        try {
            String text = viewTextArea.getText();
            if (text != null && !text.isBlank()) {
                String idLine = text.split("\n")[0]; // Get the first line
                String[] parts = idLine.split(":"); // Split by ":"
                if (parts.length >= 2) {
                    String id = parts[1].trim(); // Get the second part (the ID) and trim whitespace
                    if (!id.isEmpty()) {
                        new EditDetails(Integer.parseInt(id)).setVisible(true);
                        return; // Return after successful ID retrieval
                    }
                }
            }
            // If reaching here, no valid student ID was found
            JOptionPane.showMessageDialog(this, "No valid student ID found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("No valid student ID found.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error parsing student ID: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error parsing student ID: " + e);
        }

    }//GEN-LAST:event_editDetailsButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addNewRecordInnerPanel;
    private javax.swing.JPanel addNewRecordPanel;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel dashBoardPanel;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JTextField dateOfBirthField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JButton deleteStudentButton;
    private javax.swing.JButton editDetailsButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel navPanel;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField programField;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton settingsButton;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JLabel studentCountLabel;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JTextArea studentInfoTextArea;
    private javax.swing.JButton viewButton;
    private javax.swing.JButton viewMoreButton;
    private javax.swing.JPanel viewRecordPanel;
    private javax.swing.JButton viewRecordsButton;
    private javax.swing.JScrollPane viewRecordsScrollPane;
    private javax.swing.JTable viewRecordsTable;
    private javax.swing.JTextArea viewTextArea;
    private javax.swing.JComboBox<String> yearLevelComboBox;
    // End of variables declaration//GEN-END:variables
    private void swapPanels(JPanel panel) {
        dashBoardPanel.setVisible(false);
        addNewRecordPanel.setVisible(false);
        viewRecordPanel.setVisible(false);
        deletePanel.setVisible(false);
        settingsPanel.setVisible(false);
        panel.setVisible(true);
    }

    private void addStudentInfo() {
        // Get input from fields and combo boxes
        String studentID = studentIDField.getText();
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
        if (studentID.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()
                || phoneNumber.isEmpty() || program.isEmpty() || address.isEmpty() || gender == null || yearLevel == null || dateOfBirthString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Parse date of birth
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateOfBirth;
        LocalDate dateAdded = LocalDate.now();
        java.sql.Date dateAddedSql = java.sql.Date.valueOf(dateAdded);
        try {
            dateOfBirth = dateFormat.parse(dateOfBirthString);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Invalid date format", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Insert student info into database
        try {
            Connection conn = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String query = "INSERT INTO Students (StudentID, FirstName, LastName, DateOfBirth, Gender, Email, PhoneNumber, ProgramDepartment, Address, YearLevel, DateAdded) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(studentID));
            pstmt.setString(2, firstName);
            pstmt.setString(3, lastName);
            pstmt.setDate(4, new java.sql.Date(dateOfBirth.getTime()));
            pstmt.setString(5, gender);
            pstmt.setString(6, email);
            pstmt.setString(7, phoneNumber);
            pstmt.setString(8, program);
            pstmt.setString(9, address);
            pstmt.setInt(10, Integer.parseInt(yearLevel));
            pstmt.setDate(11, dateAddedSql);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding student: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        studentIDField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
        phoneNumberField.setText("");
        programField.setText("");
        addressField.setText("");
        dateOfBirthField.setText("");
    }

    /**
     * @param text field and string to set placeholder from text fields
     */
    private void setTextFieldPlaceholder(javax.swing.JTextField textField, String text) {
        if (textField.getText().equalsIgnoreCase(text)) {
            textField.setText("");
            textField.setForeground(new Color(153, 153, 153));
        }
    }

    /**
     * @param text field and string to remove placeholder from text fields
     */
    private void removeTextFieldPlaceholder(javax.swing.JTextField textField, String text) {
        if (textField.getText().equals("")) {
            textField.setText(text);
            textField.setForeground(new Color(153, 153, 153));
        }
    }

    private void searchStudent(String studentID, JTextArea textArea) {

        if (studentID == null || studentID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a Student ID", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection conn = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String query = "SELECT * FROM Students WHERE StudentID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, studentID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Format student information with labels
                String formattedInfo = String.format("Student ID: %s\n"
                        + "First Name: %s\n"
                        + "Last Name: %s\n"
                        + "Date of Birth: %s\n"
                        + "Gender: %s\n"
                        + "Email: %s\n"
                        + "Phone Number: %s\n"
                        + "Address: %s\n"
                        + "Program/Department: %s\n"
                        + "Year Level: %s\n"
                        + "Date Added: %s\n",
                        rs.getString("StudentID"),
                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getDate("DateOfBirth"),
                        rs.getString("Gender"),
                        rs.getString("Email"),
                        rs.getString("PhoneNumber"),
                        rs.getString("Address"),
                        rs.getString("ProgramDepartment"),
                        rs.getString("YearLevel"),
                        rs.getDate("DateAdded"));

                // Set formatted information in JTextArea
                textArea.setText(formattedInfo);
            } else {
                JOptionPane.showMessageDialog(this, "Student not found", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Student not found");
            }

            // Close the resources
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error searching student: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error searching student: " + ex.getMessage());
        }
    }

    private void deleteStudent() {
        // Get student ID displayed in the text area
        String studentID = studentInfoTextArea.getText().split("\n")[0].split(":")[1].trim();

        try {
            Connection conn = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String query = "DELETE FROM Students WHERE StudentID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, studentID);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Student deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                studentInfoTextArea.setText(""); // Clear the text area after deletion
                System.out.println("Student deleted successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Student not found or already deleted", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Student not found or already deleted");
            }

            // Close the resources
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error deleting student: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void populateStudentTable() {
        try {
            Connection conn = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String query = "SELECT StudentID, FirstName, LastName, ProgramDepartment, YearLevel FROM Students";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            // Create a DefaultTableModel with columns
            String[] columns = {"Student ID", "First Name", "Last Name", "Program", "Year Level"};
            DefaultTableModel model = new DefaultTableModel(columns, 0);

            // Iterate over the result set and add each row to the model
            while (rs.next()) {
                int studentID = rs.getInt("StudentID");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String program = rs.getString("ProgramDepartment");
                int yearLevel = rs.getInt("YearLevel");

                Object[] row = {studentID, firstName, lastName, program, yearLevel};
                model.addRow(row);
            }

            // Set the model to the JTable
            viewRecordsTable.setModel(model);

            // Close the resources
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error populating student table: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error populating student table: " + ex.getMessage());
        }
    }

    private void getTotalStudentCount() {
        int totalCount = 0;

        try {
            Connection conn = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String query = "SELECT COUNT(*) AS total FROM Students";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                totalCount = rs.getInt("total");
            }

            // Close the resources
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }

        studentCountLabel.setText(totalCount + "");
    }
}
