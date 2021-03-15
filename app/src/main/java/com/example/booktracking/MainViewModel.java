package com.example.booktracking;

import android.app.Application;
import android.media.Rating;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private BookRepository bookRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        bookRepository = new BookRepository(application);
        bookRepository.getAllBooks();
    }

    public void insert(String title, String author, String dateStarted, String dateCompleted, Integer rating) {
        Book b = new Book(title, author, dateStarted, dateCompleted, rating);
        bookRepository.insert(b);
    }

    public Integer getNumberBooks() {
        return bookRepository.getNumberBooks();
    }

    public Book getBook(Integer position) {
        return bookRepository.getBook(position);
    }
}
