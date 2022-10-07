package com.example.flashcard_alphabets;

import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Locale;

public class GridRecyclerViewAdapter extends RecyclerView.Adapter<GridRecyclerViewAdapter.AlphaGridViewHolder> {

    private Context context;
    private List<String> letters;
    private TextToSpeech mTTS;

    public GridRecyclerViewAdapter(Context context, List<String> letters) {
        this.context = context;
        this.letters = letters;
    }

    @NonNull
    @Override
    public AlphaGridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.alpha_item_view, parent, false);
        return new AlphaGridViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AlphaGridViewHolder holder, int position) {
        holder.myTextView.setText(letters.get(position));
        int new_position = holder.getAdapterPosition();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // speaking out text
                String textToSpeak = letters.get(new_position);
                mTTS = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status == TextToSpeech.SUCCESS){
                            int result = mTTS.setLanguage(Locale.UK);
                            speakText(textToSpeak);
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

                //opening new activity
                Intent intent;
                switch (new_position) {
                    case 0:
                        intent = new Intent(v.getContext(), alphabet1.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(v.getContext(), alphabet2.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(v.getContext(), alphabet3.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(v.getContext(), alphabet4.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(v.getContext(), alphabet5.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(v.getContext(), alphabet6.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(v.getContext(), alphabet7.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(v.getContext(), alphabet8.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(v.getContext(), alphabet9.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(v.getContext(), alphabet10.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(v.getContext(), alphabet11.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(v.getContext(), alphabet12.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(v.getContext(), alphabet13.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 13:
                        intent = new Intent(v.getContext(), alphabet14.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 14:
                        intent = new Intent(v.getContext(), alphabet15.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 15:
                        intent = new Intent(v.getContext(), alphabet16.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 16:
                        intent = new Intent(v.getContext(), alphabet17.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 17:
                        intent = new Intent(v.getContext(), alphabet18.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 18:
                        intent = new Intent(v.getContext(), alphabet19.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 19:
                        intent = new Intent(v.getContext(), alphabet20.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 20:
                        intent = new Intent(v.getContext(), alphabet21.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 21:
                        intent = new Intent(v.getContext(), alphabet22.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 22:
                        intent = new Intent(v.getContext(), alphabet23.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 23:
                        intent = new Intent(v.getContext(), alphabet24.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 24:
                        intent = new Intent(v.getContext(), alphabet25.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 25:
                        intent = new Intent(v.getContext(), alphabet26.class);
                        v.getContext().startActivity(intent);
                        break;
                    default:
                        Toast.makeText(v.getContext(), "Invalid selection", Toast.LENGTH_SHORT).show();
                }
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
    public int getItemCount() {
        return letters.size();
    }

    public static class AlphaGridViewHolder extends RecyclerView.ViewHolder {

        TextView myTextView;

        public AlphaGridViewHolder(@NonNull View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.alphaGridCardText);
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
