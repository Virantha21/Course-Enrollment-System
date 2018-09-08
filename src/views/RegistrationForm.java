package nsbm;

import javaClasses.BachelorStudent;
import javaClasses.MasterStudent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClasses.Faculty;
import javaClasses.Student;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegistrationForm extends javax.swing.JFrame {

    static Connection cone = null;
    Statement stat = null;
    ResultSet rest = null;

    private String facultyId;

    Student std;
    Faculty facl;
    
    dbConnection db;

    public RegistrationForm() {
        initComponents();
        setLocation(450, 120);

        CourseEnrollButton.setVisible(false);
        arrowLabel.setVisible(false);
        
        db = new dbConnection();
        db.connection();
    }

    public RegistrationForm(Faculty fac) {
        initComponents();
        setLocation(450, 120);
        
        this.facultyId = fac.getFacultyId();

        CourseEnrollButton.setVisible(false);
        arrowLabel.setVisible(false);
        
        db = new dbConnection();
        db.connection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        contactNoField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressArea = new javax.swing.JTextArea();
        dateOfBirthChoose = new com.toedter.calendar.JDateChooser();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        studentIdField = new javax.swing.JTextField();
        bachStudent = new javax.swing.JRadioButton();
        mastStudent = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        enrollDateChoose = new com.toedter.calendar.JDateChooser();
        resetBtn = new javax.swing.JButton();
        contactNoMessageLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        CourseEnrollButton = new javax.swing.JButton();
        addPerDetailsBtn = new javax.swing.JButton();
        enrollLabel = new javax.swing.JLabel();
        arrowLabel = new javax.swing.JLabel();
        RegistrationNoMessageLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        homeMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        logoutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registration Form");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Student Register");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jToolBar1.setRollover(true);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jLabel2.setText("Last Name");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jLabel3.setText("Date of Birth");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jLabel4.setText("E-mail");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jLabel5.setText("First Name");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jLabel7.setText("Contact No");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 25)); // NOI18N
        jLabel9.setText("Personal Details");

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jLabel10.setText("Address");

        firstNameField.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        emailField.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        lastNameField.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        contactNoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactNoFieldKeyTyped(evt);
            }
        });

        addressArea.setColumns(20);
        addressArea.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        addressArea.setRows(5);
        jScrollPane1.setViewportView(addressArea);

        MaleRadioButton.setBackground(new java.awt.Color(153, 153, 255));
        MaleRadioButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        MaleRadioButton.setText("Male");
        MaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioButtonActionPerformed(evt);
            }
        });

        FemaleRadioButton.setBackground(new java.awt.Color(153, 153, 255));
        FemaleRadioButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        FemaleRadioButton.setText("Female");
        FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        jLabel12.setText("Student Registration No.");

        studentIdField.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        bachStudent.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(bachStudent);
        bachStudent.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        bachStudent.setText("Bachelor Student");
        bachStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bachStudentActionPerformed(evt);
            }
        });

        mastStudent.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(mastStudent);
        mastStudent.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        mastStudent.setText("Master Student");
        mastStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mastStudentActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jLabel8.setText("Date of Enrollment");

        resetBtn.setFont(new java.awt.Font("STXihei", 1, 15)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Reset-icon.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        contactNoMessageLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        contactNoMessageLabel.setForeground(new java.awt.Color(204, 0, 0));

        messageLabel.setBackground(new java.awt.Color(153, 153, 255));
        messageLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bachStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mastStudent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(contactNoMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(65, 65, 65)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(contactNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(studentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                            .addComponent(firstNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lastNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(enrollDateChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(resetBtn)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(MaleRadioButton)
                                            .addGap(30, 30, 30)
                                            .addComponent(FemaleRadioButton))))
                                .addComponent(dateOfBirthChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bachStudent)
                    .addComponent(mastStudent))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfBirthChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactNoMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaleRadioButton)
                    .addComponent(FemaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enrollDateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetBtn)
                            .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        CourseEnrollButton.setFont(new java.awt.Font("STSong", 1, 20)); // NOI18N
        CourseEnrollButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Science-Classroom-icon.png"))); // NOI18N
        CourseEnrollButton.setText("Course Enrollment");
        CourseEnrollButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        CourseEnrollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseEnrollButtonActionPerformed(evt);
            }
        });

        addPerDetailsBtn.setFont(new java.awt.Font("STXihei", 1, 15)); // NOI18N
        addPerDetailsBtn.setText("Add Personal Details");
        addPerDetailsBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, new java.awt.Color(255, 255, 255), java.awt.Color.white, java.awt.Color.white));
        addPerDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPerDetailsBtnActionPerformed(evt);
            }
        });

        enrollLabel.setFont(new java.awt.Font("STKaiti", 1, 18)); // NOI18N
        enrollLabel.setForeground(new java.awt.Color(0, 0, 102));

        arrowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Action-arrow-blue-double-down-icon.png"))); // NOI18N

        RegistrationNoMessageLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        RegistrationNoMessageLabel.setForeground(new java.awt.Color(204, 0, 0));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/personal-information-icon (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enrollLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arrowLabel)
                                    .addComponent(CourseEnrollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(addPerDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RegistrationNoMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(RegistrationNoMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addComponent(addPerDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enrollLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(arrowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CourseEnrollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("File");

        homeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        homeMenuItem.setText("Home");
        homeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(homeMenuItem);
        jMenu1.add(jSeparator1);

        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(logoutMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed

        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Login logp = new Login();
        logp.setVisible(true);
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void homeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuItemActionPerformed
        dispose();
        setVisible(false);
    }//GEN-LAST:event_homeMenuItemActionPerformed

    private void FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioButtonActionPerformed

        if (FemaleRadioButton.isSelected()) {
            MaleRadioButton.setSelected(false);
        }
        gender = "Female";
    }//GEN-LAST:event_FemaleRadioButtonActionPerformed

    private void MaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioButtonActionPerformed

        if (MaleRadioButton.isSelected()) {
            FemaleRadioButton.setSelected(false);
        }
        gender = "Male";
    }//GEN-LAST:event_MaleRadioButtonActionPerformed

    private void contactNoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactNoFieldKeyTyped

        char chr = evt.getKeyChar();
        if (!(Character.isDigit(chr) || chr == KeyEvent.VK_BACK_SPACE || chr == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_contactNoFieldKeyTyped

    private void CourseEnrollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseEnrollButtonActionPerformed

        setVisible(false);
        if (studentType.equals("Bachelor")) {
            CourseRegister cmpr = new CourseRegister((BachelorStudent) std, facultyId);
            cmpr.setVisible(true);
        } else if (studentType.equals("Master")) {
            CourseRegister cmpr = new CourseRegister((MasterStudent) std, facultyId);
            cmpr.setVisible(true);
        }

    }//GEN-LAST:event_CourseEnrollButtonActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        resetAction();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void addPerDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPerDetailsBtnActionPerformed

        
        if (studentIdField.getText().equals("")) {
            RegistrationNoMessageLabel.setText("*Registration No. cannot be empty!");
        }
        else if(studentIdField.getText().length() > 7){
            RegistrationNoMessageLabel.setText("*Invalid Registration Number!");
        }
        else if (firstNameField.getText().equals("") || lastNameField.getText().equals("") || ((JTextField) dateOfBirthChoose.getDateEditor().getUiComponent()).getText().equals("") || emailField.getText().equals("") || contactNoField.getText().equals("")) {
            messageLabel.setText("*Some Fields are empty!");
        } 
        else if (addressArea.getText().equals("") || ((JTextField) enrollDateChoose.getDateEditor().getUiComponent()).getText().equals("")) {
            messageLabel.setText("*Some Fields are empty!");
        } 
        else if ((contactNoField.getText().length() != 10)) {
            contactNoMessageLabel.setText("*Contact No. is not Valid!");
        } 
        else if (!MaleRadioButton.isSelected() && !FemaleRadioButton.isSelected()) {
            messageLabel.setText("*Select the Gender!");
        }
        else{
            try {
                rest = db.studentSelection(studentIdField.getText());
                if(rest.next()){
                    JOptionPane.showMessageDialog(null, "Student Registration Number is not available...!");
                }
                else {

                if (studentType.equals("Bachelor")) {
                    std = new BachelorStudent();
                } else if (studentType.equals("Master")) {
                    std = new MasterStudent();
                }

                std.setstuId(studentIdField.getText());
                std.setfirstName(firstNameField.getText());
                std.setlastname(lastNameField.getText());
                std.setdob(((JTextField) dateOfBirthChoose.getDateEditor().getUiComponent()).getText());
                std.setemail(emailField.getText());
                std.setcontactNo(contactNoField.getText());
                std.setaddress(addressArea.getText());
                std.setgender(gender);
                std.setenrolldate(((JTextField) enrollDateChoose.getDateEditor().getUiComponent()).getText());
                std.setstuType(studentType);

                try {
                    int exe = db.insertStudent(std);

                    if (exe == 1) {
                        JOptionPane.showMessageDialog(null, "Student Data Inserted Successfully...");
                    } else {
                        JOptionPane.showMessageDialog(null, "Something Wrong...! Check and Try Again");
                    }

                } 
                catch (SQLException ex) {
                    Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
                }

                addPerDetailsBtn.setVisible(false);
                enrollLabel.setText("Click to Enroll to Courses");
                CourseEnrollButton.setVisible(true);
                arrowLabel.setVisible(true);

                studentIdField.setEditable(false);
                firstNameField.setEditable(false);
                lastNameField.setEditable(false);
                dateOfBirthChoose.setEnabled(false);
                emailField.setEditable(false);
                contactNoField.setEditable(false);
                addressArea.setEditable(false);
                MaleRadioButton.setEnabled(false);
                FemaleRadioButton.setEnabled(false);
                enrollDateChoose.setEnabled(false);
            }
                
            } catch (SQLException ex) {
                Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_addPerDetailsBtnActionPerformed

    private void bachStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bachStudentActionPerformed
        studentType = "Bachelor";
    }//GEN-LAST:event_bachStudentActionPerformed

    private void mastStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mastStudentActionPerformed
        studentType = "Master";
    }//GEN-LAST:event_mastStudentActionPerformed

    public void resetAction() {
        firstNameField.setText(null);
        lastNameField.setText(null);
        dateOfBirthChoose.setDate(null);
        emailField.setText(null);
        contactNoField.setText(null);
        MaleRadioButton.setSelected(false);
        FemaleRadioButton.setSelected(false);
        enrollDateChoose.setDate(null);
        addressArea.setText(null);
        studentIdField.setText(null);
        RegistrationNoMessageLabel.setText(null);
        messageLabel.setText(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CourseEnrollButton;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JLabel RegistrationNoMessageLabel;
    private javax.swing.JButton addPerDetailsBtn;
    private javax.swing.JTextArea addressArea;
    private javax.swing.JLabel arrowLabel;
    private javax.swing.JRadioButton bachStudent;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contactNoField;
    private javax.swing.JLabel contactNoMessageLabel;
    private com.toedter.calendar.JDateChooser dateOfBirthChoose;
    private javax.swing.JTextField emailField;
    private com.toedter.calendar.JDateChooser enrollDateChoose;
    private javax.swing.JLabel enrollLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JMenuItem homeMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JRadioButton mastStudent;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField studentIdField;
    // End of variables declaration//GEN-END:variables
    private String gender;
    private String studentType;
}
