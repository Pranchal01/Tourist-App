/*  Restaurants page {The list view for cards}
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

public class TopRestaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        ArrayList<RestaurantsContent> restaurantList = new ArrayList<RestaurantsContent>();
        restaurantList.add(new RestaurantsContent("ALL SEASONS",R.drawable.all_season_restaurant,25.220615393750606, 75.87257632637919,"https://www.zomato.com/kota/all-seasons-a-multicuisine-restaurant-civil-lines/order",4.4f));
        restaurantList.add(new RestaurantsContent("BAGICHI",R.drawable.bagichi_restaurant,25.22009853141811, 75.87257382615263,"https://www.zomato.com/kota/bagichi-pure-veg-restaurant-chawani/order",4.0f));
        restaurantList.add(new RestaurantsContent("EATOS",R.drawable.eatos_restaurant_1,25.15329088306767, 75.84510202610494,"https://www.zomato.com/kota/eatos-talwandi/order",4.1f));
        restaurantList.add(new RestaurantsContent("NEW MAHESHWARI",R.drawable.maheshwari_restaurant,25.171973553495114, 75.8524129684797,"https://www.zomato.com/kota/new-maheshwari-restaurant-chawani/order",4.1f));
        restaurantList.add(new RestaurantsContent("SWAGAT",R.drawable.swagat_restaurant_1,25.17481251808506, 75.85238814149534,"https://www.swiggy.com/restaurants/swagat-restaurant-hotel-surya-royal-rampura-kota-77048",4.2f));

        RestaurantsContentAdapter adapter = new RestaurantsContentAdapter(this,restaurantList);

        ListView listView = (ListView) findViewById(R.id.restaurants_list);

        listView.setAdapter(adapter);



    }
}