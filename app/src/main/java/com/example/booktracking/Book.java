package com.example.booktracking;

import android.media.Rating;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Book {
    @PrimaryKey(autoGenerate = true)
    public String title;
    public String author;
    public String dateStarted;
    public String dateCompleted;
    public Integer rating;

    public Book(String title, String author, String dateStarted, String dateCompleted, Integer rating){
        this.title = title;
        this.author = author;
        this.dateStarted = dateStarted;
        this.dateCompleted = dateCompleted;
        this.rating = rating;
    }

    public String toString() { return title + "by" + author + "Started:" + dateStarted + "- Completed:" +dateCompleted + "- Rating:" + rating; }
}


