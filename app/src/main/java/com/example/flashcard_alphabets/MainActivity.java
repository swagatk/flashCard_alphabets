package com.example.flashcard_alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView alphaListView;
    String alphabets[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alphaListView = (ListView) findViewById(R.id.alphaList);
        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                alphabets
        );
        alphaListView.setAdapter(arrayAdapter);

        alphaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, alphabet1.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, alphabet2.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, alphabet3.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, alphabet4.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, alphabet5.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this, alphabet6.class));
                        break;
                    case 6:
                        startActivity(new Intent(MainActivity.this, alphabet7.class));
                        break;
                    case 7:
                        startActivity(new Intent(MainActivity.this, alphabet8.class));
                        break;
                    case 8:
                        startActivity(new Intent(MainActivity.this, alphabet9.class));
                        break;
                    case 9:
                        startActivity(new Intent(MainActivity.this, alphabet10.class));
                        break;
                    case 10:
                        startActivity(new Intent(MainActivity.this, alphabet11.class));
                        break;
                    case 11:
                        startActivity(new Intent(MainActivity.this, alphabet12.class));
                        break;
                    case 12:
                        startActivity(new Intent(MainActivity.this, alphabet13.class));
                        break;
                    case 13:
                        startActivity(new Intent(MainActivity.this, alphabet14.class));
                        break;
                    case 14:
                        startActivity(new Intent(MainActivity.this, alphabet15.class));
                        break;
                    case 15:
                        startActivity(new Intent(MainActivity.this, alphabet16.class));
                        break;
                    case 16:
                        startActivity(new Intent(MainActivity.this, alphabet17.class));
                        break;
                    case 17:
                        startActivity(new Intent(MainActivity.this, alphabet18.class));
                        break;
                    case 18:
                        startActivity(new Intent(MainActivity.this, alphabet19.class));
                        break;
                    case 19:
                        startActivity(new Intent(MainActivity.this, alphabet20.class));
                        break;
                    case 20:
                        startActivity(new Intent(MainActivity.this, alphabet21.class));
                        break;
                    case 21:
                        startActivity(new Intent(MainActivity.this, alphabet22.class));
                        break;
                    case 22:
                        startActivity(new Intent(MainActivity.this, alphabet23.class));
                        break;
                    case 23:
                        startActivity(new Intent(MainActivity.this, alphabet24.class));
                        break;
                    case 24:
                        startActivity(new Intent(MainActivity.this, alphabet25.class));
                        break;
                    case 25:
                        startActivity(new Intent(MainActivity.this, alphabet26.class));
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Invalid selection", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}