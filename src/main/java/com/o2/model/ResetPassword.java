package com.o2.model;


import org.springframework.data.mongodb.core.mapping.Document;
/*
 * UserInfo is the collection name inside mongo DB database
 */
@Document(collection = "UserInfo")
public class ResetPassword {


    String password;
    String newPassword;
    String confirmPassword;

    /*Getters and setters*/

    public String getPassword() {
        return password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }


    /*Constructor*/
    public ResetPassword() {

    }

    public ResetPassword(String password, String newPassword, String confirmPassword) {
        super();
        this.password = password;
        this.newPassword = newPassword;
        this.confirmPassword = confirmPassword;
    }






}
