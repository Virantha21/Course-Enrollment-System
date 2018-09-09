
package nsbm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClasses.Subject;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class SubjectHandling extends javax.swing.JFrame {
    
    ResultSet relst;
    Subject sub;
    dbConnection db;

    public SubjectHandling() throws SQLException {
        initComponents();
        
        db = new dbConnection();
        db.connection();
        
        showSubjectTable();
        fillCourseCombo();
        fillLecturerCombo();
    }
    
    public ArrayList<Subject> subjectList() throws SQLException{
    
        ArrayList<Subject> subjectList = new ArrayList<>();
        relst = db.subjectFieldSelection();
        while(relst.next()){
            sub = new Subject();
            sub.setSubCode(relst.getString("Sub_Code"));
            sub.setSubName(relst.getString("SubName"));
            sub.setCourseId(relst.getString("Course_Id"));
            sub.setLecturerId(relst.getString("Lecr_Id"));
            sub.setSemester(relst.getString("Semester"));
            sub.setSubFee(relst.getInt("SubFee"));
            sub.setSubCredit(relst.getInt("SubCredits"));
            sub.setYear(relst.getString("Year"));
            sub.setSubType(relst.getString("SubType"));
            subjectList.add(sub);
        }
        return subjectList;
    }
    
    public void showSubjectTable() throws SQLException{
        
        ArrayList<Subject> list = subjectList();
        DefaultTableModel model = (DefaultTableModel)subjectTable.getModel();
        Object[] row = new Object[4];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getSubCode();
            row[1] = list.get(i).getSubName();
            row[2] = list.get(i).getLecturerId();
            row[3] = list.get(i).getCourseId();
            model.addRow(row);
        }
    }
    
    private void fillCourseCombo() throws SQLException{
        try{
            ResultSet rs = db.courseSelection();
            
            while(rs.next()){
                String cor = rs.getString("Course_Id");

                courseCombo.addItem(cor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }
    
    private void fillLecturerCombo() throws SQLException{
        try{
            ResultSet rs = db.lecturerSelection();
            
            while(rs.next()){
                String lec = rs.getString("Lecr_Id");

                lecturerCombo.addItem(lec);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        homeButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        codeField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        courseCombo = new javax.swing.JComboBox<>();
        lecturerCombo = new javax.swing.JComboBox<>();
        sem1RadioButton = new javax.swing.JRadioButton();
        sem2RadioButton = new javax.swing.JRadioButton();
        feeField = new javax.swing.JTextField();
        credit2RadioButton = new javax.swing.JRadioButton();
        credit3RadioButton = new javax.swing.JRadioButton();
        yearCombo = new javax.swing.JComboBox<>();
        compulsoryRadioButton = new javax.swing.JRadioButton();
        optionalRadioButton = new javax.swing.JRadioButton();
        addSubjectButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Subjects");

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
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Subject Code");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Subject Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Course");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Lecturer ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Semester");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Subject Fee");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Subject Credits");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Year");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Subject Type");

        subjectTable.setBackground(new java.awt.Color(153, 153, 255));
        subjectTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        subjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Code", "Subject Name", "Course", "Lecturer"
            }
        ));
        subjectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(subjectTable);

        refreshButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        codeField.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        codeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeFieldKeyTyped(evt);
            }
        });

        nameField.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });

        courseCombo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        courseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Course ID>" }));

        lecturerCombo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lecturerCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Lecturer ID>" }));

        buttonGroup1.add(sem1RadioButton);
        sem1RadioButton.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        sem1RadioButton.setText("Semester 1");
        sem1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(sem2RadioButton);
        sem2RadioButton.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        sem2RadioButton.setText("Semester 2");
        sem2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem2RadioButtonActionPerformed(evt);
            }
        });

        feeField.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        feeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                feeFieldKeyTyped(evt);
            }
        });

        buttonGroup2.add(credit2RadioButton);
        credit2RadioButton.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        credit2RadioButton.setText("2");
        credit2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credit2RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(credit3RadioButton);
        credit3RadioButton.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        credit3RadioButton.setText("3");
        credit3RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credit3RadioButtonActionPerformed(evt);
            }
        });

        yearCombo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        yearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" }));

        buttonGroup3.add(compulsoryRadioButton);
        compulsoryRadioButton.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        compulsoryRadioButton.setText("Compulsory");
        compulsoryRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compulsoryRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(optionalRadioButton);
        optionalRadioButton.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        optionalRadioButton.setText("Optional");
        optionalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionalRadioButtonActionPerformed(evt);
            }
        });

        addSubjectButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        addSubjectButton.setText("Add Subject");
        addSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubjectButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        updateButton.setText("Update Subject");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lecturerCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                .addComponent(courseCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(sem1RadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(sem2RadioButton))
                            .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(feeField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(credit2RadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(credit3RadioButton))
                            .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(compulsoryRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(optionalRadioButton))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234)
                        .addComponent(addSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(codeField)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(courseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lecturerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem1RadioButton)
                            .addComponent(sem2RadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(feeField)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(credit2RadioButton)
                            .addComponent(credit3RadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(yearCombo)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compulsoryRadioButton)
                            .addComponent(optionalRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
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

    private void codeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeFieldKeyTyped
//        codeField.setText(null);
    }//GEN-LAST:event_codeFieldKeyTyped

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
//        nameField.setText(null);
    }//GEN-LAST:event_nameFieldKeyTyped

    private void feeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feeFieldKeyTyped
//        feeField.setText(null);
    }//GEN-LAST:event_feeFieldKeyTyped

    private void subjectTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectTableMouseClicked
        int i = subjectTable.getSelectedRow();
        TableModel model = subjectTable.getModel();
        String subCode = model.getValueAt(i, 1).toString();
        try {
            ResultSet rs = db.searchSubject(subCode);
            
            if(rs.next()){
                codeField.setText(rs.getString("Sub_Code"));
                nameField.setText(rs.getString("SubName"));
                courseCombo.setSelectedItem(rs.getString("Course_Id"));
                lecturerCombo.setSelectedItem(rs.getString("Lecr_Id"));
                switch (rs.getString("Semester")) {
                    case "Sem1":
                        sem1RadioButton.setSelected(true);
                        break;
                    case "Sem2":
                        sem2RadioButton.setSelected(true);
                        break;
                    default:
                        break;
                }
                feeField.setText(Integer.toString(rs.getInt("SubFee")));
                switch (Integer.toString(rs.getInt("SubCredits"))) {
                    case "2":
                        credit2RadioButton.setSelected(true);
                        break;
                    case "3":
                        credit3RadioButton.setSelected(true);
                        break;
                    default:
                        break;
                }
                yearCombo.setSelectedItem(rs.getString("Year"));
                switch (rs.getString("SubType")) {
                    case "C":
                        compulsoryRadioButton.setSelected(true);
                        break;
                    case "O":
                        optionalRadioButton.setSelected(true);
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subjectTableMouseClicked

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void addSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubjectButtonActionPerformed
        try{
            sub = new Subject();
            
            sub.setSubCode(codeField.getText());
            sub.setSubName(nameField.getText());
            sub.setCourseId(courseCombo.getSelectedItem().toString());
            sub.setLecturerId(lecturerCombo.getSelectedItem().toString());
            sub.setSemester(semes);
            sub.setSubFee(Integer.parseInt(feeField.getText()));
            sub.setSubCredit(cred);
            sub.setYear(yearCombo.getSelectedItem().toString());
            sub.setSubType(type);
            
            int exe = 0;
            exe = db.insertSubject(sub);
            
            if(exe == 1){
                JOptionPane.showMessageDialog(null, "Subject Insertion is Successful!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error...!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error...!");
        }
    }//GEN-LAST:event_addSubjectButtonActionPerformed

    private void sem1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1RadioButtonActionPerformed
        semes = "Sem1";
    }//GEN-LAST:event_sem1RadioButtonActionPerformed

    private void sem2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem2RadioButtonActionPerformed
        semes = "Sem2";
    }//GEN-LAST:event_sem2RadioButtonActionPerformed

    private void credit2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credit2RadioButtonActionPerformed
        cred = 2;
    }//GEN-LAST:event_credit2RadioButtonActionPerformed

    private void credit3RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credit3RadioButtonActionPerformed
        cred = 3;
    }//GEN-LAST:event_credit3RadioButtonActionPerformed

    private void compulsoryRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compulsoryRadioButtonActionPerformed
        type = "C";
    }//GEN-LAST:event_compulsoryRadioButtonActionPerformed

    private void optionalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionalRadioButtonActionPerformed
        type = "O";
    }//GEN-LAST:event_optionalRadioButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel)subjectTable.getModel();
            model.setRowCount(0);
            showSubjectTable();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SubjectHandling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectHandling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectHandling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectHandling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SubjectHandling().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SubjectHandling.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSubjectButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField codeField;
    private javax.swing.JRadioButton compulsoryRadioButton;
    private javax.swing.JComboBox<String> courseCombo;
    private javax.swing.JRadioButton credit2RadioButton;
    private javax.swing.JRadioButton credit3RadioButton;
    private javax.swing.JTextField feeField;
    private javax.swing.JButton homeButton;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> lecturerCombo;
    private javax.swing.JTextField nameField;
    private javax.swing.JRadioButton optionalRadioButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JRadioButton sem1RadioButton;
    private javax.swing.JRadioButton sem2RadioButton;
    private javax.swing.JTable subjectTable;
    private javax.swing.JButton updateButton;
    private javax.swing.JComboBox<String> yearCombo;
    // End of variables declaration//GEN-END:variables
    private String semes;
    private int cred;
    private String type;
}
