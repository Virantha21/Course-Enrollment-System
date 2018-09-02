package javaClasses;

public class Student {
    
    private String stuId;
    private String firstName;
    private String lastName;
    private String contactNo;
    private String email;
    private String address;
    private String gender;
    private String enrollDate;
    private String dateOfBirth;
    private String stuType;
    private String courseId;
    private String intake;
    private String aca_year;
    
    public Student(){};
    
    public String getstuId(){
        return this.stuId;
    }
    
    public String getstuType(){
        return this.stuType;
    }
    
    public String getfirstName(){
        return this.firstName;
    }
    
    public String getlastName(){
        return this.lastName;
    }
    
    public String getcontactNo(){
        return this.contactNo;
    }
    
    public String getemail(){
        return this.email;
    }
    
    public String getaddress(){
        return this.address;
    }
    
    public String getenrollDate(){
        return this.enrollDate;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public String getdateOfBirth(){
        return this.dateOfBirth;
    }
    
    public String getcourseId(){
        return this.courseId;
    }
    
    public String getIntake(){
        return this.intake;
    }
    
    public String getAcaYear(){
        return this.aca_year;
    }
    
    public void setstuId(String std){
        this.stuId = std;
    }
    
    public void setstuType(String type){
        this.stuType = type;
    }
    
    public void setfirstName(String fname){
        this.firstName = fname;
    }
    
    public void setlastname(String lname){
        this.lastName = lname;
    }
    
    public void setcontactNo(String cn){
        this.contactNo = cn;
    }
    
    public void setemail(String em){
        this.email = em;
    }
    
    public void setaddress(String ad){
        this.address = ad;
    }
    
    public void setgender(String gen){
        this.gender = gen;
    }
    
    public void setenrolldate(String end){
        this.enrollDate = end;
    }
    
    public void setdob(String dob){
        this.dateOfBirth = dob;
    }
    
    public void setcourseId(String course){
        this.courseId = course;
    }
    
    public void setIntake(String intake){
        this.intake = intake;
    }
    
    public void setAcaYear(String year){
        this.aca_year = year;
    }
}
