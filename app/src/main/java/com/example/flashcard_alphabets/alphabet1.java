package com.example.flashcard_alphabets;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class alphabet1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet3);

        RecyclerView recyclerView = findViewById(R.id.recyclerView3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        alphabetData [] myAlphabetData = new alphabetData[]{
                new alphabetData("Ant", R.drawable.ant),
                new alphabetData("Apple", R.drawable.apple),
                new alphabetData("Avocado", R.drawable.avocado),
        };

        MyAlphabetAdapter myAlphabetAdapter = new MyAlphabetAdapter(myAlphabetData, alphabet1.this);
        recyclerView.setAdapter(myAlphabetAdapter);
    }

}