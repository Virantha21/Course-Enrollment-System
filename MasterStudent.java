package javaClasses;


public class MasterStudent extends Student{ //extend using parent class student
    
    //private String stu_Id;
    private String qual_Type;
    private String institute;
    private String complete_Year;
    
    public MasterStudent(){}
    
    public MasterStudent(String stu_Id, String firstName, String lastName, String contactNo, String email, String address, String gender, String enrolldate, String dob, String qual_Type, String institute, String complete_Year){
        
        
        this.qual_Type = qual_Type;
        this.institute = institute;
        this.complete_Year = complete_Year;
        
        super.setstuId(stu_Id);
        super.setfirstName(firstName);
        super.setlastname(lastName);
        super.setcontactNo(contactNo);
        super.setemail(email);
        super.setaddress(address);
        super.setgender(gender);
        super.setenrolldate(enrolldate);
        super.setdob(dob);
    }
    
    public String getQualType(){
        return this.qual_Type;
    }
    
    public String getInstitute(){
        return this.institute;
    }
    
    public String getCompleteYear(){
        return this.complete_Year;
    }
    
    public void setQualType(String qualType){
        this.qual_Type = qualType;
    }
    
    public void setInstitute(String institute){
        this.institute = institute;
    }
    
    public void setCompleteYear(String compYear){
        this.complete_Year = compYear;
    }
}
