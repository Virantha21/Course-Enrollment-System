
package javaClasses;

public class Lecturer {
    
    /*declare attributes of lecturer class*/
    private String lecturerId;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String title;
    private String room;
    private String faculty;
    
    public Lecturer(){} //constructor of lecturer class(not necessary)
    
    
    /*define set methods*/
    public void setLecturerId(String id){
        this.lecturerId = id;
    }
    
    public void setFirstName(String fname){
        this.firstName = fname;
    }
    
    public void setLastName(String lname){
        this.lastName = lname;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setEmail(String mail){
        this.email = mail;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setRoom(String room){
        this.room = room;
    }
    
    public void setFaculty(String fac){
        this.faculty = fac;
    }
    
    
    /*define get methods*/
    public String getLecturerId(){
        return this.lecturerId;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getRoom(){
        return this.room;
    }
    
    public String getFaculty(){
        return this.faculty;
    }
}
