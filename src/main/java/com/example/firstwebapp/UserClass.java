package com.example.firstwebapp;

public class UserClass {
    String FirstName;
    String LastName;
    String eMail;
    String Password;
    String Profession;
    String UserName;

    public String getFirstName() {

        return FirstName;
    }

    public void setFirstName(String firstName) {

        FirstName = firstName;
    }

    public String getLastName() {

        return LastName;
    }

    public void setLastName(String lastName) {

        LastName = lastName;
    }

    public String geteMail() {

        return eMail;
    }

    public void seteMail(String eMail) {

        this.eMail = eMail;
    }

    public String getPassword() {

        return Password;
    }

    public void setPassword(String password) {

        Password = password;
    }

    public String getProfession() {
        return Profession;
    }
    public void setProfession(String profession) {
        Profession = profession;
    }

    public String getUserName() {

        return UserName;
    }

    public void setUserName(String userName) {

        UserName = userName;
    }
}
