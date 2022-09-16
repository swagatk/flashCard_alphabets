package com.example.flashcard_alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class alphabet1 extends AppCompatActivity {

    private ListView mlistView;
    private String [] names = {"Apple", "Ant", "Avocado"};
    private int [] images = {R.drawable.apple, R.drawable.ant, R.drawable.avocado};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet1);

        mlistView = findViewById(R.id.listview1);

        MyAdapter adapter = new MyAdapter();
        mlistView.setAdapter(adapter);
    }
    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.alphabet1_card, parent, false);
            ImageView mImageView = convertView.findViewById(R.id.imageview);
            TextView mTextView = convertView.findViewById(R.id.textview);
            mTextView.setText(names[position]);
            mImageView.setImageResource(images[position]);
            return convertView;
        }
    }
}