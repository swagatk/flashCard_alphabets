package com.example.flashcard_alphabets;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

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

        FloatingActionButton fabBack = findViewById(R.id.fabBack);
        fabBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alphabet2.this, alphabet1.class));
            }
        });
    }
}