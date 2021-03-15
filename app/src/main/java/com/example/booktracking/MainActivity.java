package com.example.booktracking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    EditText editTextTitle;
    EditText editTextAuthor;
    EditText editTextDateStarted;
    EditText editTextDateCompleted;
    RatingBar ratingBar;
    Button buttonAddBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI stuff
        editTextTitle = findViewById(R.id.editTextTitle);
        editTextAuthor = findViewById(R.id.editTextAuthor);
        editTextDateStarted = findViewById(R.id.editTextDateStarted);
        editTextDateCompleted = findViewById(R.id.editTextDateCompleted);
        ratingBar = findViewById(R.id.ratingBar);
        buttonAddBook = findViewById(R.id.buttonAddBook);

    }
}