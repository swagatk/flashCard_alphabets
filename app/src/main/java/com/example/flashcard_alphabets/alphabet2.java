package com.example.flashcard_alphabets;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class alphabet2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        alphabetData [] myAlphabetData = new alphabetData[]{
                new alphabetData("Ball", R.drawable.ball),
                new alphabetData("Balloon", R.drawable.balloon),
                new alphabetData("Banana", R.drawable.banana),
                new alphabetData("Bear", R.drawable.bear),
                new alphabetData("Bus", R.drawable.bus),
        };

        MyAlphabetAdapter myAlphabetAdapter = new MyAlphabetAdapter(myAlphabetData, alphabet2.this);
        recyclerView.setAdapter(myAlphabetAdapter);


        FloatingActionButton fabFwd = findViewById(R.id.fabFwd);
        fabFwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alphabet2.this, alphabet3.class));
            }
        });

        FloatingActionButton fabUp = findViewById(R.id.fabUp);
        fabUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alphabet2.this, AlphaHome.class));
            }
        });

        FloatingActionButton fabHome = findViewById(R.id.fabHome);
        fabHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alphabet2.this, Dashboard.class));
            }
        });
    }
}