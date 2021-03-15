package com.example.booktracking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class BookViewHolder extends RecyclerView.ViewHolder {

    RecyclerView recyclerViewBookList;

    public BookViewHolder(@NonNull View itemView){
        super(itemView);
        recyclerViewBookList = itemView.findViewById(R.id.recyclerViewBookList);
    }
}