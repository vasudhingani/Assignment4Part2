package com.example.vasu.assignment4part2;


import android.arch.persistence.room.Entity;
import android.support.annotation.NonNull;

@Entity(primaryKeys = {"word", "syn"})

public class Contact {
    @NonNull
    public String word = "";

    @NonNull
    public String syn = "";

    public void setWord(String ss) {
        word = ss;
    }

    public String getWord() {
        return word;
    }

    public void setSyn(String syn) {
        this.syn = syn;
    }

    public String getSyn() {
        return syn;
    }

}