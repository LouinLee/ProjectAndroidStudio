package com.example.projectmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.projectmobile.Model.Register;

import java.util.Date;

import io.realm.Realm;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import io.realm.annotations.Required;

@RealmClass
public class MainActivity extends AppCompatActivity {
    @PrimaryKey
    private String username;
    @Required
    private String NIK;
    @Required
    private Date birthdate;
    @Required
    private String phoneNumber;
    @Required
    private String email;
    @Required
    private String homeAddress;
    @Required
    private String countryName;
    @Required
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Register(String username, String NIK, Date birthdate, String phoneNumber, String email, String homeAddress, String countryName, String password){
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Register register = realm.createObject(Register.class);
                register.setUsername(username);
                register.setNIK(NIK);
                register.setBirthdate(new Date(2002,10,6));
                register.setPhoneNumber(phoneNumber);
                register.setEmail(email);
                register.setHomeAddress(homeAddress);
                register.setCountryName(countryName);
                register.setPassword(password);
            }
        });
    }
}
