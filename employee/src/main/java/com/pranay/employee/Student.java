package com.pranay.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String FirstName;
    private String LastName;
    private String Email;
    private String STD;
    private String Complaint;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
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
