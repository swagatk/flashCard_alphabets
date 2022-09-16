package com.example.flashcard_alphabets;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class alphabet22 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet3);

        RecyclerView recyclerView = findViewById(R.id.recyclerView3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        alphabetData [] myAlphabetData = new alphabetData[]{
                new alphabetData("Van", R.drawable.van),
                new alphabetData("Vegetables", R.drawable.vegetables),
                new alphabetData("Violin", R.drawable.violin),
        };

        MyAlphabetAdapter myAlphabetAdapter = new MyAlphabetAdapter(myAlphabetData, alphabet22.this);
        recyclerView.setAdapter(myAlphabetAdapter);
    }
}
