package javaClasses;

import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
//import javax.swing.JOptionPane;
//import static nsbm.BachelorStudentQualifications.conc;


public class BachelorStudent extends Student { //inherit the super class student
    
    static Connection conc = null;
    Statement stm = null;
    ResultSet res;
    
    //private String stu_Id;
    private String exam_Year;
    private String district;
    private int island_Rank;
    private String subject_1;
    private String result_1;
    private String subject_2;
    private String result_2;
    private String subject_3;
    private String result_3;
    private String z_score;
    
    public BachelorStudent(){}
    
    //public BachelorStudent(String stu_Id, String firstName, String lastName, String contactNo, String email, String address, String gender, String enrolldate, String dob, int island_Rank, String examYear, String AL_Results, String district){
        
        
        //super(stuId, firstName, lastName, contactNo, email, address, gender, enrollDate, dateOfBirth);
        //this.stu_Id = super.getstuId();
        /*stuId = stuId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.enrollDate = enrollDate;
        this.dateOfBirth*/
        //System.out.println(this.stu_Id);
            
        /*this.exam_Year = examYear;
        this.district = district;
        this.island_Rank = island_Rank;
        
        super.setstuId(stu_Id);
        super.setfirstName(firstName);
        super.setlastname(lastName);
        super.setcontactNo(contactNo);
        super.setemail(email);
        super.setaddress(address);
        super.setgender(gender);
        super.setenrolldate(enrolldate);
        super.setdob(dob);
        
       
        /*sql = "INSERT INTO undergraduate (Student_Id, IslandRank, YearOfExam, AL_Results, District) "
                    + "VALUES('"+this.stu_Id+"', '"+this.island_Rank+"', '"+this.exam_Year+"', '"+this.AL_Results+"', '"+this.district+"');";
        
        System.out.println(sql);
        
        try{
            conc = Login.conn;
            
            stm = conc.createStatement();
            stm.executeUpdate(sql);
            if((stm.executeUpdate(sql)) == 1){
                JOptionPane.showMessageDialog(null, "Data Inserted Successfully!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Something Wrong!");
            }
        }
        catch(Exception er){
            er.printStackTrace();
        }*/
    public String getExamYear(){
        return this.exam_Year;
    }
    
    public String getDistrict(){
        return this.district;
    }
    
    public int getIslandRank(){
        return this.island_Rank;
    }
    
    public String getSubject_1(){
        return this.subject_1;
    }
    
    public String getResult_1(){
        return this.result_1;
    }
    
    public String getSubject_2(){
        return this.subject_2;
    }
    
    public String getResult_2(){
        return this.result_2;
    }
    
    public String getSubject_3(){
        return this.subject_3;
    }
    
    public String getResult_3(){
        return this.result_3;
    }
    
    public String getZscore(){
        return this.z_score;
    }
    
    public void setExamYear(String year){
        this.exam_Year = year;
    }
    
    public void setDistrict(String district){
        this.district = district;
    }
    
    public void setIslandRank(int rank){
        this.island_Rank = rank;
    }
    
    public void setSubject_1(String sub_1){
        this.subject_1 = sub_1;
    }
    
    public void setResult_1(String res_1){
        this.result_1 = res_1;
    }
    
    public void setSubject_2(String sub_2){
        this.subject_2 = sub_2;
    }
    
    public void setResult_2(String res_2){
        this.result_2 = res_2;
    }
    
    public void setSubject_3(String sub_3){
        this.subject_3 = sub_3;
    }
    
    public void setResult_3(String res_3){
        this.result_3 = res_3;
    }
    
    public void setZscore(String zscore){
        this.z_score = zscore;
    }
        
}
    /*public void setStu_Id(String std){
        this.stu_Id = std;
    }*/

    /*BachelorStudent(int parseInt, String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    /*public String getExamYear(){
        return this.exam_Year;
    }
    
    public String getDistrict(){
        return this.district;
    }
    
    public int getIslandRank(){
        return this.island_Rank;
    }
    
    //public String getResults(){
        //return this.AL_Results;
    //}
    
    public void set
   
}*/
