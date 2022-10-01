package com.example.flashcard_alphabets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class alphabet3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        alphabetData [] myAlphabetData = new alphabetData[]{
                new alphabetData("candle", R.drawable.candle),
                new alphabetData("car", R.drawable.car),
                new alphabetData("cat", R.drawable.cat),
                new alphabetData("cow", R.drawable.cow),
                new alphabetData("cup", R.drawable.cup),
        };

        MyAlphabetAdapter myAlphabetAdapter = new MyAlphabetAdapter(myAlphabetData, alphabet3.this);
        recyclerView.setAdapter(myAlphabetAdapter);


        FloatingActionButton fabFwd = findViewById(R.id.fabFwd);
        fabFwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alphabet3.this, alphabet4.class));
            }
        });

        FloatingActionButton fabBack = findViewById(R.id.fabUp);
        fabBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alphabet3.this, AlphaHome.class));
            }
        });

    }

}
