package com.example.flashcard_alphabets;

import android.content.Context;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Locale;
import java.util.concurrent.TimeoutException;


public class MyAlphabetAdapter extends RecyclerView.Adapter<MyAlphabetAdapter.ViewHolder> {

    private final alphabetData [] myAlphabets;
    private final Context context;
    private TextToSpeech mTTS;




    public MyAlphabetAdapter(alphabetData [] myAlphabets, Context activity){
        this.myAlphabets = myAlphabets;
        this.context = activity;
    }

    @NonNull
    @Override
    public com.example.flashcard_alphabets.MyAlphabetAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        //View view = layoutInflater.inflate(R.layout.alphabet3_card, parent, false);
        View view = layoutInflater.inflate(R.layout.alphabet3_card, parent, false);
        MyAlphabetAdapter.ViewHolder viewHolder = new ViewHolder(view);
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
                String text_to_speak = myAlphabetData.getAlphabetName();
                //Toast.makeText(context, myAlphabetData.getAlphabetName(), Toast.LENGTH_LONG).show();

                mTTS = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status == TextToSpeech.SUCCESS){
                            int result = mTTS.setLanguage(Locale.UK);
                            speakText(text_to_speak);
                            if (result == TextToSpeech.LANG_MISSING_DATA
                                    || result == TextToSpeech.LANG_NOT_SUPPORTED){
                                Log.e("TTS", "Language not supported");
                            }
                        }
                        else {
                            Log.e("TTS", "Initialization Failed");
                        }
                    }
                });
            }
            private void speakText(String text){
                float pitch = 1.0F;
                float speed = 1.0F;
                mTTS.setPitch(pitch);
                mTTS.setSpeechRate(speed);
                mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
            }

        });

    }

    @Override
    public int getItemCount()
    {
        return myAlphabets.length;

    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView alphaImage;
        TextView alphaText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            alphaImage = itemView.findViewById(R.id.imageview3);
            alphaText = itemView.findViewById(R.id.textview3);
        }
    }

    @Override
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        if (mTTS != null) {
            mTTS.stop();
            mTTS.shutdown();
        }
        super.onDetachedFromRecyclerView(recyclerView);

    }
}
