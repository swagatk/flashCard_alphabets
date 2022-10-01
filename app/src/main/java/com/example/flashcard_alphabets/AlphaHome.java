package com.example.flashcard_alphabets;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;

public class AlphaHome extends AppCompatActivity {
    private RecyclerView homeRV;
    private GridRecyclerViewAdapter adapter;
    private ListView alphaListView;
    private String[] alphabets = {"A, a", "B, b", "C, c", "D, d", "E, e", "F, f", "G, g", "H, h", "I, i",
            "J, j", "K, k",
            "L, l", "M, m", "N, n", "O, o", "P, p", "Q, q", "R, r", "S, s", "T, t", "U, u", "V, v",
            "W, w", "X, x", "Y, y", "Z, z"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabet_home_grid);

        homeRV = findViewById(R.id.alphaListRV);
        homeRV.setLayoutManager(
                new GridLayoutManager(this, 3,
                        GridLayoutManager.VERTICAL, false)
        );
        homeRV.setHasFixedSize(true);

        adapter = new GridRecyclerViewAdapter(this, Arrays.asList(alphabets));
        homeRV.setAdapter(adapter);







    }
}
