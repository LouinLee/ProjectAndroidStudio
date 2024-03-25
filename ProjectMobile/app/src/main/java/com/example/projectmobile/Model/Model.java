package com.example.projectmobile.Model;

import com.example.projectmobile.R;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import io.realm.annotations.Required;

@RealmClass
public class Model extends  RealmObject{
    @PrimaryKey
    private int userID;
    @Required
    private String username;
    @Required
    private String gender;
    @Required
    private String NIK;
    @Required
    private Date birthdate;
    @Required
    private int phoneNumber;
    @Required
    private String email;
    @Required
    private String homeAddress;
    @Required
    private String country;
    @Required
    private String password;
    @Required
    private String privateClass;
    @Required
    private String trainerName;
    @Required
    private Date bookDate;
    @Required
    private int quickRespon;
    @Required
    private String session;
    @Required
    private String payment;
    @Required
    private int card;
    @Required
    private int total;

    public Login(String username,String password){
        this.username = username;
        this.password = password;
    }

    public Register(int userID, String username, String gender, String NIK, Date birthdate, int phoneNumber, String email, String homeAddress, String country, String password) {
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

    public void inputData(){
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Register register = realm.createObject(Register.class);
                register.setIdUser("1");
                register.setNamaUser("Produk Baru");
                register.setAlamatUser(R.drawable.ic_launcher_background);
                register.setKodePos(10800);
                register.setCountry();
            }
        });
    }
}
