
package nsbm;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClasses.Instructor;
import javaClasses.Lecturer;
import javaClasses.Student;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class AdminPanel extends javax.swing.JFrame {

    static Connection conce = null;
    Statement statem = null;
    ResultSet relst = null;
    
    dbConnection db;
    
    Student std;
    Lecturer lectr;
    Instructor instr;
    
    public AdminPanel() throws SQLException {
        initComponents();
        setLocation(120,150);
        loggedUserPanel.setVisible(false);

        stuId.setEditable(false);
        
        db = new dbConnection();
        db.connection();
        
        showStudentTable();
        showLecturerTable();
        showInstructorTable();

       
    }
    
    public AdminPanel(String str) throws SQLException{
        initComponents();
        setLocation(120,150);
        
        loggedUserPanel.setVisible(true);
        loggedUserLabel.setText(str);
      
        stuId.setEditable(false);
        
        db = new dbConnection();
        db.connection();
        
        showStudentTable();
        showLecturerTable();
        showInstructorTable();
   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lecturerGenderButtonGroup = new javax.swing.ButtonGroup();
        studentGenderButtonGroup = new javax.swing.ButtonGroup();
        instrGenderButtonGroup = new javax.swing.ButtonGroup();
        sidePanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        home_indicator = new javax.swing.JPanel();
        lecPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lec_indicator = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        insPanel = new javax.swing.JPanel();
        ins_indicator = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        stuPanel = new javax.swing.JPanel();
        stu_indicator = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        parentPanel = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        loggedUserPanel = new javax.swing.JPanel();
        loggedInAsLabel = new javax.swing.JLabel();
        loggedUserLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        studentRegBtn = new javax.swing.JButton();
        subjectButton = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();
        panelStudent = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        studentSearchButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        stuId = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        contactNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        adres = new javax.swing.JTextArea();
        enrollDate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        studentUpdateButton = new javax.swing.JButton();
        studentDeleteButton = new javax.swing.JButton();
        studentSearchField = new javax.swing.JTextField();
        studentMaleButton = new javax.swing.JRadioButton();
        studentFemaleButton = new javax.swing.JRadioButton();
        studentResetButton = new javax.swing.JButton();
        studentTypeField = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        studentRefreshButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        panelLecturer = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lecturerSearchButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        lecturerSearchField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lecturerId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lecturerLastName = new javax.swing.JTextField();
        lecturerFirstName = new javax.swing.JTextField();
        lecturerEmail = new javax.swing.JTextField();
        lecturerRoom = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lecturerAddButton = new javax.swing.JButton();
        lecturerRemoveButton = new javax.swing.JButton();
        lecturerUpdateButton = new javax.swing.JButton();
        lectrMaleButton = new javax.swing.JRadioButton();
        lectrFemaleButton = new javax.swing.JRadioButton();
        titleCombo = new javax.swing.JComboBox<>();
        lectrResetButton = new javax.swing.JButton();
        lecturerEmptyFieldsLabel = new javax.swing.JLabel();
        facultyCombo = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lecturerTable = new javax.swing.JTable();
        lecturerRefreshButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panelInstructor = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        instrSearchButton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        instrSearchField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        instrIdField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        instrFName = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        instrLName = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        instrMaleButton = new javax.swing.JRadioButton();
        instrFemaleButton = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        instrEmail = new javax.swing.JTextField();
        instrDeleteButton = new javax.swing.JButton();
        instrUpdateButton = new javax.swing.JButton();
        instrAddButton = new javax.swing.JButton();
        instrResetButton = new javax.swing.JButton();
        instructorEmptyFieldsLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        instructorTable = new javax.swing.JTable();
        instructorRefreshButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1760, 750));
        setResizable(false);

        sidePanel.setBackground(new java.awt.Color(0, 0, 102));

        homePanel.setBackground(new java.awt.Color(0, 0, 153));
        homePanel.setPreferredSize(new java.awt.Dimension(320, 70));
        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homePanelMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Home");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/3-Gray-Home-icon (1).png"))); // NOI18N

        home_indicator.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout home_indicatorLayout = new javax.swing.GroupLayout(home_indicator);
        home_indicator.setLayout(home_indicatorLayout);
        home_indicatorLayout.setHorizontalGroup(
            home_indicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        home_indicatorLayout.setVerticalGroup(
            home_indicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(home_indicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(home_indicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lecPanel.setBackground(new java.awt.Color(0, 0, 102));
        lecPanel.setPreferredSize(new java.awt.Dimension(320, 70));
        lecPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lecPanelMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Lecturers");

        lec_indicator.setBackground(new java.awt.Color(204, 204, 204));
        lec_indicator.setOpaque(false);

        javax.swing.GroupLayout lec_indicatorLayout = new javax.swing.GroupLayout(lec_indicator);
        lec_indicator.setLayout(lec_indicatorLayout);
        lec_indicatorLayout.setHorizontalGroup(
            lec_indicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        lec_indicatorLayout.setVerticalGroup(
            lec_indicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\samin\\OneDrive\\Pictures\\bullet-arrow-right-icon.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/teacher-icon.png"))); // NOI18N

        javax.swing.GroupLayout lecPanelLayout = new javax.swing.GroupLayout(lecPanel);
        lecPanel.setLayout(lecPanelLayout);
        lecPanelLayout.setHorizontalGroup(
            lecPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecPanelLayout.createSequentialGroup()
                .addComponent(lec_indicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(29, 29, 29))
        );
        lecPanelLayout.setVerticalGroup(
            lecPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lec_indicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lecPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(lecPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lecPanelLayout.createSequentialGroup()
                        .addGroup(lecPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lecPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lecPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30))))
        );

        insPanel.setBackground(new java.awt.Color(0, 0, 102));
        insPanel.setPreferredSize(new java.awt.Dimension(320, 70));
        insPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insPanelMousePressed(evt);
            }
        });

        ins_indicator.setBackground(new java.awt.Color(204, 204, 204));
        ins_indicator.setOpaque(false);

        javax.swing.GroupLayout ins_indicatorLayout = new javax.swing.GroupLayout(ins_indicator);
        ins_indicator.setLayout(ins_indicatorLayout);
        ins_indicatorLayout.setHorizontalGroup(
            ins_indicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        ins_indicatorLayout.setVerticalGroup(
            ins_indicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Instructors");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\samin\\OneDrive\\Pictures\\bullet-arrow-right-icon.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Teacher-female-icon.png"))); // NOI18N

        javax.swing.GroupLayout insPanelLayout = new javax.swing.GroupLayout(insPanel);
        insPanel.setLayout(insPanelLayout);
        insPanelLayout.setHorizontalGroup(
            insPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insPanelLayout.createSequentialGroup()
                .addComponent(ins_indicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(30, 30, 30))
        );
        insPanelLayout.setVerticalGroup(
            insPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ins_indicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(insPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(insPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        stuPanel.setBackground(new java.awt.Color(0, 0, 102));
        stuPanel.setPreferredSize(new java.awt.Dimension(320, 70));
        stuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stuPanelMousePressed(evt);
            }
        });

        stu_indicator.setBackground(new java.awt.Color(204, 204, 204));
        stu_indicator.setOpaque(false);

        javax.swing.GroupLayout stu_indicatorLayout = new javax.swing.GroupLayout(stu_indicator);
        stu_indicator.setLayout(stu_indicatorLayout);
        stu_indicatorLayout.setHorizontalGroup(
            stu_indicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        stu_indicatorLayout.setVerticalGroup(
            stu_indicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Students");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\samin\\OneDrive\\Pictures\\bullet-arrow-right-icon.png")); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/engineer-icon.png"))); // NOI18N

        javax.swing.GroupLayout stuPanelLayout = new javax.swing.GroupLayout(stuPanel);
        stuPanel.setLayout(stuPanelLayout);
        stuPanelLayout.setHorizontalGroup(
            stuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stuPanelLayout.createSequentialGroup()
                .addComponent(stu_indicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(30, 30, 30))
        );
        stuPanelLayout.setVerticalGroup(
            stuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stu_indicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stuPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(stuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stuPanelLayout.createSequentialGroup()
                        .addGroup(stuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addGroup(stuPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(12, 12, 12)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stuPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
            .addComponent(insPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
            .addComponent(lecPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
            .addComponent(stuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(stuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lecPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parentPanel.setLayout(new java.awt.CardLayout());

        panelHome.setBackground(new java.awt.Color(153, 153, 255));

        loggedUserPanel.setBackground(new java.awt.Color(153, 153, 255));

        loggedInAsLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        loggedInAsLabel.setText("You are logged in as");

        loggedUserLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        loggedUserLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loggedUserPanelLayout = new javax.swing.GroupLayout(loggedUserPanel);
        loggedUserPanel.setLayout(loggedUserPanelLayout);
        loggedUserPanelLayout.setHorizontalGroup(
            loggedUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loggedUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loggedInAsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loggedUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        loggedUserPanelLayout.setVerticalGroup(
            loggedUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loggedUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loggedUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loggedUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loggedInAsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\samin\\OneDrive\\Pictures\\Actions-system-log-out-icon.png")); // NOI18N
        logoutButton.setText("LOG OUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 2, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("National School of Bussiness Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        studentRegBtn.setFont(new java.awt.Font("STXihei", 1, 25)); // NOI18N
        studentRegBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Student-MaleFemale-icon (2).png"))); // NOI18N
        studentRegBtn.setText("Student Registration");
        studentRegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRegBtnActionPerformed(evt);
            }
        });

        subjectButton.setFont(new java.awt.Font("STXihei", 1, 16)); // NOI18N
        subjectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/student-id-icon.png"))); // NOI18N
        subjectButton.setText("Subjects");
        subjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectButtonActionPerformed(evt);
            }
        });

        paymentButton.setFont(new java.awt.Font("STXihei", 1, 16)); // NOI18N
        paymentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/money-icon (1).png"))); // NOI18N
        paymentButton.setText("Payments");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addComponent(loggedUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(studentRegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subjectButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(163, 163, 163))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loggedUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(studentRegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(subjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(paymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        parentPanel.add(panelHome, "card2");

        panelStudent.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        studentSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/search-icon.png"))); // NOI18N
        studentSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSearchButtonActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Kristen ITC", 1, 15)); // NOI18N
        jLabel16.setText("Registration Number");

        stuId.setBackground(new java.awt.Color(204, 204, 255));
        stuId.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        firstName.setBackground(new java.awt.Color(204, 204, 255));
        firstName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        lastName.setBackground(new java.awt.Color(204, 204, 255));
        lastName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        dob.setBackground(new java.awt.Color(204, 204, 255));
        dob.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        email.setBackground(new java.awt.Color(204, 204, 255));
        email.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        contactNo.setBackground(new java.awt.Color(204, 204, 255));
        contactNo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        adres.setBackground(new java.awt.Color(204, 204, 255));
        adres.setColumns(20);
        adres.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        adres.setRows(5);
        jScrollPane1.setViewportView(adres);

        enrollDate.setBackground(new java.awt.Color(204, 204, 255));
        enrollDate.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Kristen ITC", 1, 15)); // NOI18N
        jLabel17.setText("First Name");

        jLabel18.setFont(new java.awt.Font("Kristen ITC", 1, 15)); // NOI18N
        jLabel18.setText("Last Name");

        jLabel19.setFont(new java.awt.Font("Kristen ITC", 1, 15)); // NOI18N
        jLabel19.setText("Gender");

        jLabel20.setFont(new java.awt.Font("Kristen ITC", 1, 15)); // NOI18N
        jLabel20.setText("Date Of Birth");

        jLabel21.setFont(new java.awt.Font("Kristen ITC", 1, 15)); // NOI18N
        jLabel21.setText("E-mail");

        jLabel22.setFont(new java.awt.Font("Kristen ITC", 1, 15)); // NOI18N
        jLabel22.setText("Contact No.");

        jLabel23.setFont(new java.awt.Font("Kristen ITC", 1, 15)); // NOI18N
        jLabel23.setText("Enrollment Date");

        jLabel24.setFont(new java.awt.Font("Kristen ITC", 1, 15)); // NOI18N
        jLabel24.setText("Address");

        studentUpdateButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        studentUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/update-icon.png"))); // NOI18N
        studentUpdateButton.setText("Update Student");
        studentUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentUpdateButtonActionPerformed(evt);
            }
        });

        studentDeleteButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        studentDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/user-remove-icon (1).png"))); // NOI18N
        studentDeleteButton.setText("Remove Student");
        studentDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDeleteButtonActionPerformed(evt);
            }
        });

        studentSearchField.setBackground(new java.awt.Color(153, 153, 255));
        studentSearchField.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        studentSearchField.setForeground(new java.awt.Color(102, 102, 102));
        studentSearchField.setText("        Search Here .....");
        studentSearchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentSearchFieldMouseClicked(evt);
            }
        });

        studentMaleButton.setBackground(new java.awt.Color(204, 204, 255));
        studentGenderButtonGroup.add(studentMaleButton);
        studentMaleButton.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        studentMaleButton.setText("Male");
        studentMaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentMaleButtonActionPerformed(evt);
            }
        });

        studentFemaleButton.setBackground(new java.awt.Color(204, 204, 255));
        studentGenderButtonGroup.add(studentFemaleButton);
        studentFemaleButton.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        studentFemaleButton.setText("Female");
        studentFemaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentFemaleButtonActionPerformed(evt);
            }
        });

        studentResetButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Reset-icon.png"))); // NOI18N
        studentResetButton.setText("Reset");
        studentResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentResetButtonActionPerformed(evt);
            }
        });

        studentTypeField.setBackground(new java.awt.Color(204, 204, 255));
        studentTypeField.setFont(new java.awt.Font("Showcard Gothic", 0, 16)); // NOI18N
        studentTypeField.setText("student type");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(studentTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stuId, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(studentSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(studentMaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(studentFemaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(email)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 63, Short.MAX_VALUE)))
                                                .addGap(21, 21, 21))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(enrollDate)
                                                .addGap(63, 63, 63)))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(studentUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(studentDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(9, 9, 9)))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(studentResetButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(studentSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(studentSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(stuId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(studentTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentFemaleButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(studentMaleButton))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enrollDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentResetButton)
                .addGap(104, 104, 104))
        );

        studentTable.setBackground(new java.awt.Color(153, 153, 255));
        studentTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        studentTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "First Name", "Last Name", "Email"
            }
        ));
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentTable);

        studentRefreshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentRefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Refresh-icon.png"))); // NOI18N
        studentRefreshButton.setText("Refresh Table");
        studentRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRefreshButtonActionPerformed(evt);
            }
        });

        viewButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewButton.setText("View Academic Details");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(studentRefreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelStudentLayout = new javax.swing.GroupLayout(panelStudent);
        panelStudent.setLayout(panelStudentLayout);
        panelStudentLayout.setHorizontalGroup(
            panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelStudentLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStudentLayout.setVerticalGroup(
            panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStudentLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        parentPanel.add(panelStudent, "card3");

        panelLecturer.setBackground(new java.awt.Color(153, 153, 255));

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));

        lecturerSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/search-icon.png"))); // NOI18N
        lecturerSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerSearchButtonActionPerformed(evt);
            }
        });

        lecturerSearchField.setBackground(new java.awt.Color(153, 153, 255));
        lecturerSearchField.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        lecturerSearchField.setForeground(new java.awt.Color(102, 102, 102));
        lecturerSearchField.setText("       Search Here ....");
        lecturerSearchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecturerSearchFieldMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Lecturer Id");

        lecturerId.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Title");

        lecturerLastName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        lecturerFirstName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        lecturerEmail.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        lecturerRoom.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setText("First Name");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("Last Name");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setText("Gender");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setText("E-mail");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setText("Room");

        lecturerAddButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lecturerAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/user-add-icon.png"))); // NOI18N
        lecturerAddButton.setText("Add Lecturer");
        lecturerAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerAddButtonActionPerformed(evt);
            }
        });

        lecturerRemoveButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lecturerRemoveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/user-remove-icon (1).png"))); // NOI18N
        lecturerRemoveButton.setText("Remove Lecturer");
        lecturerRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerRemoveButtonActionPerformed(evt);
            }
        });

        lecturerUpdateButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lecturerUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/update-icon.png"))); // NOI18N
        lecturerUpdateButton.setText("Update Lecturer");
        lecturerUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerUpdateButtonActionPerformed(evt);
            }
        });

        lectrMaleButton.setBackground(new java.awt.Color(153, 153, 255));
        lecturerGenderButtonGroup.add(lectrMaleButton);
        lectrMaleButton.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lectrMaleButton.setText("Male");
        lectrMaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectrMaleButtonActionPerformed(evt);
            }
        });

        lectrFemaleButton.setBackground(new java.awt.Color(153, 153, 255));
        lecturerGenderButtonGroup.add(lectrFemaleButton);
        lectrFemaleButton.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lectrFemaleButton.setText("Female");
        lectrFemaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectrFemaleButtonActionPerformed(evt);
            }
        });

        titleCombo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        titleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Titles>", "Prof.", "Dr.", "Mr.", "Mrs.", "Ms." }));

        lectrResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Reset-icon.png"))); // NOI18N
        lectrResetButton.setText("Reset");
        lectrResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectrResetButtonActionPerformed(evt);
            }
        });

        lecturerEmptyFieldsLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lecturerEmptyFieldsLabel.setForeground(new java.awt.Color(255, 0, 51));

        facultyCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Computing", "School of Engineering", "School of Business" }));
        facultyCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyComboActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setText("Faculty");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addComponent(lecturerSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lecturerSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lecturerRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lecturerUpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lecturerAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lecturerId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lectrResetButton)
                        .addGap(27, 27, 27)
                        .addComponent(lecturerEmptyFieldsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(lectrMaleButton)
                                    .addGap(55, 55, 55)
                                    .addComponent(lectrFemaleButton))
                                .addComponent(lecturerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(lecturerRoom)
                                    .addGap(87, 87, 87)))
                            .addGap(251, 251, 251))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lecturerFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(titleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addGap(18, 18, 18)
                                    .addComponent(lecturerLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel34)
                                    .addGap(18, 18, 18)
                                    .addComponent(facultyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(26, 26, 26)))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lecturerSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lecturerSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecturerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecturerLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecturerFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lectrMaleButton)
                    .addComponent(lectrFemaleButton))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecturerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecturerRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lectrResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecturerEmptyFieldsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lecturerRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lecturerUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lecturerAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );

        lecturerTable.setBackground(new java.awt.Color(153, 153, 255));
        lecturerTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lecturerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Lecturer ID", "First Name", "Last Name", "Email"
            }
        ));
        lecturerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecturerTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lecturerTable);

        lecturerRefreshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lecturerRefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Refresh-icon.png"))); // NOI18N
        lecturerRefreshButton.setText("Refresh Table");
        lecturerRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerRefreshButtonActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("View Other Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lecturerRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(93, 93, 93))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecturerRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLecturerLayout = new javax.swing.GroupLayout(panelLecturer);
        panelLecturer.setLayout(panelLecturerLayout);
        panelLecturerLayout.setHorizontalGroup(
            panelLecturerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLecturerLayout.createSequentialGroup()
                .addGroup(panelLecturerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLecturerLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLecturerLayout.setVerticalGroup(
            panelLecturerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLecturerLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLecturerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        parentPanel.add(panelLecturer, "card4");

        panelInstructor.setBackground(new java.awt.Color(255, 255, 255));
        panelInstructor.setPreferredSize(new java.awt.Dimension(1402, 701));

        jPanel7.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1425, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(153, 153, 255));

        instrSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/search-icon.png"))); // NOI18N
        instrSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrSearchButtonActionPerformed(evt);
            }
        });

        instrSearchField.setBackground(new java.awt.Color(153, 153, 255));
        instrSearchField.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        instrSearchField.setForeground(new java.awt.Color(102, 102, 102));
        instrSearchField.setText("     Search Here.....");
        instrSearchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instrSearchFieldMouseClicked(evt);
            }
        });
        instrSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrSearchFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Instructor Id");

        instrIdField.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setText("First Name");

        instrFName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setText("Last Name");

        instrLName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel32.setText("Gender");

        instrMaleButton.setBackground(new java.awt.Color(153, 153, 255));
        instrGenderButtonGroup.add(instrMaleButton);
        instrMaleButton.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        instrMaleButton.setText("Male");
        instrMaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrMaleButtonActionPerformed(evt);
            }
        });

        instrFemaleButton.setBackground(new java.awt.Color(153, 153, 255));
        instrGenderButtonGroup.add(instrFemaleButton);
        instrFemaleButton.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        instrFemaleButton.setText("Female");
        instrFemaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrFemaleButtonActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setText("Email");

        instrEmail.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N

        instrDeleteButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        instrDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/user-remove-icon (1).png"))); // NOI18N
        instrDeleteButton.setText("Remove");
        instrDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrDeleteButtonActionPerformed(evt);
            }
        });

        instrUpdateButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        instrUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/update-icon.png"))); // NOI18N
        instrUpdateButton.setText("Update");
        instrUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrUpdateButtonActionPerformed(evt);
            }
        });

        instrAddButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        instrAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/user-add-icon.png"))); // NOI18N
        instrAddButton.setText("Add New Instructor");
        instrAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrAddButtonActionPerformed(evt);
            }
        });

        instrResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Reset-icon.png"))); // NOI18N
        instrResetButton.setText("Reset");
        instrResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrResetButtonActionPerformed(evt);
            }
        });

        instructorEmptyFieldsLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        instructorEmptyFieldsLabel.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4)
                    .addComponent(instrSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instrSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(instrDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(instrFName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(instrLName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(instrMaleButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(instrFemaleButton))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(instrUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(instrAddButton))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(instrIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(instructorEmptyFieldsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(instrResetButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(instrSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(instrSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instrIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instrFName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instrLName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instrMaleButton)
                    .addComponent(instrFemaleButton))
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instrEmail)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(instrResetButton)
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instrDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instrUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instrAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(instructorEmptyFieldsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        instructorTable.setBackground(new java.awt.Color(153, 153, 255));
        instructorTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        instructorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Instructor ID", "First Name", "Last Name", "Email"
            }
        ));
        instructorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instructorTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(instructorTable);

        instructorRefreshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructorRefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Refresh-icon.png"))); // NOI18N
        instructorRefreshButton.setText("Refresh Table");
        instructorRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructorRefreshButtonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("View Other Details");

        javax.swing.GroupLayout panelInstructorLayout = new javax.swing.GroupLayout(panelInstructor);
        panelInstructor.setLayout(panelInstructorLayout);
        panelInstructorLayout.setHorizontalGroup(
            panelInstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelInstructorLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInstructorLayout.createSequentialGroup()
                        .addComponent(instructorRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addContainerGap())
                    .addComponent(jScrollPane4)))
        );
        panelInstructorLayout.setVerticalGroup(
            panelInstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInstructorLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelInstructorLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instructorRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        parentPanel.add(panelInstructor, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(parentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        setVisible(false);
           Login lgp = new Login();
           lgp.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void insPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insPanelMousePressed
        
        setColor(insPanel);
        resetColor(homePanel);
        resetColor(lecPanel);
        resetColor(stuPanel);
        ins_indicator.setOpaque(true);
        home_indicator.setOpaque(false);
        lec_indicator.setOpaque(false);
        stu_indicator.setOpaque(false);
        
        parentPanel.removeAll();
        parentPanel.add(panelInstructor);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_insPanelMousePressed

    private void homePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMousePressed
        
        setColor(homePanel);
        resetColor(lecPanel);
        resetColor(insPanel);
        resetColor(stuPanel);
        home_indicator.setOpaque(true);
        lec_indicator.setOpaque(false);
        ins_indicator.setOpaque(false);
        stu_indicator.setOpaque(false);
        
        parentPanel.removeAll();
        parentPanel.add(panelHome);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_homePanelMousePressed

    private void lecPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecPanelMousePressed
        
        setColor(lecPanel);
        resetColor(homePanel);
        resetColor(insPanel);
        resetColor(stuPanel);
        lec_indicator.setOpaque(true);
        home_indicator.setOpaque(false);
        ins_indicator.setOpaque(false);
        stu_indicator.setOpaque(false);
        
        parentPanel.removeAll();
        parentPanel.add(panelLecturer);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_lecPanelMousePressed

    private void studentRegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRegBtnActionPerformed

        FacultySelection fac = new FacultySelection();
        fac.setVisible(true);
    }//GEN-LAST:event_studentRegBtnActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        Payment pay = new Payment();
        pay.setVisible(true);
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void stuPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stuPanelMousePressed
        
        setColor(stuPanel);
        resetColor(homePanel);
        resetColor(insPanel);
        resetColor(lecPanel);
        stu_indicator.setOpaque(true);
        home_indicator.setOpaque(false);
        ins_indicator.setOpaque(false);
        lec_indicator.setOpaque(false);
        
        parentPanel.removeAll();
        parentPanel.add(panelStudent);
        parentPanel.repaint();
        parentPanel.revalidate();

    }//GEN-LAST:event_stuPanelMousePressed

    private void subjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectButtonActionPerformed
        try {
            SubjectHandling subject = new SubjectHandling();
            subject.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subjectButtonActionPerformed

    private void studentUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentUpdateButtonActionPerformed
        try{
            std = new Student();
            
            if(studentMaleButton.isSelected()){
                stuGender = "Male";
            }
            else if(studentFemaleButton.isSelected()){
                stuGender = "Female";
            }
            
            std.setstuId(stuId.getText());
            std.setfirstName(firstName.getText());
            std.setlastname(lastName.getText());
            std.setgender(stuGender);
            std.setemail(email.getText());
            std.setcontactNo(contactNo.getText());
            std.setdob(dob.getText());
            std.setenrolldate(enrollDate.getText());
            std.setaddress(adres.getText());
            
            int exe = db.updateStudent(std);
            
            if(exe == 1){
            JOptionPane.showMessageDialog(null, "Student Details Updated Successfully!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Something went wrong...!");
            }
        }
        catch(HeadlessException | SQLException er){
            JOptionPane.showMessageDialog(null, er);
        }
    }//GEN-LAST:event_studentUpdateButtonActionPerformed

    private void studentDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDeleteButtonActionPerformed
        
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove the Student from the System?", "Delete", JOptionPane.YES_NO_OPTION);
        if(confirm == 0){
        try{
            
            std = new Student();
            
            std.setstuId(stuId.getText());
    
            db.deleteStudent(std);

            JOptionPane.showMessageDialog(null, "Student with Registration No. '"+std.getstuId()+"' was Removed from the System...!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        stuReset();
        }
    }//GEN-LAST:event_studentDeleteButtonActionPerformed

    private void studentSearchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentSearchFieldMouseClicked
        studentSearchField.setText(null);
    }//GEN-LAST:event_studentSearchFieldMouseClicked

    private void studentSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSearchButtonActionPerformed
        try{
            String search = studentSearchField.getText();

            ResultSet rs = db.searchStudent(search);

            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Student is found");
                stuId.setText(rs.getString("Student_Id"));
                firstName.setText(rs.getString("FirstName"));
                lastName.setText(rs.getString("LastName"));
                dob.setText(rs.getString("DateOfBirth"));
                email.setText(rs.getString("Email"));
                contactNo.setText(rs.getString("ContactNo"));
                adres.setText(rs.getString("Address"));
                if(rs.getString("Gender").equals("Male")){
                    studentMaleButton.setSelected(true);
                }
                else if(rs.getString("Gender").equals("Female")){
                    studentFemaleButton.setSelected(true);
                }
                enrollDate.setText(rs.getString("EnrollDate"));
                studentTypeField.setText(rs.getString("StudentType")+"  Student");
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Student not found!");
            }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_studentSearchButtonActionPerformed
    
    
    /*Creating JTables for Students, Lecturers and Instructors*/
    
    public ArrayList<Student> studentList() throws SQLException{
    
        ArrayList<Student> studentList = new ArrayList<>();
        relst = db.studentFieldSelection();
        while(relst.next()){
            std = new Student();
            std.setstuId(relst.getString("Student_Id"));
            std.setfirstName(relst.getString("FirstName"));
            std.setlastname(relst.getString("LastName"));
            std.setemail(relst.getString("Email"));
            studentList.add(std);
        }
        return studentList;
    }
    
    public void showStudentTable() throws SQLException{
        
        ArrayList<Student> list = studentList();
        DefaultTableModel model = (DefaultTableModel)studentTable.getModel();
        Object[] row = new Object[4];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getstuId();
            row[1] = list.get(i).getfirstName();
            row[2] = list.get(i).getlastName();
            row[3] = list.get(i).getemail();
            model.addRow(row);
        }
    }
    
    public ArrayList<Lecturer> lecturerList() throws SQLException{
    
        ArrayList<Lecturer> lecturerList = new ArrayList<>();
        relst = db.lecturerFieldSelection();
        while(relst.next()){
            lectr = new Lecturer();
            lectr.setLecturerId(relst.getString("Lecr_Id"));
            lectr.setFirstName(relst.getString("FirstName"));
            lectr.setLastName(relst.getString("LastName"));
            lectr.setEmail(relst.getString("Email"));
            lectr.setTitle(relst.getString("Title"));
            lecturerList.add(lectr);
        }
        return lecturerList;
    }
    
    public void showLecturerTable() throws SQLException{
        
        ArrayList<Lecturer> list = lecturerList();
        DefaultTableModel model = (DefaultTableModel)lecturerTable.getModel();
        Object[] row = new Object[5];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getTitle();
            row[1] = list.get(i).getLecturerId();
            row[2] = list.get(i).getFirstName();
            row[3] = list.get(i).getLastName();
            row[4] = list.get(i).getEmail();
            model.addRow(row);
        }
    }
    
    public ArrayList<Instructor> instructorList() throws SQLException{
    
        ArrayList<Instructor> instructorList = new ArrayList<>();
        relst = db.instructorFieldSelection();
        while(relst.next()){
            instr = new Instructor();
            instr.setInstrId(relst.getString("Instrct_Id"));
            instr.setFirstName(relst.getString("FirstName"));
            instr.setLastName(relst.getString("LastName"));
            instr.setEmail(relst.getString("Email"));
            instructorList.add(instr);
        }
        return instructorList;
    }
    
    public void showInstructorTable() throws SQLException{
        
        ArrayList<Instructor> list = instructorList();
        DefaultTableModel model = (DefaultTableModel)instructorTable.getModel();
        Object[] row = new Object[4];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getInstrId();
            row[1] = list.get(i).getFirstName();
            row[2] = list.get(i).getLastName();
            row[3] = list.get(i).getEmail();
            model.addRow(row);
        }
    }
    
    
    
    
    private void lecturerSearchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerSearchFieldMouseClicked
        lecturerSearchField.setText(null);
    }//GEN-LAST:event_lecturerSearchFieldMouseClicked

    private void lecturerAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerAddButtonActionPerformed
        if(lecturerId.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lecture Id field cannot be empty!");
        }
        else if(lecturerId.getText().length() > 7){
            lecturerEmptyFieldsLabel.setText("*Invalid Lecturer Id!");
        }
        else if(lecturerFirstName.getText().equals("") || lecturerLastName.getText().equals("") || lecturerEmail.getText().equals("") || lecturerRoom.getText().equals("")){
            lecturerEmptyFieldsLabel.setText("*Some Fields are Empty!");
        }
        else if(!lectrMaleButton.isSelected() && !lectrFemaleButton.isSelected()){
            lecturerEmptyFieldsLabel.setText("*Select the Gender!");
        }
        else if(titleCombo.getSelectedItem().toString().equals("<Titles>")){
            lecturerEmptyFieldsLabel.setText("*Select the Title!");
        }
        else{
            
            try {
                relst = db.lecturerSelection(lecturerId.getText());
                if(relst.next()){
                    JOptionPane.showMessageDialog(null,"Lecturer Id is not available...!");
                }
                else{
                    lectr = new Lecturer();
            
                    lectr.setLecturerId(lecturerId.getText());
                    lectr.setFirstName(lecturerFirstName.getText());
                    lectr.setLastName(lecturerLastName.getText());
                    lectr.setTitle(titleCombo.getSelectedItem().toString());
                    lectr.setEmail(lecturerEmail.getText());
                    lectr.setGender(lecGender);
                    lectr.setRoom(lecturerRoom.getText());
                    lectr.setFaculty(facultyCombo.getSelectedItem().toString());
            
                    try {
                        int exe = db.insertLecturer(lectr);

                        if(exe == 1){
                            JOptionPane.showMessageDialog(null, "Lecturer Insertion is Successful!");
                            lecReset();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Insertion is Unsuccessful..! Try Again!");
                        }
                    } 
                    catch (SQLException ex) {
                        Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lecturerAddButtonActionPerformed

    private void lecturerSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerSearchButtonActionPerformed
        try{
            String search = lecturerSearchField.getText();

            ResultSet rs = db.searchLecturer(search);

            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Lecturer is found");
                lecturerId.setText(rs.getString("Lecr_Id"));
                lecturerFirstName.setText(rs.getString("FirstName"));
                lecturerLastName.setText(rs.getString("LastName"));
                titleCombo.setSelectedItem(rs.getString("Title"));
                lecturerEmail.setText(rs.getString("Email"));
                lecturerRoom.setText(rs.getString("Room"));
                switch (rs.getString("Gender")) {
                    case "Male":
                        lectrMaleButton.setSelected(true);
                        break;
                    case "Female":
                        lectrFemaleButton.setSelected(true);
                        break;
                    default:
                        break;
                }
                facultyCombo.setSelectedItem(rs.getString("Faculty"));
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Lecturer not found!");
            }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_lecturerSearchButtonActionPerformed

    private void lectrMaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectrMaleButtonActionPerformed
        lecGender = "Male";
    }//GEN-LAST:event_lectrMaleButtonActionPerformed

    private void lectrFemaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectrFemaleButtonActionPerformed
        lecGender = "Female";
    }//GEN-LAST:event_lectrFemaleButtonActionPerformed

    private void studentMaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentMaleButtonActionPerformed
        stuGender = "Male";
    }//GEN-LAST:event_studentMaleButtonActionPerformed

    private void studentFemaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentFemaleButtonActionPerformed
        stuGender = "Female";
    }//GEN-LAST:event_studentFemaleButtonActionPerformed

    private void lecturerRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerRemoveButtonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove the Lecturer from the System?", "Delete", JOptionPane.YES_NO_OPTION);
        if(confirm == 0){
        try{
            lectr = new Lecturer();
            
            lectr.setLecturerId(lecturerId.getText());
    
            db.deleteLecturer(lectr);

            JOptionPane.showMessageDialog(null, "Lecturer with Lecturer Id No. '"+lectr.getLecturerId()+"' was Removed from the System...!");
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        lecReset();
        }
    }//GEN-LAST:event_lecturerRemoveButtonActionPerformed

    private void lecturerUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerUpdateButtonActionPerformed
        try{
            lectr = new Lecturer();
            
            if(lectrMaleButton.isSelected()){
                lecGender = "Male";
            }
            else if(lectrFemaleButton.isSelected()){
                lecGender = "Female";
            }
            
            lectr.setLecturerId(lecturerId.getText());
            lectr.setFirstName(lecturerFirstName.getText());
            lectr.setLastName(lecturerLastName.getText());
            lectr.setGender(lecGender);
            lectr.setEmail(lecturerEmail.getText());
            lectr.setRoom(lecturerRoom.getText());
            lectr.setTitle(titleCombo.getSelectedItem().toString());
            
            int exe = db.updateLecturer(lectr);
            
            if(exe == 1){
                JOptionPane.showMessageDialog(null, "Lecturer Details Updated Successfully!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Something went wrong...!");
            }
        }
        catch(HeadlessException | SQLException er){
            JOptionPane.showMessageDialog(null, er);
        }
    }//GEN-LAST:event_lecturerUpdateButtonActionPerformed

    private void lectrResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectrResetButtonActionPerformed
        lecReset();
    }//GEN-LAST:event_lectrResetButtonActionPerformed

    private void instrSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrSearchButtonActionPerformed
        try{
            String search = instrSearchField.getText();

            ResultSet rs = db.searchInstructor(search);

            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Instructor is found");
                instrIdField.setText(rs.getString("Instrct_Id"));
                instrFName.setText(rs.getString("FirstName"));
                instrLName.setText(rs.getString("LastName"));
                instrEmail.setText(rs.getString("Email"));
                if(rs.getString("Gender").equals("Male")){
                    instrMaleButton.setSelected(true);
                }
                else if(rs.getString("Gender").equals("Female")){
                    instrFemaleButton.setSelected(true);
                }
                else{}
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Instructor is not found!");
            }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_instrSearchButtonActionPerformed

    private void instrSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrSearchFieldActionPerformed

    }//GEN-LAST:event_instrSearchFieldActionPerformed

    private void instrSearchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instrSearchFieldMouseClicked
        instrSearchField.setText(null);
    }//GEN-LAST:event_instrSearchFieldMouseClicked

    private void instrUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrUpdateButtonActionPerformed
        try{
            instr = new Instructor();
            
            if(instrMaleButton.isSelected()){
                insGender = "Male";
            }
            else if(instrFemaleButton.isSelected()){
                insGender = "Female";
            }
            
            instr.setInstrId(instrIdField.getText());
            instr.setFirstName(instrFName.getText());
            instr.setLastName(instrLName.getText());
            instr.setGender(insGender);
            instr.setEmail(instrEmail.getText());
            
            int exe = 0;
            exe = db.updateInstructor(instr);
            
            if(exe == 1){
                JOptionPane.showMessageDialog(null, "Instructor Details Updated Successfully!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Something went wrong...!");
            }
        }
        catch(HeadlessException er){
            JOptionPane.showMessageDialog(null, er);
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_instrUpdateButtonActionPerformed

    private void instrMaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrMaleButtonActionPerformed
        insGender = "Male";
    }//GEN-LAST:event_instrMaleButtonActionPerformed

    private void instrFemaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrFemaleButtonActionPerformed
        insGender = "Female";
    }//GEN-LAST:event_instrFemaleButtonActionPerformed

    private void instrAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrAddButtonActionPerformed
        if(instrIdField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Instructor Id field cannot be Empty!");
        }
        else if(instrIdField.getText().length() > 7){
            instructorEmptyFieldsLabel.setText("*Invalid Instructor Id!");
        }
        else if(instrFName.getText().equals("") || instrLName.getText().equals("") || instrEmail.getText().equals("")){
            instructorEmptyFieldsLabel.setText("*Some Fields are Empty!");
        }
        else if(!instrMaleButton.isSelected() && !instrFemaleButton.isSelected()){
            instructorEmptyFieldsLabel.setText("*Select the Gender!");
        }
        else{
            
            try {
                relst = db.instructorSelection(instrIdField.getText());
                if(relst.next()){
                    JOptionPane.showMessageDialog(null, "Instructor Id is not available...!");
                }
                else{
                
                    instr = new Instructor();
            
                    instr.setInstrId(instrIdField.getText());
                    instr.setFirstName(instrFName.getText());
                    instr.setLastName(instrLName.getText());
                    instr.setEmail(instrEmail.getText());
                    instr.setGender(insGender);

                    int exe = 0;
                    try {
                    exe = db.insertInstructor(instr);
                    } 
                    catch (SQLException ex) {
                        Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(exe == 1){
                        JOptionPane.showMessageDialog(null, "Instructor Insertion is Successful!");
                        lecReset();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Insertion is Unsuccessful..! Try Again!");
                    }
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
    }//GEN-LAST:event_instrAddButtonActionPerformed

    private void instrDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrDeleteButtonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove the Instructor from the System?", "Delete", JOptionPane.YES_NO_OPTION);
        if(confirm == 0){
        try{
            instr = new Instructor();
            
            instr.setInstrId(instrIdField.getText());
    
            db.deleteInstructor(instr);

            JOptionPane.showMessageDialog(null, "Instructor with Instructor Id No. '"+instr.getInstrId()+"' was Removed from the System...!");
        }
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }   catch (SQLException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        insReset();
        }
    }//GEN-LAST:event_instrDeleteButtonActionPerformed

    private void instrResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrResetButtonActionPerformed
        insReset();
    }//GEN-LAST:event_instrResetButtonActionPerformed

    private void studentResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentResetButtonActionPerformed
        stuReset();
    }//GEN-LAST:event_studentResetButtonActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        int i = studentTable.getSelectedRow();
        TableModel model = studentTable.getModel();
        String studNo = model.getValueAt(i, 1).toString();
        try {
            ResultSet rs = db.searchStudent(studNo);
            if(rs.next()){
                stuId.setText(rs.getString("Student_Id"));
                firstName.setText(rs.getString("FirstName"));
                lastName.setText(rs.getString("LastName"));
                dob.setText(rs.getString("DateOfBirth"));
                email.setText(rs.getString("Email"));
                contactNo.setText(rs.getString("ContactNo"));
                adres.setText(rs.getString("Address"));
                if(rs.getString("Gender").equals("Male")){
                    studentMaleButton.setSelected(true);
                }
                else if(rs.getString("Gender").equals("Female")){
                    studentFemaleButton.setSelected(true);
                }
                enrollDate.setText(rs.getString("EnrollDate"));
                studentTypeField.setText(rs.getString("StudentType")+"  Student");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_studentTableMouseClicked

    private void studentRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRefreshButtonActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel)studentTable.getModel();
            model.setRowCount(0);
            showStudentTable();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_studentRefreshButtonActionPerformed

    private void lecturerRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerRefreshButtonActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel)lecturerTable.getModel();
            model.setRowCount(0);
            showLecturerTable();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lecturerRefreshButtonActionPerformed

    private void lecturerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerTableMouseClicked
        int i = lecturerTable.getSelectedRow();
        TableModel model = lecturerTable.getModel();
        String lecNo = model.getValueAt(i, 1).toString();
        try{
            ResultSet rs = db.searchLecturer(lecNo);

            if(rs.next()){
                
                lecturerId.setText(rs.getString("Lecr_Id"));
                lecturerFirstName.setText(rs.getString("FirstName"));
                lecturerLastName.setText(rs.getString("LastName"));
                titleCombo.setSelectedItem(rs.getString("Title"));
                lecturerEmail.setText(rs.getString("Email"));
                lecturerRoom.setText(rs.getString("Room"));
                switch (rs.getString("Gender")) {
                    case "Male":
                        lectrMaleButton.setSelected(true);
                        break;
                    case "Female":
                        lectrFemaleButton.setSelected(true);
                        break;
                    default:
                        break;
                }
                facultyCombo.setSelectedItem(rs.getString("Faculty"));
            }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_lecturerTableMouseClicked

    private void instructorRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructorRefreshButtonActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel)instructorTable.getModel();
            model.setRowCount(0);
            showInstructorTable();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_instructorRefreshButtonActionPerformed

    private void instructorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instructorTableMouseClicked
        int i = instructorTable.getSelectedRow();
        TableModel model = instructorTable.getModel();
        String insNo = model.getValueAt(i, 1).toString();
        try{
            ResultSet rs = db.searchInstructor(insNo);

            if(rs.next()){
                instrIdField.setText(rs.getString("Instrct_Id"));
                instrFName.setText(rs.getString("FirstName"));
                instrLName.setText(rs.getString("LastName"));
                instrEmail.setText(rs.getString("Email"));
                if(rs.getString("Gender").equals("Male")){
                    instrMaleButton.setSelected(true);
                }
                else if(rs.getString("Gender").equals("Female")){
                    instrFemaleButton.setSelected(true);
                }
                else{}
            }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_instructorTableMouseClicked

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        AcademicDetails aca = new AcademicDetails(stuId.getText());
        aca.setVisible(true);
    }//GEN-LAST:event_viewButtonActionPerformed

    private void facultyComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyComboActionPerformed

    public void insReset(){
        instrSearchField.setText("Search Here.....");
        instrIdField.setText(null);
        instrFName.setText(null);
        instrLName.setText(null);
        instrMaleButton.setSelected(false);
        instrFemaleButton.setSelected(false);
        instrEmail.setText(null);
        instructorEmptyFieldsLabel.setText(null);
    }
    
    public void lecReset(){
        lecturerSearchField.setText("Search Here.....");
        lecturerId.setText(null);
        lecturerFirstName.setText(null);
        lecturerLastName.setText(null);
        titleCombo.setSelectedItem("<Titles>");
        lecturerEmail.setText(null);
        lectrMaleButton.setSelected(false);
        lectrFemaleButton.setSelected(false);
        lecturerRoom.setText(null);
        lecturerEmptyFieldsLabel.setText(null);
    }
    
    public void stuReset(){
        studentSearchField.setText("Search Here.....");
        stuId.setText(null);
        firstName.setText(null);
        lastName.setText(null);
        dob.setText(null);
        email.setText(null);
        contactNo.setText(null);
        adres.setText(null);
        studentMaleButton.setSelected(false);
        studentFemaleButton.setSelected(false);
        enrollDate.setText(null);
        studentTypeField.setText("Student Type");
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new AdminPanel().setVisible(true);
//        });
//    }
    
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(0,0,153));
    }
    
    private void resetColor(JPanel pane)
    {
        pane.setBackground(new Color(0,0,102));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adres;
    private javax.swing.JTextField contactNo;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField enrollDate;
    private javax.swing.JComboBox<String> facultyCombo;
    private javax.swing.JTextField firstName;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel home_indicator;
    private javax.swing.JPanel insPanel;
    private javax.swing.JPanel ins_indicator;
    private javax.swing.JButton instrAddButton;
    private javax.swing.JButton instrDeleteButton;
    private javax.swing.JTextField instrEmail;
    private javax.swing.JTextField instrFName;
    private javax.swing.JRadioButton instrFemaleButton;
    private javax.swing.ButtonGroup instrGenderButtonGroup;
    private javax.swing.JTextField instrIdField;
    private javax.swing.JTextField instrLName;
    private javax.swing.JRadioButton instrMaleButton;
    private javax.swing.JButton instrResetButton;
    private javax.swing.JButton instrSearchButton;
    private javax.swing.JTextField instrSearchField;
    private javax.swing.JButton instrUpdateButton;
    private javax.swing.JLabel instructorEmptyFieldsLabel;
    private javax.swing.JButton instructorRefreshButton;
    private javax.swing.JTable instructorTable;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField lastName;
    private javax.swing.JPanel lecPanel;
    private javax.swing.JPanel lec_indicator;
    private javax.swing.JRadioButton lectrFemaleButton;
    private javax.swing.JRadioButton lectrMaleButton;
    private javax.swing.JButton lectrResetButton;
    private javax.swing.JButton lecturerAddButton;
    private javax.swing.JTextField lecturerEmail;
    private javax.swing.JLabel lecturerEmptyFieldsLabel;
    private javax.swing.JTextField lecturerFirstName;
    private javax.swing.ButtonGroup lecturerGenderButtonGroup;
    private javax.swing.JTextField lecturerId;
    private javax.swing.JTextField lecturerLastName;
    private javax.swing.JButton lecturerRefreshButton;
    private javax.swing.JButton lecturerRemoveButton;
    private javax.swing.JTextField lecturerRoom;
    private javax.swing.JButton lecturerSearchButton;
    private javax.swing.JTextField lecturerSearchField;
    private javax.swing.JTable lecturerTable;
    private javax.swing.JButton lecturerUpdateButton;
    private javax.swing.JLabel loggedInAsLabel;
    private javax.swing.JLabel loggedUserLabel;
    private javax.swing.JPanel loggedUserPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelInstructor;
    private javax.swing.JPanel panelLecturer;
    private javax.swing.JPanel panelStudent;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JButton paymentButton;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField stuId;
    private javax.swing.JPanel stuPanel;
    private javax.swing.JPanel stu_indicator;
    private javax.swing.JButton studentDeleteButton;
    private javax.swing.JRadioButton studentFemaleButton;
    private javax.swing.ButtonGroup studentGenderButtonGroup;
    private javax.swing.JRadioButton studentMaleButton;
    private javax.swing.JButton studentRefreshButton;
    private javax.swing.JButton studentRegBtn;
    private javax.swing.JButton studentResetButton;
    private javax.swing.JButton studentSearchButton;
    private javax.swing.JTextField studentSearchField;
    private javax.swing.JTable studentTable;
    private javax.swing.JLabel studentTypeField;
    private javax.swing.JButton studentUpdateButton;
    private javax.swing.JButton subjectButton;
    private javax.swing.JComboBox<String> titleCombo;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
    private String lecGender;
    private String stuGender;
    private String insGender;
}
