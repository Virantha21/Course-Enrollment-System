package javaClasses;


class Course {
    private String courseId;
    private String courseName;
    private String courseType;
    private String faculty;
    
    public Course(){};
    
    public Course(String coId, String coName, String coType, String fac){
        this.courseId = coId;
        this.courseName = coName;
        this.courseType = coType;
        this.faculty = fac;
    }

    Course(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getCourseId(){
        return courseId;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public String getCourseType(){
        return courseType;
    }
    
    public String getFaculty(){
        return faculty;
    }
    
    public void setCourseId(String courseid){
        this.courseId = courseid;
    }
    
    public void setCourseName(String coursename){
        this.courseName = coursename;
    }
    
    public void setCourseType(String coursetype){
        this.courseType = coursetype;
    }
    
    public void setFaculty(String facultyId){
        this.faculty = facultyId;
    }
}
