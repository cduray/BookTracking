package com.example.booktracking;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class BookAdapter extends RecyclerView.Adapter<BookViewHolder>{

    Application application;
    MainViewModel mainViewModel;

    public BookAdapter(Application application, MainViewModel mainViewModel){
        this.application = application;
        this.mainViewModel = mainViewModel;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_book_view_holder, parent, false);

        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book currentBook = mainViewModel.getBook(position);
        //holder.recyclerViewBookList.setText(currentBook.toString());
    }

    @Override
    public int getItemCount() {
        return mainViewModel.getNumberBooks();
    }
}

