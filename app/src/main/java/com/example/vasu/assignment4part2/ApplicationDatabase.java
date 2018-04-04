package com.example.vasu.assignment4part2;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Contact.class}, version = 1)
public abstract class ApplicationDatabase extends RoomDatabase {
    public abstract ContactDao contactModel();
    private static ApplicationDatabase appDatabase;

    public static ApplicationDatabase fetch(Context context) {
        return Room.databaseBuilder(context.getApplicationContext(),ApplicationDatabase.class,"database-filename").build();

    }
}