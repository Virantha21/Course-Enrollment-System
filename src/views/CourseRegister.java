
package nsbm;

import javaClasses.BachelorStudent;
import javaClasses.MasterStudent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClasses.Faculty;
import javaClasses.Student;
import javax.swing.JOptionPane;

public class CourseRegister extends javax.swing.JFrame {

    static Connection conc = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    Statement stm = null;
    ResultSet rst = null;
    
    private int courseFlag = 0;
    
    Student std;
    
    private String faculty;
    
    dbConnection db;
    
    public CourseRegister() {
        initComponents();
        setLocation(200,150);
        
        db = new dbConnection();
        db.connection();
        
    }
    
    public CourseRegister(BachelorStudent bst, String fac){
        initComponents();
        setLocation(200,150);
        
        this.std = bst;
        this.faculty = fac;
        
        db = new dbConnection();
        db.connection();
        
        selectComputingBachelorPanel.setVisible(false);
        selectComputingMasterPanel.setVisible(false);
        engineeringBachelorPanel.setVisible(false);
        engineeringMasterPanel.setVisible(false);
        businessBachelorPanel.setVisible(false);
        businessMasterPanel.setVisible(false);
        
        if(fac.equals("FOC101")){
            facultyLabel.setText("School of Computing");
            selectComputingBachelorPanel.setVisible(true);
        }
        else if(fac.equals("FOC202")){
            facultyLabel.setText("School of Engineering");
            engineeringBachelorPanel.setVisible(true);
        }
        else{
            facultyLabel.setText("School of Business");
            businessBachelorPanel.setVisible(true);
        }
        
        courseTypeLabel.setText(std.getstuType());
        compRegStuIdField.setText(std.getstuId());
        
        nextButton.setVisible(false);
        
        QualBachStuBtn.setVisible(true);
        QualMastStuBtn.setVisible(false);
    }
    
    public CourseRegister(MasterStudent mst, String fac){
        initComponents();
        setLocation(200,150);
        
        this.std = mst;
        this.faculty = fac;
        
        db = new dbConnection();
        db.connection();
        
        selectComputingBachelorPanel.setVisible(false);
        selectComputingMasterPanel.setVisible(false);
        engineeringBachelorPanel.setVisible(false);
        engineeringMasterPanel.setVisible(false);
        businessBachelorPanel.setVisible(false);
        businessMasterPanel.setVisible(false);
        
        if(fac.equals("FOC101")){
            facultyLabel.setText("School of Computing");
            selectComputingMasterPanel.setVisible(true);
        }
        else if(fac.equals("FOC202")){
            facultyLabel.setText("School of Engineering");
            engineeringMasterPanel.setVisible(true);
        }
        else{
            facultyLabel.setText("School of Business");
            businessMasterPanel.setVisible(true);
        }
        
        courseTypeLabel.setText(std.getstuType());
        thirdYear.setEnabled(false);
        forthYear.setEnabled(false);
        compRegStuIdField.setText(std.getstuId());
        
        nextButton.setVisible(false);

        QualMastStuBtn.setVisible(true);
        QualBachStuBtn.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intakeButtonGroup = new javax.swing.ButtonGroup();
        bachelorCourseButtonGrp = new javax.swing.ButtonGroup();
        masterCourseButtonGroup = new javax.swing.ButtonGroup();
        academicYearBtnGroup = new javax.swing.ButtonGroup();
        semesterBtnGroup = new javax.swing.ButtonGroup();
        bachelorEngineering = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        facultyLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        februaryIntake = new javax.swing.JRadioButton();
        julyIntake = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        coursePane = new javax.swing.JLayeredPane();
        selectComputingMasterPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ComputerNetworks = new javax.swing.JRadioButton();
        Multimedia = new javax.swing.JRadioButton();
        selectComputingBachelorPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ComputerScience = new javax.swing.JRadioButton();
        SoftwareEngineering = new javax.swing.JRadioButton();
        InformationSystem = new javax.swing.JRadioButton();
        engineeringBachelorPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CivilEngineering = new javax.swing.JRadioButton();
        MechanicalEngineering = new javax.swing.JRadioButton();
        engineeringMasterPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        InteriorDesign = new javax.swing.JRadioButton();
        businessBachelorPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        HumanResource = new javax.swing.JRadioButton();
        IndustrialManagement = new javax.swing.JRadioButton();
        businessMasterPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        BusinessManagement = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        firstYear = new javax.swing.JRadioButton();
        secondYear = new javax.swing.JRadioButton();
        thirdYear = new javax.swing.JRadioButton();
        forthYear = new javax.swing.JRadioButton();
        nextButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        QualBachStuBtn = new javax.swing.JButton();
        QualMastStuBtn = new javax.swing.JButton();
        courseTypeLabel = new javax.swing.JLabel();
        compRegStuIdField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        facultyLabel.setFont(new java.awt.Font("STXihei", 0, 25)); // NOI18N
        facultyLabel.setForeground(new java.awt.Color(204, 204, 204));
        facultyLabel.setText("School of Computing");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facultyLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(facultyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel2.setText("Degree Programme Type");

        februaryIntake.setBackground(new java.awt.Color(153, 153, 255));
        intakeButtonGroup.add(februaryIntake);
        februaryIntake.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        februaryIntake.setText("February Intake");
        februaryIntake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                februaryIntakeActionPerformed(evt);
            }
        });

        julyIntake.setBackground(new java.awt.Color(153, 153, 255));
        intakeButtonGroup.add(julyIntake);
        julyIntake.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        julyIntake.setText("July Intake");
        julyIntake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                julyIntakeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setText("Intake");

        coursePane.setLayout(new java.awt.CardLayout());

        selectComputingMasterPanel.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Select the Master Course");

        ComputerNetworks.setBackground(new java.awt.Color(204, 204, 255));
        masterCourseButtonGroup.add(ComputerNetworks);
        ComputerNetworks.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        ComputerNetworks.setText("Diploma in Computer Networks - C1006");
        ComputerNetworks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputerNetworksActionPerformed(evt);
            }
        });

        Multimedia.setBackground(new java.awt.Color(204, 204, 255));
        masterCourseButtonGroup.add(Multimedia);
        Multimedia.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        Multimedia.setText("Diploma in Multimedia - C1007");
        Multimedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultimediaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectComputingMasterPanelLayout = new javax.swing.GroupLayout(selectComputingMasterPanel);
        selectComputingMasterPanel.setLayout(selectComputingMasterPanelLayout);
        selectComputingMasterPanelLayout.setHorizontalGroup(
            selectComputingMasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectComputingMasterPanelLayout.createSequentialGroup()
                .addGroup(selectComputingMasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectComputingMasterPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectComputingMasterPanelLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(selectComputingMasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComputerNetworks)
                            .addComponent(Multimedia))))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        selectComputingMasterPanelLayout.setVerticalGroup(
            selectComputingMasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectComputingMasterPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(ComputerNetworks)
                .addGap(18, 18, 18)
                .addComponent(Multimedia)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        coursePane.add(selectComputingMasterPanel, "card2");

        selectComputingBachelorPanel.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Select the Bachelor Course");

        ComputerScience.setBackground(new java.awt.Color(204, 204, 255));
        bachelorCourseButtonGrp.add(ComputerScience);
        ComputerScience.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ComputerScience.setText("BSc (Honours) in Computer Science - C1001");
        ComputerScience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputerScienceActionPerformed(evt);
            }
        });

        SoftwareEngineering.setBackground(new java.awt.Color(204, 204, 255));
        bachelorCourseButtonGrp.add(SoftwareEngineering);
        SoftwareEngineering.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        SoftwareEngineering.setText("BSc (Honours) in Software Engineering - C1002");
        SoftwareEngineering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoftwareEngineeringActionPerformed(evt);
            }
        });

        InformationSystem.setBackground(new java.awt.Color(204, 204, 255));
        bachelorCourseButtonGrp.add(InformationSystem);
        InformationSystem.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        InformationSystem.setText("BSc in Management Information System - C1003");
        InformationSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationSystemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectComputingBachelorPanelLayout = new javax.swing.GroupLayout(selectComputingBachelorPanel);
        selectComputingBachelorPanel.setLayout(selectComputingBachelorPanelLayout);
        selectComputingBachelorPanelLayout.setHorizontalGroup(
            selectComputingBachelorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectComputingBachelorPanelLayout.createSequentialGroup()
                .addGroup(selectComputingBachelorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectComputingBachelorPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectComputingBachelorPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(selectComputingBachelorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SoftwareEngineering)
                            .addComponent(ComputerScience, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InformationSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        selectComputingBachelorPanelLayout.setVerticalGroup(
            selectComputingBachelorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectComputingBachelorPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComputerScience)
                .addGap(29, 29, 29)
                .addComponent(SoftwareEngineering)
                .addGap(27, 27, 27)
                .addComponent(InformationSystem)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        coursePane.add(selectComputingBachelorPanel, "card3");

        engineeringBachelorPanel.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Select the Bachelor Course");

        bachelorEngineering.add(CivilEngineering);
        CivilEngineering.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        CivilEngineering.setText("BSc in Civil Engineering - C2001");
        CivilEngineering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CivilEngineeringActionPerformed(evt);
            }
        });

        bachelorEngineering.add(MechanicalEngineering);
        MechanicalEngineering.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        MechanicalEngineering.setText("BSc in Mechanical Engineering - C2002");
        MechanicalEngineering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MechanicalEngineeringActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout engineeringBachelorPanelLayout = new javax.swing.GroupLayout(engineeringBachelorPanel);
        engineeringBachelorPanel.setLayout(engineeringBachelorPanelLayout);
        engineeringBachelorPanelLayout.setHorizontalGroup(
            engineeringBachelorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(engineeringBachelorPanelLayout.createSequentialGroup()
                .addGroup(engineeringBachelorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(engineeringBachelorPanelLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(engineeringBachelorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MechanicalEngineering)
                            .addComponent(CivilEngineering)))
                    .addGroup(engineeringBachelorPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        engineeringBachelorPanelLayout.setVerticalGroup(
            engineeringBachelorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(engineeringBachelorPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(CivilEngineering)
                .addGap(18, 18, 18)
                .addComponent(MechanicalEngineering)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        coursePane.add(engineeringBachelorPanel, "card4");

        engineeringMasterPanel.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText("Select Master Course");

        InteriorDesign.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        InteriorDesign.setText("Diploma in Interior Design - C2003");
        InteriorDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InteriorDesignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout engineeringMasterPanelLayout = new javax.swing.GroupLayout(engineeringMasterPanel);
        engineeringMasterPanel.setLayout(engineeringMasterPanelLayout);
        engineeringMasterPanelLayout.setHorizontalGroup(
            engineeringMasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(engineeringMasterPanelLayout.createSequentialGroup()
                .addGroup(engineeringMasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(engineeringMasterPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(engineeringMasterPanelLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(InteriorDesign)))
                .addContainerGap(391, Short.MAX_VALUE))
        );
        engineeringMasterPanelLayout.setVerticalGroup(
            engineeringMasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(engineeringMasterPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(InteriorDesign)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        coursePane.add(engineeringMasterPanel, "card5");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("Select Bachelor Course");

        HumanResource.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        HumanResource.setText("BSc in Human Resources Management - C3001");
        HumanResource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HumanResourceActionPerformed(evt);
            }
        });

        IndustrialManagement.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        IndustrialManagement.setText("BSc in Industrial Management - C3002");
        IndustrialManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndustrialManagementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout businessBachelorPanelLayout = new javax.swing.GroupLayout(businessBachelorPanel);
        businessBachelorPanel.setLayout(businessBachelorPanelLayout);
        businessBachelorPanelLayout.setHorizontalGroup(
            businessBachelorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(businessBachelorPanelLayout.createSequentialGroup()
                .addGroup(businessBachelorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(businessBachelorPanelLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(businessBachelorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IndustrialManagement)
                            .addComponent(HumanResource)))
                    .addGroup(businessBachelorPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        businessBachelorPanelLayout.setVerticalGroup(
            businessBachelorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(businessBachelorPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(HumanResource)
                .addGap(18, 18, 18)
                .addComponent(IndustrialManagement)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        coursePane.add(businessBachelorPanel, "card6");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Select Master Course");

        BusinessManagement.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        BusinessManagement.setText("Diploma in Business Management - C3003");
        BusinessManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusinessManagementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout businessMasterPanelLayout = new javax.swing.GroupLayout(businessMasterPanel);
        businessMasterPanel.setLayout(businessMasterPanelLayout);
        businessMasterPanelLayout.setHorizontalGroup(
            businessMasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(businessMasterPanelLayout.createSequentialGroup()
                .addGroup(businessMasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(businessMasterPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(businessMasterPanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(BusinessManagement)))
                .addContainerGap(341, Short.MAX_VALUE))
        );
        businessMasterPanelLayout.setVerticalGroup(
            businessMasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(businessMasterPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(BusinessManagement)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        coursePane.add(businessMasterPanel, "card7");

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Academic Year");

        firstYear.setBackground(new java.awt.Color(204, 204, 255));
        academicYearBtnGroup.add(firstYear);
        firstYear.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        firstYear.setText("1st Year");
        firstYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstYearActionPerformed(evt);
            }
        });

        secondYear.setBackground(new java.awt.Color(204, 204, 255));
        academicYearBtnGroup.add(secondYear);
        secondYear.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        secondYear.setText("2nd Year");
        secondYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondYearActionPerformed(evt);
            }
        });

        thirdYear.setBackground(new java.awt.Color(204, 204, 255));
        academicYearBtnGroup.add(thirdYear);
        thirdYear.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        thirdYear.setText("3rd Year");
        thirdYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdYearActionPerformed(evt);
            }
        });

        forthYear.setBackground(new java.awt.Color(204, 204, 255));
        academicYearBtnGroup.add(forthYear);
        forthYear.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        forthYear.setText("4th Year");
        forthYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forthYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondYear)
                            .addComponent(firstYear)
                            .addComponent(thirdYear)
                            .addComponent(forthYear))))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(firstYear)
                .addGap(7, 7, 7)
                .addComponent(secondYear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thirdYear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forthYear)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        nextButton.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/Action-arrow-blue-flat-right-icon.png"))); // NOI18N
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel7.setText("Student Registration Number");

        QualBachStuBtn.setFont(new java.awt.Font("STZhongsong", 1, 12)); // NOI18N
        QualBachStuBtn.setText("Add Previous Education Records For Bachelor Students");
        QualBachStuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QualBachStuBtnActionPerformed(evt);
            }
        });

        QualMastStuBtn.setFont(new java.awt.Font("STZhongsong", 1, 12)); // NOI18N
        QualMastStuBtn.setText("Add Previous Education Records For Master Students");
        QualMastStuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QualMastStuBtnActionPerformed(evt);
            }
        });

        courseTypeLabel.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        courseTypeLabel.setForeground(new java.awt.Color(0, 0, 102));

        compRegStuIdField.setFont(new java.awt.Font("STFangsong", 1, 20)); // NOI18N
        compRegStuIdField.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(QualBachStuBtn)
                .addGap(43, 43, 43)
                .addComponent(QualMastStuBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(courseTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(februaryIntake, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(julyIntake, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compRegStuIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coursePane, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(compRegStuIdField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(februaryIntake)
                                .addComponent(julyIntake))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coursePane, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(QualBachStuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(QualMastStuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1467, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void februaryIntakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_februaryIntakeActionPerformed
        intake = "February";
        std.setIntake(intake);
    }//GEN-LAST:event_februaryIntakeActionPerformed

    private void QualBachStuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QualBachStuBtnActionPerformed
        BachelorStudentQualifications bsq = new BachelorStudentQualifications((BachelorStudent) std);
        bsq.setVisible(true);
        nextButton.setVisible(true);
    }//GEN-LAST:event_QualBachStuBtnActionPerformed

    private void QualMastStuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QualMastStuBtnActionPerformed
        MasterStudentQualifications msq = new MasterStudentQualifications((MasterStudent) std);
        msq.setVisible(true);
        nextButton.setVisible(true);
    }//GEN-LAST:event_QualMastStuBtnActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if(courseFlag == 0){
            JOptionPane.showMessageDialog(null, "*Select the Course!");
        }
        else if(!februaryIntake.isSelected() && !julyIntake.isSelected()){
            JOptionPane.showMessageDialog(null, "Select the Intake...!");
        }
        else if(!firstYear.isSelected() && !secondYear.isSelected() && !thirdYear.isSelected() && !forthYear.isSelected()){
            JOptionPane.showMessageDialog(null, "Select the Academic Year...!");
        }

        else{
            if(std.getstuType().equals("Bachelor")){
                setVisible(false);
                SubjectSelection compsub;
                try {
                    compsub = new SubjectSelection(std.getstuId(), std.getcourseId(), year, intake);
                    compsub.setVisible(true);
                    db.enrollCourse(std);
                } catch (SQLException ex) {
                    Logger.getLogger(CourseRegister.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            else if(std.getstuType().equals("Master")){
                setVisible(false);
                SubjectSelection compsub;
                try {
                    compsub = new SubjectSelection(std.getstuId(), std.getcourseId(), year, intake);
                    compsub.setVisible(true);
                    db.enrollCourse(std);
                } catch (SQLException ex) {
                    Logger.getLogger(CourseRegister.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void julyIntakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_julyIntakeActionPerformed
        intake = "July";
        std.setIntake(intake);
    }//GEN-LAST:event_julyIntakeActionPerformed

    private void firstYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstYearActionPerformed
        year = "1st Year";
        std.setAcaYear(year);
    }//GEN-LAST:event_firstYearActionPerformed

    private void secondYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondYearActionPerformed
        year = "2nd Year";
        std.setAcaYear(year);
    }//GEN-LAST:event_secondYearActionPerformed

    private void thirdYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdYearActionPerformed
        year = "3rd Year";
        std.setAcaYear(year);
    }//GEN-LAST:event_thirdYearActionPerformed

    private void forthYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forthYearActionPerformed
        year = "4th Year";
        std.setAcaYear(year);
    }//GEN-LAST:event_forthYearActionPerformed

    private void ComputerScienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputerScienceActionPerformed
        std.setcourseId("C1001");
        courseFlag = 1;
    }//GEN-LAST:event_ComputerScienceActionPerformed

    private void SoftwareEngineeringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoftwareEngineeringActionPerformed
        std.setcourseId("C1002");
        courseFlag = 1;
    }//GEN-LAST:event_SoftwareEngineeringActionPerformed

    private void InformationSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationSystemActionPerformed
        std.setcourseId("C1003");
        courseFlag = 1;
    }//GEN-LAST:event_InformationSystemActionPerformed

    private void ComputerNetworksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputerNetworksActionPerformed
        std.setcourseId("C1006");
        courseFlag = 1;
    }//GEN-LAST:event_ComputerNetworksActionPerformed

    private void MultimediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultimediaActionPerformed
        std.setcourseId("C1007");
        courseFlag = 1;
    }//GEN-LAST:event_MultimediaActionPerformed

    private void CivilEngineeringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CivilEngineeringActionPerformed
        std.setcourseId("C2001");
        courseFlag = 1;
    }//GEN-LAST:event_CivilEngineeringActionPerformed

    private void MechanicalEngineeringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MechanicalEngineeringActionPerformed
        std.setcourseId("C2002");
        courseFlag = 1;
    }//GEN-LAST:event_MechanicalEngineeringActionPerformed

    private void InteriorDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InteriorDesignActionPerformed
        std.setcourseId("C2003");
        courseFlag = 1;
    }//GEN-LAST:event_InteriorDesignActionPerformed

    private void HumanResourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HumanResourceActionPerformed
        std.setcourseId("C3001");
        courseFlag = 1;
    }//GEN-LAST:event_HumanResourceActionPerformed

    private void IndustrialManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndustrialManagementActionPerformed
        std.setcourseId("C3002");
        courseFlag = 1;
    }//GEN-LAST:event_IndustrialManagementActionPerformed

    private void BusinessManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusinessManagementActionPerformed
        std.setcourseId("C3003");
        courseFlag = 1;
    }//GEN-LAST:event_BusinessManagementActionPerformed

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
//            java.util.logging.Logger.getLogger(CourseRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CourseRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CourseRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CourseRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CourseRegister().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BusinessManagement;
    private javax.swing.JRadioButton CivilEngineering;
    private javax.swing.JRadioButton ComputerNetworks;
    private javax.swing.JRadioButton ComputerScience;
    private javax.swing.JRadioButton HumanResource;
    private javax.swing.JRadioButton IndustrialManagement;
    private javax.swing.JRadioButton InformationSystem;
    private javax.swing.JRadioButton InteriorDesign;
    private javax.swing.JRadioButton MechanicalEngineering;
    private javax.swing.JRadioButton Multimedia;
    private javax.swing.JButton QualBachStuBtn;
    private javax.swing.JButton QualMastStuBtn;
    private javax.swing.JRadioButton SoftwareEngineering;
    private javax.swing.ButtonGroup academicYearBtnGroup;
    private javax.swing.ButtonGroup bachelorCourseButtonGrp;
    private javax.swing.ButtonGroup bachelorEngineering;
    private javax.swing.JPanel businessBachelorPanel;
    private javax.swing.JPanel businessMasterPanel;
    private javax.swing.JLabel compRegStuIdField;
    private javax.swing.JLayeredPane coursePane;
    private javax.swing.JLabel courseTypeLabel;
    private javax.swing.JPanel engineeringBachelorPanel;
    private javax.swing.JPanel engineeringMasterPanel;
    private javax.swing.JLabel facultyLabel;
    private javax.swing.JRadioButton februaryIntake;
    private javax.swing.JRadioButton firstYear;
    private javax.swing.JRadioButton forthYear;
    private javax.swing.ButtonGroup intakeButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton julyIntake;
    private javax.swing.ButtonGroup masterCourseButtonGroup;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton secondYear;
    private javax.swing.JPanel selectComputingBachelorPanel;
    private javax.swing.JPanel selectComputingMasterPanel;
    private javax.swing.ButtonGroup semesterBtnGroup;
    private javax.swing.JRadioButton thirdYear;
    // End of variables declaration//GEN-END:variables
    private String year;
    private String intake;

}

