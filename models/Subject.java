
package javaClasses;

public class Subject {
    private String subCode;
    private String subName;
    private String semester;
    private int subFee;
    private int subCredit;
    private String year;
    private String courseId;
    private String lecturerId;
    private String subType;
    
    private static int allCredits = 0;
    
    public Subject(){}
    
    public void setSubCode(String sub_code){
        this.subCode = sub_code;
    }
    
    public void setSubName(String sub_name){
        this.subName = sub_name;
    }
    
    public void setSemester(String sem){
        this.semester = sem;
    }
    
    public void setSubFee(int sub_fee){
        this.subFee = sub_fee;
    }
    
    public void setSubCredit(int sub_credit){
        this.subCredit = sub_credit;
        allCredits += sub_credit;
    }
    
    public void setYear(String year){
        this.year = year;
    }
    
    public void setCourseId(String course_id){
        this.courseId = course_id;
    }
    
    public void setLecturerId(String lecture_id){
        this.lecturerId = lecture_id;
    }
    
    public void setSubType(String type){
        this.subType = type;
    }
    
    public String getSubCode(){
        return this.subCode;
    }
    
    public String getSubName(){
        return this.subName;
    }
    
    public String getSemester(){
        return this.semester;
    }
    
    public int getSubFee(){
        return this.subFee;
    }
    
    public int getSubCredit(){
        return this.subCredit;
    }
    
    public String getYear(){
        return this.year;
    }
    
    public String getCourseId(){
        return this.courseId;
    }
    
    public String getLecturerId(){
        return this.lecturerId;
    }
    
    public String getSubType(){
        return this.subType;
    }
    
    public static int totalCredits(){
        return allCredits;
    }
}
