package com.example.booktracking;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface BookDao {
    @Query("SELECT * FROM Book")
    List<Book> getAll();

    @Insert
    void insert(Book book);

    @Delete
    void delete(Book book);

    @Query("DELETE FROM Book")
    void deleteAll();

    //@Query("SELECT * FROM Book WHERE id = :Id")
    //Book getByIds(int Id);
}
