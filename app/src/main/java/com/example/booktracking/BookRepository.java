package com.example.booktracking;

import android.app.Application;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private BookDao bookDao;
    private List<Book> allBooks;


    BookRepository(Application application) {
        BookDatabase db = BookDatabase.getDatabase(application);
        bookDao = db.bookDao();
        allBooks = new ArrayList<Book>();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    List<Book> getAllBooks() {
        BookDatabase.databaseWriteExecutor.execute(() -> {
            //heartrateDao.deleteAll();               // if database is currupted delete all the rows
            allBooks = bookDao.getAll();
            Log.d("CIS 3334", "HeartrateRepository: Heartrates retreived = "+allBooks.size());
        });
        return allBooks;
    }

    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    void insert(Book book) {
        BookDatabase.databaseWriteExecutor.execute(() -> {
            bookDao.insert(book);
            allBooks.add(book);
        });
    }

    public Integer getNumberBooks() {
        return allBooks.size();
    }

    public Book getBook(Integer position) {
        return allBooks.get(position);
    }

}
