package com.pranay.student;

public class Employee {
    private String FirstName;
    private String LastName;
    private String Email;
    private String Mobile;

    // getting First name data from the form
    public String getFirstName() {
        return FirstName;
    }

    // setting First name data from the form
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

}
