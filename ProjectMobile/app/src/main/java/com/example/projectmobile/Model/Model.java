package com.example.projectmobile.Model;

import java.util.Date;

import io.realm.RealmObject;

public class Model extends  RealmObject{
    //attribut
    private int userID;
    private String username;
    private String gender;
    private String NIK;
    private Date birthdate;
    private int phoneNumber;
    private String email;
    private String homeAddress;
    private String country;
    private String password;
    private String privateClass;
    private String trainerName;

    private Date bookDate;
    private int quickRespon;
    private String session;
    private String payment;
    private int card;
    private int total;

    public Login(String username,String password){
        this.username = username;
        this.password = password;
    }

    public Model(int userID, String username, String gender, String NIK, Date birthdate, int phoneNumber, String email, String homeAddress, String country, String password) {
        this.userID = userID;
        this.username = username;
        this.gender = gender;
        this.NIK = NIK;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.homeAddress = homeAddress;
        this.country = country;
        this.password = password;
    }

    public bookSession(int userID, String session, String payment, int card, int total){
        this.userID = userID;
        this.session = session;
        this.payment = payment;
        this.card = card;
        this.total = total;
    }

    private int historyID;
    public History(int userID, int historyID){
        this.userID = userID;
        this.historyID = historyID;
    }

    public bookPrivate(String privateClass, String trainerName, Date bookDate, int quickRespon){
        this.privateClass = privateClass;
        this.trainerName = trainerName;
        this.bookDate = bookDate;
        this.quickRespon = quickRespon;
    }

    public String getUsername() {
        return username;
    }
    public String getGender(){return gender;}
    public String getNIK(){return NIK;}

}
