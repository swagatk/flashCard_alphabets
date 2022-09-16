package com.example.flashcard_alphabets;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class alphabet18 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet3);

        RecyclerView recyclerView = findViewById(R.id.recyclerView3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        alphabetData [] myAlphabetData = new alphabetData[]{
                new alphabetData("Rabbit", R.drawable.rabbit),
                new alphabetData("Rain", R.drawable.rain),
                new alphabetData("Rainbow", R.drawable.rainbow),
        };

        MyAlphabetAdapter myAlphabetAdapter = new MyAlphabetAdapter(myAlphabetData, alphabet18.this);
        recyclerView.setAdapter(myAlphabetAdapter);
    }
}
