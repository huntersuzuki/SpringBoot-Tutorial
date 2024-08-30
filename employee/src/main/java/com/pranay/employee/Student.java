package com.pranay.employee;

public class Student {
    private String FirstName;
    private String LastName;
    private String Email;
    private String STD;
    private String Complaint;

    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public String getLastName(){
        return LastName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }

    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }

    public String getSTD(){
        return STD;
    }
    public void setSTD(String STD){
        this.STD = STD;
    }

    public String getComplaint(){
        return Complaint;
    }
    public void setComplaint(String Complaint){
        this.Complaint = Complaint; 
    }
}
