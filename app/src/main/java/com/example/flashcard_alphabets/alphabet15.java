package com.example.flashcard_alphabets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class alphabet15 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        alphabetData [] myAlphabetData = new alphabetData[]{
                new alphabetData("Onion", R.drawable.onion),
                new alphabetData("Orange", R.drawable.orange),
                new alphabetData("Owl", R.drawable.owl),
        };

        MyAlphabetAdapter myAlphabetAdapter = new MyAlphabetAdapter(myAlphabetData, alphabet15.this);
        recyclerView.setAdapter(myAlphabetAdapter);


        FloatingActionButton fabFwd = findViewById(R.id.fabFwd);
        fabFwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alphabet15.this, alphabet16.class));
            }
        });

        FloatingActionButton fabBack = findViewById(R.id.fabUp);
        fabBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alphabet15.this, MainActivity.class));
            }
        });
    }
}
