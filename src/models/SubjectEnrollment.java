
package javaClasses;


public class SubjectEnrollment {
    private String sem1ComSub1;
    private String sem1ComSub2;
    private String sem1ComSub3;
    private String sem1ComSub4;
    private String sem1OptSub1;
    private String sem1OptSub2;
    private String sem1OptSub3;
    
    private String sem2ComSub1;
    private String sem2ComSub2;
    private String sem2ComSub3;
    private String sem2ComSub4;
    private String sem2OptSub1;
    private String sem2OptSub2;
    private String sem2OptSub3;
    
    private int sem1Payment;
    private int sem2Payment;
    
    private int totalCredits;
    
    public SubjectEnrollment(){}
    
    public void setSem1ComSub1(String sub){
        this.sem1ComSub1 = sub;
    }
    
    public void setSem1ComSub2(String sub){
        this.sem1ComSub2 = sub;
    }
    
    public void setSem1ComSub3(String sub){
        this.sem1ComSub3 = sub;
    }
    
    public void setSem1ComSub4(String sub){
        this.sem1ComSub4 = sub;
    }
    
    public void setSem1OptSub1(String sub){
        this.sem1OptSub1 = sub;
    }
    
    public void setSem1OptSub2(String sub){
        this.sem1OptSub2 = sub;
    }
    
    public void setSem1OptSub3(String sub){
        this.sem1OptSub3 = sub;
    }
    
    public void setSem2ComSub1(String sub){
        this.sem2ComSub1 = sub;
    }
    
    public void setSem2ComSub2(String sub){
        this.sem2ComSub2 = sub;
    }
    
    public void setSem2ComSub3(String sub){
        this.sem2ComSub3 = sub;
    }
    
    public void setSem2ComSub4(String sub){
        this.sem2ComSub4 = sub;
    }
    
    public void setSem2OptSub1(String sub){
        this.sem2OptSub1 = sub;
    }
    
    public void setSem2OptSub2(String sub){
        this.sem2OptSub2 = sub;
    }
    
    public void setSem2OptSub3(String sub){
        this.sem2OptSub3 = sub;
    }
    
    public void setSem1Payment(int fee){
        this.sem1Payment = fee;
    }
    
    public void setSem2Payment(int fee){
        this.sem2Payment = fee;
    }
    
    public void setTotalCredits(int credits){
        this.totalCredits = credits;
    }
    
    public String getSem1ComSub1(){
        return sem1ComSub1;
    }
    
    public String getSem1ComSub2(){
        return sem1ComSub2;
    }
    
    public String getSem1ComSub3(){
        return sem1ComSub3;
    }
    
    public String getSem1ComSub4(){
        return sem1ComSub4;
    }
    
    public String getSem1OptSub1(){
        return sem1OptSub1;
    }
    
    public String getSem1OptSub2(){
        return sem1OptSub2;
    }
    
    public String getSem1OptSub3(){
        return sem1OptSub3;
    }
    
    public String getSem2ComSub1(){
        return sem2ComSub1;
    }
    
    public String getSem2ComSub2(){
        return sem2ComSub2;
    }
    
    public String getSem2ComSub3(){
        return sem2ComSub3;
    }
    
    public String getSem2ComSub4(){
        return sem2ComSub4;
    }
    
    public String getSem2OptSub1(){
        return sem2OptSub1;
    }
    
    public String getSem2OptSub2(){
        return sem2OptSub2;
    }
    
    public String getSem2OptSub3(){
        return sem2OptSub3;
    }
    
    public int getSem1Payment(){
        return sem1Payment;
    }
    
    public int getSem2Payment(){
        return sem2Payment;
    }
    
    public int getTotalCredits(){
        return totalCredits;
    }
}
