package com.example.roomdatabase;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;


@Database(entities = {Contacts.class}, version = 1)
@TypeConverters({DateTypeConverter.class})
public abstract class AppDatabase extends RoomDatabase {

    public abstract ContactsDAO getContactDAO();

}
