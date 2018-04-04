package com.example.vasu.assignment4part2;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ContactDao {


    @Query("select * from contact WHERE word=(:word)")
    List<Contact> loadAllByIds(String word);

    @Query("SELECT * FROM contact WHERE word=(:syn)")
    Contact findByName(String syn);

    @Insert
    void insertUser(Contact... contacts);


}
