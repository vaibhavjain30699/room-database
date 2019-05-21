package com.example.roomdatabase;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.Date;

@Entity(tableName = "contact")
public class Contacts {

    private String firstname;
    private String lastname;
    @PrimaryKey
    @NonNull
    private String phoneNumber;
    private Date createDate;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @NonNull
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhoneNumber(@NonNull String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
