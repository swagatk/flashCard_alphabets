package com.example.flashcard_alphabets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


public class MyAlphabetAdapter extends RecyclerView.Adapter<MyAlphabetAdapter.ViewHolder> {

    private alphabetData [] myAlphabets;
    private Context context;

    public MyAlphabetAdapter(alphabetData [] myAlphabets, Context activity){
        this.myAlphabets = myAlphabets;
        this.context = activity;
    }

    @NonNull
    @Override
    public com.example.flashcard_alphabets.MyAlphabetAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.alphabet3_card, parent, false);
        MyAlphabetAdapter.ViewHolder viewHolder = new MyAlphabetAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAlphabetAdapter.ViewHolder holder, int position) {
        final alphabetData myAlphabetData = myAlphabets[position];
        holder.alphaText.setText(myAlphabetData.getAlphabetName());
        holder.alphaImage.setImageResource(myAlphabetData.getAlphabetImage() );

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myAlphabetData.getAlphabetName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
                            return myAlphabets.length;
                                                      }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView alphaImage;
        TextView alphaText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            alphaImage = itemView.findViewById(R.id.imageview3);
            alphaText = itemView.findViewById(R.id.textview3);
        }
    }
}
