package com.pranay.htmlrendering.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String detail;
    private String doj;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDetails(){
        return detail;
    }
    public void setDetails(String detail){
        this.detail = detail;
    }
    public String getDoj(){
        return doj;
    }
    public void setDoj(String doj){
        this.doj=doj;
    }
}
