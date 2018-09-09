package nsbm;

import com.mysql.cj.Session;
import com.mysql.cj.protocol.Message;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import java.net.PasswordAuthentication;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClasses.SubjectEnrollment;
import javaClasses.Subject;
import javax.swing.JOptionPane;
import sun.rmi.transport.Transport;

public class SubjectSelection extends javax.swing.JFrame {

    private String stuId;
    private String course;
    private String year;
    private String intake;
    
    dbConnection db;
    
    private int sem1Credit = 0;
    private int sem2Credit = 0;
    private int totalCredit = 0;
    
    private int sem1Payment = 0;
    private int sem2Payment = 0;
    
    public SubjectSelection() {
        initComponents();
        setLocation(200,150);
        
        db = new dbConnection();
        db.connection();
    }
    
    public SubjectSelection(String stuid, String course, String year, String intake) throws SQLException{
        initComponents();
        setLocation(120,150);
        
        db = new dbConnection();
        db.connection();
        
        this.stuId = stuid;
        this.course = course;
        this.year = year;
        this.intake = intake;
        
        courseLabel.setText(this.course);
        intakeLabel.setText(this.intake);
        yearLabel.setText(this.year);
        
        if(this.intake.equals("February")){
            try {
                fillSem1ComLabel();
                fillSem1OptCombo();
                
                fillSem2ComLabel();
                fillSem2OptCombo();

            } catch (SQLException ex) {
                Logger.getLogger(SubjectSelection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(this.intake.equals("July")){
            
            compSem1Panel.setEnabled(false);
            try {
                fillSem2ComLabel();
                fillSem2OptCombo();
                
                JOptionPane.showMessageDialog(null, "Subject enrollment is only allowed for Semester 2...!");
                
            } catch (SQLException ex) {
                Logger.getLogger(SubjectSelection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    private void fillSem1ComLabel() throws SQLException{
        try{
            ResultSet rs = db.CompulsorySubjectSelection(course, year, "Sem1");
            
            String [] arr = new String[4];
            int i=0;
            
            while(rs.next()){
                
                String sub = rs.getString("SubName");
                arr[i] = sub;
                i++;
                
                sem1Credit += rs.getInt("SubCredits");
                sem1CreditsLabel.setText(Integer.toString(sem1Credit));
                totalCredit += rs.getInt("SubCredits");
                totalCreditsLabel.setText(Integer.toString(totalCredit));
                
                sem1Payment += rs.getInt("SubFee");
                sem1PaymentLabel.setText(Integer.toString(sem1Payment)+".00");
                
            }
            
            sem1subject1.setText(arr[0]);
            sem1subject2.setText(arr[1]);
            sem1subject3.setText(arr[2]);
            sem1subject4.setText(arr[3]);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void fillSem2ComLabel() throws SQLException{
        try{
            ResultSet rs = db.CompulsorySubjectSelection(course, year, "Sem2");
            
            String [] arr = new String[4];
            int i=0;

            while(rs.next()){
                
                String sub = rs.getString("SubName");
                arr[i] = sub;
                i++;
                
                sem2Credit += rs.getInt("SubCredits");
                sem2CreditsLabel.setText(Integer.toString(sem2Credit));
                totalCredit += rs.getInt("SubCredits");
                totalCreditsLabel.setText(Integer.toString(totalCredit));
                
                sem2Payment += rs.getInt("SubFee");
                sem2PaymentLabel.setText(Integer.toString(sem2Payment)+".00");
                
            }
            
            sem2subject1.setText(arr[0]);
            sem2subject2.setText(arr[1]);
            sem2subject3.setText(arr[2]);
            sem2subject4.setText(arr[3]);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }
    
    private void fillSem1OptCombo() throws SQLException{
        try{
            ResultSet rs = db.OptionalSubjectSelection(course, year, "Sem1");

            while(rs.next()){
                String sub = rs.getString("SubName");

                sem1OptSubject1.addItem(sub);
                sem1OptSubject2.addItem(sub);
                sem1OptSubject3.addItem(sub);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }
    
    private void fillSem2OptCombo() throws SQLException{
        try{
            ResultSet rs = db.OptionalSubjectSelection(course, year, "Sem2");
            
            while(rs.next()){
                String sub = rs.getString("SubName");

                sem2OptSubject1.addItem(sub);
                sem2OptSubject2.addItem(sub);
                sem2OptSubject3.addItem(sub);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        courseLabel = new javax.swing.JLabel();
        compSem1Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sem1OptSubject3 = new javax.swing.JComboBox<>();
        sem1OptSubject1 = new javax.swing.JComboBox<>();
        sem1OptSubject2 = new javax.swing.JComboBox<>();
        sem1subject1 = new javax.swing.JLabel();
        sem1subject2 = new javax.swing.JLabel();
        sem1subject3 = new javax.swing.JLabel();
        sem1subject4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sem1CreditsLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sem1PaymentLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        compSem2Panel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sem2subject1 = new javax.swing.JLabel();
        sem2subject3 = new javax.swing.JLabel();
        sem2subject2 = new javax.swing.JLabel();
        sem2subject4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        sem2OptSubject1 = new javax.swing.JComboBox<>();
        sem2OptSubject2 = new javax.swing.JComboBox<>();
        sem2OptSubject3 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        sem2CreditsLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        sem2PaymentLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        totalCreditsLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        intakeLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        intakeLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1467, 725));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("STXihei", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Subject Selection");

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/3-Gray-Home-icon (1).png"))); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        courseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        courseLabel.setText("Course");

        compSem1Panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        jLabel3.setText("Compulsory Subjects");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        jLabel4.setText("Optional Subjects");

        sem1OptSubject3.setBackground(new java.awt.Color(240, 240, 240));
        sem1OptSubject3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem1OptSubject3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Optional Subject 3>" }));
        sem1OptSubject3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1OptSubject3ActionPerformed(evt);
            }
        });

        sem1OptSubject1.setBackground(new java.awt.Color(240, 240, 240));
        sem1OptSubject1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem1OptSubject1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Optional Subject 1>" }));
        sem1OptSubject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1OptSubject1ActionPerformed(evt);
            }
        });

        sem1OptSubject2.setBackground(new java.awt.Color(240, 240, 240));
        sem1OptSubject2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem1OptSubject2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Optional Subject 2>" }));
        sem1OptSubject2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1OptSubject2ActionPerformed(evt);
            }
        });

        sem1subject1.setBackground(new java.awt.Color(153, 153, 255));
        sem1subject1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem1subject1.setText("subject 1");

        sem1subject2.setBackground(new java.awt.Color(153, 153, 255));
        sem1subject2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem1subject2.setText("subject 2");

        sem1subject3.setBackground(new java.awt.Color(153, 153, 255));
        sem1subject3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem1subject3.setText("subject 3");

        sem1subject4.setBackground(new java.awt.Color(153, 153, 255));
        sem1subject4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem1subject4.setText("subject 4");

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Semester 1 Total Credits     -");

        sem1CreditsLabel.setBackground(new java.awt.Color(204, 204, 204));
        sem1CreditsLabel.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        sem1CreditsLabel.setForeground(new java.awt.Color(0, 0, 153));
        sem1CreditsLabel.setText("<Credit>");

        jLabel11.setFont(new java.awt.Font("STXihei", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Semester 1 Payment (Rs.)   =");

        sem1PaymentLabel.setBackground(new java.awt.Color(204, 204, 204));
        sem1PaymentLabel.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        sem1PaymentLabel.setForeground(new java.awt.Color(0, 0, 153));
        sem1PaymentLabel.setText("<fee>");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Semester 1");

        javax.swing.GroupLayout compSem1PanelLayout = new javax.swing.GroupLayout(compSem1Panel);
        compSem1Panel.setLayout(compSem1PanelLayout);
        compSem1PanelLayout.setHorizontalGroup(
            compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compSem1PanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sem1subject3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sem1subject1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sem1OptSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sem1OptSubject2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sem1OptSubject3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compSem1PanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(compSem1PanelLayout.createSequentialGroup()
                                .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sem1PaymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sem1CreditsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sem1subject2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                .addComponent(sem1subject4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, compSem1PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        compSem1PanelLayout.setVerticalGroup(
            compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compSem1PanelLayout.createSequentialGroup()
                .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compSem1PanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(compSem1PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sem1subject2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sem1subject1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sem1subject3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sem1subject4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, compSem1PanelLayout.createSequentialGroup()
                        .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem1PaymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(compSem1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem1CreditsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, compSem1PanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sem1OptSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(sem1OptSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sem1OptSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        compSem2Panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        jLabel14.setText("Compulsory Subjects");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setText("Semester 2");

        sem2subject1.setBackground(new java.awt.Color(153, 153, 255));
        sem2subject1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem2subject1.setText("sub1");

        sem2subject3.setBackground(new java.awt.Color(153, 153, 255));
        sem2subject3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem2subject3.setText("sub3");

        sem2subject2.setBackground(new java.awt.Color(153, 153, 255));
        sem2subject2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem2subject2.setText("sub2");

        sem2subject4.setBackground(new java.awt.Color(153, 153, 255));
        sem2subject4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem2subject4.setText("sub4");

        jLabel22.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        jLabel22.setText("Optional Subjects");

        sem2OptSubject1.setBackground(new java.awt.Color(240, 240, 240));
        sem2OptSubject1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem2OptSubject1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Optional Subject 1>" }));
        sem2OptSubject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem2OptSubject1ActionPerformed(evt);
            }
        });

        sem2OptSubject2.setBackground(new java.awt.Color(240, 240, 240));
        sem2OptSubject2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem2OptSubject2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Optional Subject 2>" }));
        sem2OptSubject2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem2OptSubject2ActionPerformed(evt);
            }
        });

        sem2OptSubject3.setBackground(new java.awt.Color(240, 240, 240));
        sem2OptSubject3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sem2OptSubject3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Optional Subject 3>" }));
        sem2OptSubject3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem2OptSubject3ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("STXihei", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 153));
        jLabel23.setText("Semester 2 Total Credits     -");

        sem2CreditsLabel.setBackground(new java.awt.Color(204, 204, 204));
        sem2CreditsLabel.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        sem2CreditsLabel.setForeground(new java.awt.Color(0, 0, 153));
        sem2CreditsLabel.setText("<Credit>");

        jLabel25.setFont(new java.awt.Font("STXihei", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 153));
        jLabel25.setText("Semester 2 Payment (Rs.)   =");

        sem2PaymentLabel.setBackground(new java.awt.Color(204, 204, 204));
        sem2PaymentLabel.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        sem2PaymentLabel.setForeground(new java.awt.Color(0, 0, 153));
        sem2PaymentLabel.setText("<fee>");

        javax.swing.GroupLayout compSem2PanelLayout = new javax.swing.GroupLayout(compSem2Panel);
        compSem2Panel.setLayout(compSem2PanelLayout);
        compSem2PanelLayout.setHorizontalGroup(
            compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compSem2PanelLayout.createSequentialGroup()
                .addGroup(compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, compSem2PanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sem2OptSubject3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem2subject1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem2OptSubject1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sem2OptSubject2, 0, 277, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, compSem2PanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(sem2subject3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sem2subject2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                .addComponent(sem2subject4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(compSem2PanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sem2PaymentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sem2CreditsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        compSem2PanelLayout.setVerticalGroup(
            compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, compSem2PanelLayout.createSequentialGroup()
                .addGroup(compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compSem2PanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(compSem2PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sem2subject1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sem2subject2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sem2subject4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sem2subject3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(sem2OptSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compSem2PanelLayout.createSequentialGroup()
                        .addComponent(sem2OptSubject2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, compSem2PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem2PaymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(compSem2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sem2OptSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sem2CreditsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jLabel15.setFont(new java.awt.Font("Stencil", 0, 17)); // NOI18N
        jLabel15.setText("Total Credits for Year");

        totalCreditsLabel.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        totalCreditsLabel.setText("0");

        submitButton.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Sports-Finish-Flag-icon.png"))); // NOI18N
        submitButton.setText("Enroll the Student");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        intakeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        intakeLabel.setText("Intake");

        yearLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        yearLabel.setText("Year");

        intakeLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        intakeLabel1.setText("Intake");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(508, 508, 508)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalCreditsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(373, 373, 373)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(compSem1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(compSem2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(387, 387, 387)
                        .addComponent(intakeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intakeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intakeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intakeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(compSem1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalCreditsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(compSem2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed
    
//    private boolean sendEmail(String std_email){
//        String host = "smtp.gmail.com";
//        final String user = "nsbmgreenuniversitymailcenter@gmail.com";//change accordingly 
//        final String password = "nsbm@123";//change accordingly 
//
//        String to = std_email;//change accordingly 
//        String emailbody= "You are successfully enrolled as a Student of National School of Business Management with Registration No."+this.stuId+"\n Your enrollment details are given below"
//                + "\n Course : "+this.course+"\n Academic Year : "+this.year+"\n Intake : "+this.intake+"\n\t Best of Luck to Your Future Studies!";
//        //Get the session object 
//        Properties props = new Properties();
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.socketFactory.port", "465");
//        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//
//        Session session = Session.getDefaultInstance(props,
//                new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(user, password);
//            }
//        });
//
//        //Compose the message
//        MimeMessage message = new MimeMessage(session);
//        message.setFrom(new InternetAddress(user));
//        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//        message.setSubject("Enrollment Confirmation");
//        message.setText(emailbody);
//        //send the message
//        Transport.send(message);
//        JOptionPane.showMessageDialog(null, "Enrollment Confirmation Email was sent to Student...!");
//        return true;
//
//    
//    }
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if((this.intake.equals("February")) && (sem1OptSubject1.getSelectedItem().toString().equals("<Select Optional Subject 1>") || sem1OptSubject2.getSelectedItem().toString().equals("<Select Optional Subject 2>") || sem1OptSubject3.getSelectedItem().toString().equals("<Select Optional Subject 3>") || 
                sem2OptSubject1.getSelectedItem().toString().equals("<Select Optional Subject 1>") || sem2OptSubject2.getSelectedItem().toString().equals("<Select Optional Subject 2>") || sem2OptSubject3.getSelectedItem().toString().equals("<Select Optional Subject 3>"))){
            
            JOptionPane.showMessageDialog(null, "Select the Optional Subjects for both Semesters...!");
        }
        
        else if(this.intake.equals("July") && (sem2OptSubject1.getSelectedItem().toString().equals("<Select Optional Subject 1>") || sem2OptSubject2.getSelectedItem().toString().equals("<Select Optional Subject 2>") || sem2OptSubject3.getSelectedItem().toString().equals("<Select Optional Subject 3>"))){
            
            JOptionPane.showMessageDialog(null, "Select the Optional Subjects for Semester 2...!");
        }
        
        else{
            SubjectEnrollment cmp = new SubjectEnrollment();
            
            cmp.setSem1ComSub1(sem1subject1.getText());
            cmp.setSem1ComSub2(sem1subject2.getText());
            cmp.setSem1ComSub3(sem1subject3.getText());
            cmp.setSem1ComSub4(sem1subject4.getText());
            
            cmp.setSem1OptSub1(sem1OptSubject1.getSelectedItem().toString());
            cmp.setSem1OptSub2(sem1OptSubject2.getSelectedItem().toString());
            cmp.setSem1OptSub3(sem1OptSubject3.getSelectedItem().toString());
            
            cmp.setSem2ComSub1(sem2subject1.getText());
            cmp.setSem2ComSub2(sem2subject2.getText());
            cmp.setSem2ComSub3(sem2subject3.getText());
            cmp.setSem2ComSub4(sem2subject4.getText());
            
            cmp.setSem2OptSub1(sem2OptSubject1.getSelectedItem().toString());
            cmp.setSem2OptSub2(sem2OptSubject2.getSelectedItem().toString());
            cmp.setSem2OptSub3(sem2OptSubject3.getSelectedItem().toString());
            
            cmp.setSem1Payment(sem1Payment);
            cmp.setSem2Payment(sem2Payment);
            
            cmp.setTotalCredits(totalCredit);
            
            try {
                int exe = db.addOptionalSubjects(this.stuId, cmp);
                
                if(exe == 1){
                    JOptionPane.showMessageDialog(null, "Subject enrollment is Successful...!");
//                    this.setVisible(false);
//                    Payment pay = new Payment(cmp, this.stuId, this.intake);
//                    pay.setVisible(true);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error...!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(SubjectSelection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void sem1OptSubject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1OptSubject1ActionPerformed
        String sub_name = sem1OptSubject1.getSelectedItem().toString();
        
        try{
            ResultSet rs = db.getOptionalSubjectCredits(sub_name);

            if(rs.next()){
                sem1Credit += rs.getInt("SubCredits");
                sem1CreditsLabel.setText(Integer.toString(sem1Credit));
                totalCredit += rs.getInt("SubCredits");
                totalCreditsLabel.setText(Integer.toString(totalCredit));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sem1OptSubject1ActionPerformed

    private void sem1OptSubject2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1OptSubject2ActionPerformed
        String sub_name = sem1OptSubject2.getSelectedItem().toString();
        
        try{
            ResultSet rs = db.getOptionalSubjectCredits(sub_name);

            if(rs.next()){
                sem1Credit += rs.getInt("SubCredits");
                sem1CreditsLabel.setText(Integer.toString(sem1Credit));
                totalCredit += rs.getInt("SubCredits");
                totalCreditsLabel.setText(Integer.toString(totalCredit));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sem1OptSubject2ActionPerformed

    private void sem1OptSubject3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1OptSubject3ActionPerformed
        String sub_name = sem1OptSubject3.getSelectedItem().toString();
        
        try{
            ResultSet rs = db.getOptionalSubjectCredits(sub_name);

            if(rs.next()){
                sem1Credit += rs.getInt("SubCredits");
                sem1CreditsLabel.setText(Integer.toString(sem1Credit));
                totalCredit += rs.getInt("SubCredits");
                totalCreditsLabel.setText(Integer.toString(totalCredit));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sem1OptSubject3ActionPerformed

    private void sem2OptSubject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem2OptSubject1ActionPerformed
        String sub_name = sem2OptSubject1.getSelectedItem().toString();
        
        try{
            ResultSet rs = db.getOptionalSubjectCredits(sub_name);

            if(rs.next()){
                sem2Credit += rs.getInt("SubCredits");
                sem2CreditsLabel.setText(Integer.toString(sem2Credit));
                totalCredit += rs.getInt("SubCredits");
                totalCreditsLabel.setText(Integer.toString(totalCredit));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sem2OptSubject1ActionPerformed

    private void sem2OptSubject2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem2OptSubject2ActionPerformed
        String sub_name = sem2OptSubject2.getSelectedItem().toString();
        
        try{
            ResultSet rs = db.getOptionalSubjectCredits(sub_name);

            if(rs.next()){
                sem2Credit += rs.getInt("SubCredits");
                sem2CreditsLabel.setText(Integer.toString(sem2Credit));
                totalCredit += rs.getInt("SubCredits");
                totalCreditsLabel.setText(Integer.toString(totalCredit));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sem2OptSubject2ActionPerformed

    private void sem2OptSubject3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem2OptSubject3ActionPerformed
        String sub_name = sem2OptSubject3.getSelectedItem().toString();
        
        try{
            ResultSet rs = db.getOptionalSubjectCredits(sub_name);

            if(rs.next()){
                sem2Credit += rs.getInt("SubCredits");
                sem2CreditsLabel.setText(Integer.toString(sem2Credit));
                totalCredit += rs.getInt("SubCredits");
                totalCreditsLabel.setText(Integer.toString(totalCredit));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sem2OptSubject3ActionPerformed

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
            java.util.logging.Logger.getLogger(SubjectSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel compSem1Panel;
    private javax.swing.JPanel compSem2Panel;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel intakeLabel;
    private javax.swing.JLabel intakeLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel sem1CreditsLabel;
    private javax.swing.JComboBox<String> sem1OptSubject1;
    private javax.swing.JComboBox<String> sem1OptSubject2;
    private javax.swing.JComboBox<String> sem1OptSubject3;
    private javax.swing.JLabel sem1PaymentLabel;
    private javax.swing.JLabel sem1subject1;
    private javax.swing.JLabel sem1subject2;
    private javax.swing.JLabel sem1subject3;
    private javax.swing.JLabel sem1subject4;
    private javax.swing.JLabel sem2CreditsLabel;
    private javax.swing.JComboBox<String> sem2OptSubject1;
    private javax.swing.JComboBox<String> sem2OptSubject2;
    private javax.swing.JComboBox<String> sem2OptSubject3;
    private javax.swing.JLabel sem2PaymentLabel;
    private javax.swing.JLabel sem2subject1;
    private javax.swing.JLabel sem2subject2;
    private javax.swing.JLabel sem2subject3;
    private javax.swing.JLabel sem2subject4;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel totalCreditsLabel;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
