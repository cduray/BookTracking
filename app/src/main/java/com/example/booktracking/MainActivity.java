package com.example.booktracking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText editTextTitle;
    EditText editTextAuthor;
    EditText editTextDateStarted;
    EditText editTextDateCompleted;
    RatingBar ratingBar;
    Button buttonAddBook;
    RecyclerView recyclerViewBooks;
    BookAdapter bookAdapter;
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View Model/Recycler View
        //mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        recyclerViewBooks = findViewById(R.id.recyclerViewBookList);
        bookAdapter = new BookAdapter(this.getApplication(), mainViewModel);
        recyclerViewBooks.setAdapter(bookAdapter);
        recyclerViewBooks.setLayoutManager(new LinearLayoutManager(this));

        // Initialize UI stuff
        editTextTitle = findViewById(R.id.editTextTitle);
        editTextAuthor = findViewById(R.id.editTextAuthor);
        editTextDateStarted = findViewById(R.id.editTextDateStarted);
        editTextDateCompleted = findViewById(R.id.editTextDateCompleted);
        ratingBar = findViewById(R.id.ratingBar);
        buttonAddBook = findViewById(R.id.buttonAddBook);

        buttonAddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String title = editTextTitle.getText().toString();
                String author = editTextAuthor.getText().toString();
                String dateStarted = editTextDateStarted.getText().toString();
                String dateCompleted = editTextDateCompleted.getText().toString();
                Integer rating = ratingBar.getNumStars();
                mainViewModel.insert(title, author, dateStarted, dateCompleted,rating);
            }
        });

    }
}