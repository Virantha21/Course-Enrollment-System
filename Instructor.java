package javaClasses;

public class Instructor {
    
    /*attributes declaration of instructor class*/
    private String instrId;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    
    
    /*set and get methods to instructor id*/
    public void setInstrId(String ins_id){
        this.instrId = ins_id;
    }
    
    public String getInstrId(){
        return this.instrId;
    }
    
    
    /*set and get methods to first name*/
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    
    /*set and get methods to last name*/
    public void setLastName(String lName){
        this.lastName = lName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    
    /*set and get methods to gender*/
    public void setGender(String gend){
        this.gender = gend;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    
    /*set and get methods to email*/
    public void setEmail(String mail){
        this.email = mail;
    }
    
    public String getEmail(){
        return this.email;
    }
}

