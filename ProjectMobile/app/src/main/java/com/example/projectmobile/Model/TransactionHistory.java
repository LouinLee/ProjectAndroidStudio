package com.example.projectmobile.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class TransactionHistory extends RealmObject {
    @PrimaryKey
    private String historyID;
    @Required
    private String username;
    @Required
    private BookSession session;

    public TransactionHistory(String historyID, String username, BookSession session){
        this.username = username;
        this.historyID = historyID;
        this.session = session;
    }
}
