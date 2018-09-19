
package nsbm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClasses.SubjectEnrollment;
import javaClasses.SubjectPayment;
import javax.swing.JOptionPane;

public class Payment extends javax.swing.JFrame {
    
    private String sem1sub1;
    private String sem1sub2;
    private String sem1sub3;
    private String sem1sub4;
    
    private String sem2sub1;
    private String sem2sub2;
    private String sem2sub3;
    private String sem2sub4;
    
    private int sem1fee = 0;
    private int sem2fee = 0;
    
    private String stud;
    private String intake;
    
    dbConnection db;
    
    ResultSet rst;
    
    SubjectPayment subpay;

    public Payment() {
        initComponents();
        setLocation(120,150);
        
        db = new dbConnection();
        db.connection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        homeButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Semester1Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sem1PaymentButton = new javax.swing.JButton();
        paySem1Sub1 = new javax.swing.JLabel();
        paySem1Sub2 = new javax.swing.JLabel();
        paySem1Sub3 = new javax.swing.JLabel();
        paySem1Sub4 = new javax.swing.JLabel();
        sem1Sub1Fee = new javax.swing.JLabel();
        sem1Sub2Fee = new javax.swing.JLabel();
        sem1Sub3Fee = new javax.swing.JLabel();
        sem1Sub4Fee = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sem1TotalFee = new javax.swing.JLabel();
        sem1PaidLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sem2PaymentButton = new javax.swing.JButton();
        paySem2Sub1 = new javax.swing.JLabel();
        paySem2Sub2 = new javax.swing.JLabel();
        paySem2Sub3 = new javax.swing.JLabel();
        paySem2Sub4 = new javax.swing.JLabel();
        sem2Sub1Fee = new javax.swing.JLabel();
        sem2Sub2Fee = new javax.swing.JLabel();
        sem2Sub3Fee = new javax.swing.JLabel();
        sem2Sub4Fee = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        sem2TotalFee = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        studentIdField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        sem2PaidLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("STXihei", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Payment for Subjects");

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/3-Gray-Home-icon (1).png"))); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        Semester1Panel.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setText("Semester 1");

        sem1PaymentButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        sem1PaymentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Coins-icon.png"))); // NOI18N
        sem1PaymentButton.setText("Pay for Semester 1");
        sem1PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1PaymentButtonActionPerformed(evt);
            }
        });

        paySem1Sub1.setBackground(new java.awt.Color(153, 153, 255));
        paySem1Sub1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        paySem1Sub1.setForeground(new java.awt.Color(255, 255, 255));
        paySem1Sub1.setText("Subject 1");

        paySem1Sub2.setBackground(new java.awt.Color(153, 153, 255));
        paySem1Sub2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        paySem1Sub2.setForeground(new java.awt.Color(255, 255, 255));
        paySem1Sub2.setText("Subject 2");

        paySem1Sub3.setBackground(new java.awt.Color(153, 153, 255));
        paySem1Sub3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        paySem1Sub3.setForeground(new java.awt.Color(255, 255, 255));
        paySem1Sub3.setText("Subject 3");

        paySem1Sub4.setBackground(new java.awt.Color(153, 153, 255));
        paySem1Sub4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        paySem1Sub4.setForeground(new java.awt.Color(255, 255, 255));
        paySem1Sub4.setText("Subject 4");

        sem1Sub1Fee.setBackground(new java.awt.Color(153, 153, 255));
        sem1Sub1Fee.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        sem1Sub1Fee.setForeground(new java.awt.Color(255, 255, 255));
        sem1Sub1Fee.setText("<fee>");

        sem1Sub2Fee.setBackground(new java.awt.Color(153, 153, 255));
        sem1Sub2Fee.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        sem1Sub2Fee.setForeground(new java.awt.Color(255, 255, 255));
        sem1Sub2Fee.setText("<fee>");

        sem1Sub3Fee.setBackground(new java.awt.Color(153, 153, 255));
        sem1Sub3Fee.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        sem1Sub3Fee.setForeground(new java.awt.Color(255, 255, 255));
        sem1Sub3Fee.setText("<fee>");

        sem1Sub4Fee.setBackground(new java.awt.Color(153, 153, 255));
        sem1Sub4Fee.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        sem1Sub4Fee.setForeground(new java.awt.Color(255, 255, 255));
        sem1Sub4Fee.setText("<fee>");

        jLabel12.setBackground(new java.awt.Color(153, 153, 255));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Total Payment");

        sem1TotalFee.setBackground(new java.awt.Color(153, 153, 255));
        sem1TotalFee.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        sem1TotalFee.setForeground(new java.awt.Color(0, 0, 153));
        sem1TotalFee.setText("<fee>");

        sem1PaidLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sem1PaidLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout Semester1PanelLayout = new javax.swing.GroupLayout(Semester1Panel);
        Semester1Panel.setLayout(Semester1PanelLayout);
        Semester1PanelLayout.setHorizontalGroup(
            Semester1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Semester1PanelLayout.createSequentialGroup()
                .addGroup(Semester1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Semester1PanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(Semester1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(paySem1Sub2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paySem1Sub3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paySem1Sub4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paySem1Sub1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(Semester1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sem1Sub1Fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sem1Sub2Fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sem1Sub3Fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sem1Sub4Fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sem1TotalFee, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sem1PaidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Semester1PanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Semester1PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sem1PaymentButton)
                .addGap(64, 64, 64))
        );
        Semester1PanelLayout.setVerticalGroup(
            Semester1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Semester1PanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(Semester1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sem1Sub1Fee, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Semester1PanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paySem1Sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Semester1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paySem1Sub2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sem1Sub2Fee, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Semester1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Semester1PanelLayout.createSequentialGroup()
                        .addComponent(sem1Sub3Fee, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sem1PaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(Semester1PanelLayout.createSequentialGroup()
                        .addGroup(Semester1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Semester1PanelLayout.createSequentialGroup()
                                .addComponent(paySem1Sub3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Semester1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paySem1Sub4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sem1Sub4Fee, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Semester1PanelLayout.createSequentialGroup()
                                .addComponent(sem1PaidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)))
                        .addGap(60, 60, 60)
                        .addGroup(Semester1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem1TotalFee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(124, Short.MAX_VALUE))))
        );

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setText("Semester 2");

        sem2PaymentButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        sem2PaymentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Coins-icon.png"))); // NOI18N
        sem2PaymentButton.setText("Pay for Semester 2");
        sem2PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem2PaymentButtonActionPerformed(evt);
            }
        });

        paySem2Sub1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        paySem2Sub1.setForeground(new java.awt.Color(255, 255, 255));
        paySem2Sub1.setText("Subject 1");

        paySem2Sub2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        paySem2Sub2.setForeground(new java.awt.Color(255, 255, 255));
        paySem2Sub2.setText("Subject 2");

        paySem2Sub3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        paySem2Sub3.setForeground(new java.awt.Color(255, 255, 255));
        paySem2Sub3.setText("Subject 3");

        paySem2Sub4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        paySem2Sub4.setForeground(new java.awt.Color(255, 255, 255));
        paySem2Sub4.setText("Subject 4");

        sem2Sub1Fee.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        sem2Sub1Fee.setForeground(new java.awt.Color(255, 255, 255));
        sem2Sub1Fee.setText("<fee>");

        sem2Sub2Fee.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        sem2Sub2Fee.setForeground(new java.awt.Color(255, 255, 255));
        sem2Sub2Fee.setText("<fee>");

        sem2Sub3Fee.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        sem2Sub3Fee.setForeground(new java.awt.Color(255, 255, 255));
        sem2Sub3Fee.setText("<fee>");

        sem2Sub4Fee.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        sem2Sub4Fee.setForeground(new java.awt.Color(255, 255, 255));
        sem2Sub4Fee.setText("<fee>");

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 153));
        jLabel22.setText("Total Payment");

        sem2TotalFee.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        sem2TotalFee.setForeground(new java.awt.Color(0, 0, 153));
        sem2TotalFee.setText("<fee>");

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/search-icon.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        studentIdField.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        studentIdField.setText("Enter Student ID");
        studentIdField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentIdFieldMouseClicked(evt);
            }
        });

        sem2PaidLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sem2PaidLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Semester1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(paySem2Sub1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paySem2Sub2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paySem2Sub3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paySem2Sub4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sem2Sub1Fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sem2Sub2Fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sem2Sub3Fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sem2Sub4Fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sem2TotalFee, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sem2PaymentButton)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(studentIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(jSeparator2))
                                .addGap(18, 18, 18)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sem2PaidLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(paySem2Sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sem2Sub1Fee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sem2Sub2Fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paySem2Sub2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(studentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sem2Sub3Fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paySem2Sub3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sem2Sub4Fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paySem2Sub4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                            .addComponent(sem2PaidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem2TotalFee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(sem2PaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addComponent(Semester1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sem1PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1PaymentButtonActionPerformed
        try {
            ResultSet rest = db.sem1PaymentSelection(subpay.getStudentId());
            if(rest.next()){
                sem1PaidLabel.setText("Paid for Semester 1!");
            }
            else{
                subpay.payForSem1();
                int exe;
                exe = db.payForSem1(subpay);
                if(exe == 1){
                    JOptionPane.showMessageDialog(null, "Payment for Semester 1 is Successful!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_sem1PaymentButtonActionPerformed

    private void sem2PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem2PaymentButtonActionPerformed
        try {
            ResultSet rest = db.sem2PaymentSelection(subpay.getStudentId());
            if(rest.next()){
                sem2PaidLabel.setText("Paid for Semester 2!");
            }
            else{
                subpay.payForSem2();
                int exe;
                exe = db.payForSem2(subpay);
                if(exe == 1){
                    JOptionPane.showMessageDialog(null, "Payment for Semester 2 is Successful!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sem2PaymentButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        if(studentIdField.getText().equals("Enter Student ID") || studentIdField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter valid Student ID...!");
        }
        else{
            try {
                ResultSet res = db.studentSelection(studentIdField.getText());
                if(!res.next()){
                    JOptionPane.showMessageDialog(null, "Student not found!");
                }
                else{
                    String stuId = studentIdField.getText();
                    String course;
                    String year;

                    rst = db.selectStudentForPayment(stuId);

                    if(rst.next()){
                        course = rst.getString("Course_Id");
                        year = rst.getString("AcademicYear");
                        intake = rst.getString("Intake");
                        if(intake.equals("February")){

                            String subArray1[] = new String[4];
                            String subArray2[] = new String[4];
                            int feeArray1[] = new int[4];
                            int feeArray2[] = new int[4];
                            int i = 0;
                            int n = 0;

                            ResultSet rs1 = db.selectSubjectsForPayment(course, year, "Sem1");

                            while(rs1.next()){
                                subArray1[i] = rs1.getString("SubName");
                                feeArray1[i] = rs1.getInt("SubFee");
                                i++;
                            }

                            paySem1Sub1.setText(subArray1[0]);
                            paySem1Sub2.setText(subArray1[1]);
                            paySem1Sub3.setText(subArray1[2]);
                            paySem1Sub4.setText(subArray1[3]);

                            sem1Sub1Fee.setText(Integer.toString(feeArray1[0]));
                            sem1Sub2Fee.setText(Integer.toString(feeArray1[1]));
                            sem1Sub3Fee.setText(Integer.toString(feeArray1[2]));
                            sem1Sub4Fee.setText(Integer.toString(feeArray1[3]));

                            for(int j : feeArray1){
                                sem1fee += j;
                            }
                            sem1TotalFee.setText(Integer.toString(sem1fee));

                            ResultSet rs2 = db.selectSubjectsForPayment(course, year, "Sem2");

                            while(rs2.next()){
                                subArray2[n] = rs2.getString("SubName");
                                feeArray2[n] = rs2.getInt("SubFee");
                                n++;
                            }

                            paySem2Sub1.setText(subArray2[0]);
                            paySem2Sub2.setText(subArray2[1]);
                            paySem2Sub3.setText(subArray2[2]);
                            paySem2Sub4.setText(subArray2[3]);

                            sem2Sub1Fee.setText(Integer.toString(feeArray2[0]));
                            sem2Sub2Fee.setText(Integer.toString(feeArray2[1]));
                            sem2Sub3Fee.setText(Integer.toString(feeArray2[2]));
                            sem2Sub4Fee.setText(Integer.toString(feeArray2[3]));

                            for(int j : feeArray2){
                                sem2fee += j;
                            }
                            sem2TotalFee.setText(Integer.toString(sem2fee));

                            subpay = new SubjectPayment();
                            subpay.setStudentId(studentIdField.getText());
                            subpay.setSem1Payment(sem1fee);
                            subpay.setSem2Payment(sem2fee);
                        }
                        else{
                            String subArray[] = new String[4];
                            int feeArray[] = new int[4];
                            int i = 0;

                            ResultSet rs = db.selectSubjectsForPayment(course, year, "Sem2");

                            while(rs.next()){
                                subArray[i] = rs.getString("SubName");
                                feeArray[i] = rs.getInt("SubFee");
                                i++;
                            }

                            paySem2Sub1.setText(subArray[0]);
                            paySem2Sub2.setText(subArray[1]);
                            paySem2Sub3.setText(subArray[2]);
                            paySem2Sub4.setText(subArray[3]);

                            sem2Sub1Fee.setText(Integer.toString(feeArray[0]));
                            sem2Sub2Fee.setText(Integer.toString(feeArray[1]));
                            sem2Sub3Fee.setText(Integer.toString(feeArray[2]));
                            sem2Sub4Fee.setText(Integer.toString(feeArray[3]));

                            for(int j : feeArray){
                                sem2fee += j;
                            }
                            sem2TotalFee.setText(Integer.toString(sem2fee));

                            subpay = new SubjectPayment();
                            subpay.setStudentId(studentIdField.getText());
                            subpay.setSem2Payment(sem2fee);
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void studentIdFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentIdFieldMouseClicked
        studentIdField.setText(null);
    }//GEN-LAST:event_studentIdFieldMouseClicked

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Semester1Panel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel paySem1Sub1;
    private javax.swing.JLabel paySem1Sub2;
    private javax.swing.JLabel paySem1Sub3;
    private javax.swing.JLabel paySem1Sub4;
    private javax.swing.JLabel paySem2Sub1;
    private javax.swing.JLabel paySem2Sub2;
    private javax.swing.JLabel paySem2Sub3;
    private javax.swing.JLabel paySem2Sub4;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel sem1PaidLabel;
    private javax.swing.JButton sem1PaymentButton;
    private javax.swing.JLabel sem1Sub1Fee;
    private javax.swing.JLabel sem1Sub2Fee;
    private javax.swing.JLabel sem1Sub3Fee;
    private javax.swing.JLabel sem1Sub4Fee;
    private javax.swing.JLabel sem1TotalFee;
    private javax.swing.JLabel sem2PaidLabel;
    private javax.swing.JButton sem2PaymentButton;
    private javax.swing.JLabel sem2Sub1Fee;
    private javax.swing.JLabel sem2Sub2Fee;
    private javax.swing.JLabel sem2Sub3Fee;
    private javax.swing.JLabel sem2Sub4Fee;
    private javax.swing.JLabel sem2TotalFee;
    private javax.swing.JTextField studentIdField;
    // End of variables declaration//GEN-END:variables
}

