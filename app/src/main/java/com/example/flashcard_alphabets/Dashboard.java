package com.example.flashcard_alphabets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        Button btnAlphabet = findViewById(R.id.btnAlphabets);
        Button btnNumber = findViewById(R.id.btnNumbers);
        Button btnShape = findViewById(R.id.btnShapes);


        btnAlphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, AlphaHome.class);
                startActivity(intent);
            }
        });

        btnNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboard.this, "NOT Implemented yet", Toast.LENGTH_SHORT).show();
            }
        });

        btnShape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboard.this, "NOT Implemented yet", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
