/*  Coachings page {The list view for cards}
 *
 *
 * */


package com.example.kotadarshan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.example.kotadarshan.R;

import java.util.ArrayList;

public class TopCoachings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coaching);

        ArrayList<CoachingContent> coachingContents = new ArrayList<>();
        coachingContents.add(new CoachingContent("ALLEN",R.drawable.allen,25.140510357229207, 75.84605900297937,"https://www.allen.ac.in/"));

        coachingContents.add(new CoachingContent("AAKASH",R.drawable.aakash,26.933512922235874, 75.80227903825856,"https://www.aakash.ac.in/"));

        coachingContents.add(new CoachingContent("BANSAL CLASSES",R.drawable.bansal,25.146014536947323, 75.88133855498694,"https://www.bansal.ac.in/"));

        coachingContents.add(new CoachingContent("MOTION",R.drawable.motion,25.14518796547179, 75.86269167004299,"https://motion.ac.in/"));

        coachingContents.add(new CoachingContent("NUCLEUS",R.drawable.nucleus,25.137512382145122, 75.84453177510122,"https://www.nucleuseducation.in/"));

        coachingContents.add(new CoachingContent("RESONANCE",R.drawable.reso,25.140569772055986, 75.85584608223427,"https://www.resonance.ac.in/"));

        coachingContents.add(new CoachingContent("VIBRANT",R.drawable.vibrant,25.141254444902668, 75.85800679731491,"https://www.vibrantacademy.com/"));

        CoachingContentAdapter adapter = new CoachingContentAdapter(this,coachingContents);

        ListView listView = (ListView) findViewById(R.id.coachings_list);

        listView.setAdapter(adapter);

    }
}