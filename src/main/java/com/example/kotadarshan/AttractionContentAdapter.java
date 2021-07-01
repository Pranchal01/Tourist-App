package com.example.kotadarshan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Locale;


public class AttractionContentAdapter extends ArrayAdapter<AttractionsContent> {

    private Context context;

    public TextToSpeech textToSpeech;

    public AttractionContentAdapter(Activity context, ArrayList<AttractionsContent> contents)
    {
        super(context,0,contents);
        this.context=context;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.attraction_cards, parent, false);
        }

//        *******************

        FloatingActionButton map_fab=(FloatingActionButton) listItemView.findViewById(R.id.map);
        FloatingActionButton textToSpeech_fab = (FloatingActionButton) listItemView.findViewById(R.id.volume);
//        *******************

        AttractionsContent currentContent = getItem(position);


        TextView titleText = (TextView) listItemView.findViewById(R.id.header_title);
        titleText.setText(currentContent.getTitleText());

        TextView descriptionText = (TextView) listItemView.findViewById(R.id.description_text);
        descriptionText.setText(currentContent.getDescriptionText());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentContent.getImageId());

//        ******************

        map_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:"+currentContent.getMapX()+","+currentContent.getMapY()+"?z=90");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(mapIntent);
                }
            }
        });
        textToSpeech = new TextToSpeech(context.getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

                // if No error is found then only it will run
                if (i != TextToSpeech.ERROR) {
                    // To Choose language of speech
                    textToSpeech.setLanguage(Locale.US);
                }
            }
        });

        // Adding OnClickListener
        textToSpeech_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(currentContent.getTextToSpeech(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

//        ******************

        return listItemView;
    }
}