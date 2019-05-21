package com.example.roomdatabase;


import android.arch.persistence.room.TypeConverter;

import java.util.Date;

public class DateTypeConverter {

    @TypeConverter
    public long convertDateToLong(Date date){
        return date.getTime();
    }

    @TypeConverter
    public Date convertLongToDate(Long date){
        return new Date(date);
    }

}
