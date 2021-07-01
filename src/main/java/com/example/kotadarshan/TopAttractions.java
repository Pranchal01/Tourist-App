/*  Attractions page {The list view for cards}
*
*
* */


package com.example.kotadarshan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.kotadarshan.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class TopAttractions extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);


        ArrayList<AttractionsContent> attractionsList = new ArrayList<AttractionsContent>();
        attractionsList.add(new AttractionsContent("SEVEN WONDERS","Replica of 7 wonders of the world.",R.drawable.sevenwonders,25.18005651209302, 75.84873968209487,"SEVEN WONDERS. Replica of 7 wonders of the world."));
        attractionsList.add(new AttractionsContent("KISHORE SAGAR TALAB","Historic manmade lake with a palace.",R.drawable.kishoretalab,25.18508936893946, 75.85154680042973,"KISHORE SAGAR TALAB. Historic manmade lake with a palace."));
        attractionsList.add(new AttractionsContent("KOTA BARRAGE","Dam over Chambal river.",R.drawable.kotabairaj,25.176053383406124, 75.82733899731578,"KOTA BARRAGE. Dam over Chambal river."));
        attractionsList.add(new AttractionsContent("KOTAH GARH","Housed in a 13th-century palace, this museum displays weapons, armor, textiles, art, regalia & more.",R.drawable.kotahgarh,25.175621597134864, 75.83050626847975,"KOTAH GARH. Housed in a 13th-century palace, this museum displays weapons, armor, textiles, art, regalia & more."));
        attractionsList.add(new AttractionsContent("JAG MANDIR","17th centuary palace on island.",R.drawable.jagmandir,25.183249856485855, 75.84942798382367,"JAG MANDIR. 17th centuary palace on island."));

        AttractionContentAdapter adapter = new AttractionContentAdapter(this,attractionsList);

        ListView listView = (ListView) findViewById(R.id.attraction_list);

        listView.setAdapter(adapter);


    }

}