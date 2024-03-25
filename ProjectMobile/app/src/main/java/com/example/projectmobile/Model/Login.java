package com.example.projectmobile.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Login extends RealmObject {
    @PrimaryKey
    private Register username;
    @Required
    private Register password;
    public Login(Register username,Register password){
        this.username = username;
        this.password = password;
    }
}
