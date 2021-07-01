package com.example.kotadarshan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Locale;

public class RestaurantsContentAdapter extends ArrayAdapter<RestaurantsContent> {

    private Context context;


    public RestaurantsContentAdapter(Activity context, ArrayList<RestaurantsContent> contents)
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
                    R.layout.restaurant_cards, parent, false);
        }

//        *******************

        FloatingActionButton map_fab=(FloatingActionButton) listItemView.findViewById(R.id.map);
        FloatingActionButton menu_fab = (FloatingActionButton) listItemView.findViewById(R.id.menu);
//        *******************

        RestaurantsContent currentContent = getItem(position);


        TextView titleText = (TextView) listItemView.findViewById(R.id.header_title);
        titleText.setText(currentContent.getTitleText());


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

        menu_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(currentContent.getMenuURL()));
                context.startActivity(i);
            }
        });

        RatingBar ratingBar = (RatingBar) listItemView.findViewById(R.id.ratingBar);
        ratingBar.setRating(currentContent.getRating());

        return listItemView;
    }

}
