package com.example.roomdatabase;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface ContactsDAO {

    @Insert
    public void insert(Contacts... contacts);

    @Update
    public void update(Contacts... contacts);

    @Delete
    public void delete(Contacts contacts);

    @Query("Select * from contact")
    public List<Contacts> getAllContacts();

    @Query("Select * from contact where phoneNumber = :number")
    public Contacts getContactswithPhoneNumber(String number);

}