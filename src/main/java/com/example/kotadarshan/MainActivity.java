/*  Main page of app
*   contains cards for 1. Top attractions
*                       2. Top restaurants
*                       3. Top coaching
* */

package com.example.kotadarshan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.kotadarshan.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//       TopAttraction class intent
        CardView topAttractions = findViewById(R.id.attractions);
        topAttractions.setOnClickListener(v -> {
            Intent intent = new Intent(this,TopAttractions.class);
            startActivity(intent);
        });
//      TopRestaurants class intent
        CardView topRestaurants = findViewById(R.id.restaurants);
        topRestaurants.setOnClickListener(v -> {
            Intent intent = new Intent(this,TopRestaurants.class);
            startActivity(intent);
        });
//      TopCoaching class intent
        CardView topCoaching = findViewById(R.id.coachings);
        topCoaching.setOnClickListener(v -> {
            Intent intent = new Intent(this,TopCoachings.class);
            startActivity(intent);
        });
    }
}