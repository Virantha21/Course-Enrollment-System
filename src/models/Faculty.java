
package javaClasses;

public class Faculty {
    
    private String facultyName;
    private String facultyId;
    
    public void setFacultyName(String name){
        this.facultyName = name;
    }
    
    public void setFacultyId(String id){
        this.facultyId = id;
    }
    
    public String getFacultyName(){
        return this.facultyName;
    }
    
    public String getFacultyId(){
        return this.facultyId;
    }
    
}
