package com.example.flashcard_alphabets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class alphabet13 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        alphabetData [] myAlphabetData = new alphabetData[]{
                new alphabetData("Mango", R.drawable.mango),
                new alphabetData("Milk", R.drawable.milk),
                new alphabetData("Monkey", R.drawable.monkey),
                new alphabetData("Mouse", R.drawable.mouse),
                new alphabetData("Muffin", R.drawable.muffin),
        };

        MyAlphabetAdapter myAlphabetAdapter = new MyAlphabetAdapter(myAlphabetData, alphabet13.this);
        recyclerView.setAdapter(myAlphabetAdapter);

        FloatingActionButton fabFwd = findViewById(R.id.fabFwd);
        fabFwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alphabet13.this, alphabet14.class));
            }
        });

        FloatingActionButton fabBack = findViewById(R.id.fabUp);
        fabBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alphabet13.this, AlphabetList.class));
            }
        });
    }
}
