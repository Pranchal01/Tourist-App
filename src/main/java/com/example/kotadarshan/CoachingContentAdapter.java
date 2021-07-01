package com.example.kotadarshan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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

public class CoachingContentAdapter extends ArrayAdapter<CoachingContent> {

    private Context context;


    public CoachingContentAdapter(Activity context, ArrayList<CoachingContent> contents)
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
                    R.layout.coaching_cards, parent, false);
        }

//        *******************

        FloatingActionButton map_fab=(FloatingActionButton) listItemView.findViewById(R.id.map);
        FloatingActionButton info_fab = (FloatingActionButton) listItemView.findViewById(R.id.info);
//        *******************

        CoachingContent currentContent = getItem(position);


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

        info_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(currentContent.getInfoURL()));
                context.startActivity(i);
            }
        });

        return listItemView;
    }

}
