package com.example.flashcard_alphabets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class alphabet16 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        alphabetData [] myAlphabetData = new alphabetData[]{
                new alphabetData("Pineapple", R.drawable.pineapple),
                new alphabetData("Pen", R.drawable.pen),
                new alphabetData("Penguin", R.drawable.penguin),
                new alphabetData("Piano", R.drawable.piano),
                new alphabetData("Pig", R.drawable.pig),
        };

        MyAlphabetAdapter myAlphabetAdapter = new MyAlphabetAdapter(myAlphabetData, alphabet16.this);
        recyclerView.setAdapter(myAlphabetAdapter);


        FloatingActionButton fabFwd = findViewById(R.id.fabFwd);
        fabFwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alphabet16.this, alphabet17.class));
            }
        });

        FloatingActionButton fabBack = findViewById(R.id.fabUp);
        fabBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alphabet16.this, MainActivity.class));
            }
        });
    }
}
