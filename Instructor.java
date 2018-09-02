package javaClasses;

public class Instructor {
    
    private String instrId;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    
    public void setInstrId(String ins_id){
        this.instrId = ins_id;
    }
    
    public String getInstrId(){
        return this.instrId;
    }
    
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setLastName(String lName){
        this.lastName = lName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public void setGender(String gend){
        this.gender = gend;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public void setEmail(String mail){
        this.email = mail;
    }
    
    public String getEmail(){
        return this.email;
    }
}

