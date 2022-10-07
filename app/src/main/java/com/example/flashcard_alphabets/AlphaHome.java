package com.example.flashcard_alphabets;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;

public class AlphaHome extends AppCompatActivity {
    private Context mContext;
    private RecyclerView homeRV;
    private GridRecyclerViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] alphabets = {"A, a", "B, b", "C, c", "D, d", "E, e", "F, f", "G, g", "H, h", "I, i",
            "J, j", "K, k",
            "L, l", "M, m", "N, n", "O, o", "P, p", "Q, q", "R, r", "S, s", "T, t", "U, u", "V, v",
            "W, w", "X, x", "Y, y", "Z, z"};
//    private String[] speakText = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
//               "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabet_home_grid);

        // Get application context
        mContext = getApplicationContext();

        homeRV = findViewById(R.id.alphaListRV);
        mLayoutManager = new GridLayoutManager(mContext, calculateNumberOfColumns(2));
        homeRV.setLayoutManager(mLayoutManager);

        //homeRV.setHasFixedSize(true);

        mAdapter = new GridRecyclerViewAdapter(this, Arrays.asList(alphabets));
        homeRV.setAdapter(mAdapter);

    }
    protected int calculateNumberOfColumns(int base){
        int columns = base;
        String screenSize = getScreenSizeCategory();
        if(screenSize.equals("small")){
            if(base != 1){
                columns = columns - 1;
            }
        }else if(screenSize.equals("normal")){
            // Do nothing
        }else if(screenSize.equals("large")){
            columns += 2;
        }else if(screenSize.equals("xlarge")){
            columns += 3;
        }
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            columns = (int) (columns * 1.5);
        }
        return columns;
    }

    protected String getScreenOrientation(){
        String orientation = "undefined";
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            orientation = "landscape";
        }else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            orientation = "portrait";
        }
        return orientation;
    }
    protected String getScreenSizeCategory(){
        int screenLayout = getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK;
        switch (screenLayout){
            case Configuration.SCREENLAYOUT_SIZE_SMALL:
                return "small";
            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
                return "normal";
            case Configuration.SCREENLAYOUT_SIZE_LARGE:
                return "large";
            case Configuration.SCREENLAYOUT_SIZE_XLARGE:
                return "xlarge";
            default:
                return "undefined";
        }
    }
}
