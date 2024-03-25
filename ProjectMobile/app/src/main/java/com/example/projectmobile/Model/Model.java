package com.example.projectmobile.Model;

import java.util.Date;

import io.realm.RealmObject;

public class Model extends  RealmObject{

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

    public login(String username,String password){
        this.username = username;
        this.password = password;
    }

    public model(int userID, String username, String gender, String NIK, Date birthdate, int phoneNumber, String email, String homeAddress, String country, String password) {
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
    public history(int userID, int historyID){
        this.userID = userID;
        this.historyID = historyID;
    }

    public bookPrivate(String privateClass, String trainerName, Date bookDate, int quickRespon){
        this.privateClass = privateClass;
        this.trainerName = trainerName;
        this.bookDate = bookDate;
        this.quickRespon = quickRespon;
    }

    private int getUserID(){
        return userID;
    }

    private int setUserID(){
        return userID;
    }

    private int deleteUserID(){
        return userID;
    }

    private String getUsername(){
        return username;
    }

    private String setUsername(){
        return username;
    }

    private String deleteUsername(){
        return username;
    }

    private String getGender(){
        return gender;
    }

    private String setGender(){
        return gender;
    }

    private String deleteGender(){
        return gender;
    }

    private String getNIK(){
        return NIK;
    }

    private String setNIK(){
        return NIK;
    }

    private String deleteNIK(){
        return NIK;
    }

    private Date getBirthdate(){
        return birthdate;
    }

    private Date setBrithdate(){
        return birthdate;
    }

    private Date deleteBirthdate(){
        return birthdate;
    }

    private int getPhoneNumber(){
        return phoneNumber;
    }

    private int setPhoneNumber(){
        return phoneNumber;
    }

    private int deletePhoneNumber(){
        return phoneNumber;
    }

    private String getEmail(){
        return email;
    }

    private String setEmail(){
        return email;
    }

    private String deleteEmail(){
        return email;
    }

    private String getHomeAddress(){
        return homeAddress;
    }

    private String setHomeAddress(){
        return homeAddress;
    }

    private String deleteHomeAddress(){
        return homeAddress;
    }

    private String getCountry(){
        return country;
    }

    private String setCountry(){
        return country;
    }

    private String deleteCountry(){
        return country;
    }

    private String getPassword(){
        return password;
    }

    private String setPassword(){
        return password;
    }

    private String deletePassword(){
        return password;
    }

    private String getPrivateClass(){
        return privateClass;
    }

    private String setPrivateClass(){
        return privateClass;
    }

    private String deletePrivateClass(){
        return privateClass;
    }

    private String getTrainerName(){
        return trainerName;
    }

    private String setTrainerName(){
        return trainerName;
    }

    private String deleteTrainerName(){
        return trainerName;
    }

    private Date getBookDate(){
        return bookDate;
    }

    private Date setBookDate(){
        return bookDate;
    }

    private Date deleteBookDate(){
        return bookDate;
    }

    private int getQuickRespon(){
        return quickRespon;
    }

    private int setQuickRespon(){
        return quickRespon;
    }

    private int deleteQuickRespon(){
        return quickRespon;
    }

    private String getSession(){
        return session;
    }

    private String setSession(){
        return session;
    }

    private String deleteSession(){
        return session;
    }

    private String getPayment(){
        return payment;
    }

    private String setPayment(){
        return payment;
    }

    private String deletePayment(){
        return payment;
    }

    private int getCard(){
        return card;
    }

    private int setCard(){
        return card;
    }

    private int deleteCard(){
        return card;
    }

    private int getTotal(){
        return total;
    }

    private int setTotal(){
        return total;
    }

    private int deleteTotal(){
        return total;
    }

    private int getHistoryID(){
        return historyID;
    }

    private int setHistoryID(){
        return historyID;
    }

    private int deleteHistoryID(){
        return historyID;
    }
}
