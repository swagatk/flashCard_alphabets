package com.example.flashcard_alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AlphabetList extends AppCompatActivity {

    private ListView alphaListView;
    String[] alphabets = {"A, a", "B, b", "C, c", "D, d", "E, e", "F, f", "G, g", "H, h", "I, i",
                "J, j", "K, k",
                "L, l", "M, m", "N, n", "O, o", "P, p", "Q, q", "R, r", "S, s", "T, t", "U, u", "V, v",
                "W, w", "X, x", "Y, y", "Z, z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alphaListView = findViewById(R.id.alphaList);
        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(
                getApplicationContext(),
                R.layout.main_textview,
                alphabets
        );
        alphaListView.setAdapter(arrayAdapter);

        alphaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(AlphabetList.this, alphabet1.class));
                        break;
                    case 1:
                        startActivity(new Intent(AlphabetList.this, alphabet2.class));
                        break;
                    case 2:
                        startActivity(new Intent(AlphabetList.this, alphabet3.class));
                        break;
                    case 3:
                        startActivity(new Intent(AlphabetList.this, alphabet4.class));
                        break;
                    case 4:
                        startActivity(new Intent(AlphabetList.this, alphabet5.class));
                        break;
                    case 5:
                        startActivity(new Intent(AlphabetList.this, alphabet6.class));
                        break;
                    case 6:
                        startActivity(new Intent(AlphabetList.this, alphabet7.class));
                        break;
                    case 7:
                        startActivity(new Intent(AlphabetList.this, alphabet8.class));
                        break;
                    case 8:
                        startActivity(new Intent(AlphabetList.this, alphabet9.class));
                        break;
                    case 9:
                        startActivity(new Intent(AlphabetList.this, alphabet10.class));
                        break;
                    case 10:
                        startActivity(new Intent(AlphabetList.this, alphabet11.class));
                        break;
                    case 11:
                        startActivity(new Intent(AlphabetList.this, alphabet12.class));
                        break;
                    case 12:
                        startActivity(new Intent(AlphabetList.this, alphabet13.class));
                        break;
                    case 13:
                        startActivity(new Intent(AlphabetList.this, alphabet14.class));
                        break;
                    case 14:
                        startActivity(new Intent(AlphabetList.this, alphabet15.class));
                        break;
                    case 15:
                        startActivity(new Intent(AlphabetList.this, alphabet16.class));
                        break;
                    case 16:
                        startActivity(new Intent(AlphabetList.this, alphabet17.class));
                        break;
                    case 17:
                        startActivity(new Intent(AlphabetList.this, alphabet18.class));
                        break;
                    case 18:
                        startActivity(new Intent(AlphabetList.this, alphabet19.class));
                        break;
                    case 19:
                        startActivity(new Intent(AlphabetList.this, alphabet20.class));
                        break;
                    case 20:
                        startActivity(new Intent(AlphabetList.this, alphabet21.class));
                        break;
                    case 21:
                        startActivity(new Intent(AlphabetList.this, alphabet22.class));
                        break;
                    case 22:
                        startActivity(new Intent(AlphabetList.this, alphabet23.class));
                        break;
                    case 23:
                        startActivity(new Intent(AlphabetList.this, alphabet24.class));
                        break;
                    case 24:
                        startActivity(new Intent(AlphabetList.this, alphabet25.class));
                        break;
                    case 25:
                        startActivity(new Intent(AlphabetList.this, alphabet26.class));
                        break;
                    default:
                        Toast.makeText(AlphabetList.this, "Invalid selection", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}