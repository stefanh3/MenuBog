package com.example.menubog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();
        restaurantList.add(new Restaurant("Sanjana's Weird Drinks Store", "Not being able to read the words on the packaging is part of the fun!", "Sanjana.png", "1");
        restaurantList.add(new Restaurant("Ella's Char Grilled Rulers", "Freshly baked in homeroom class, probably time to get a watch if you can't make it", "Ella.png"));
        restaurantList.add(new Restaurant("Alin's Salad Bar", "Join chef Ibrahim on a culinary experience thorugh his freshly crafted selection of his favourite salads!", "Alin.png"));
        restaurantList.add(new Restaurant("Stefan's Diner", "Rebranded from Karen's diner for marketing purposes", "Stefan.png"));

        restaurantList.add(new Restaurant("McDonald's", "I'm lovin' it!", "Maccas.png"));
        restaurantList.add(new Restaurant("Kentucky Fried Chicken", "Finger lickin' good", "KFC.png"));
        restaurantList.add(new Restaurant("Hungry Jack's", "The burgers are better at Hungry Jack's", "hungryJacks.png"));
        restaurantList.add(new Restaurant("Red Rooster", "It's gotta be red", "redRooster.png"));
        restaurantList.add(new Restaurant("Chicken Treat", "We wouldn't bother if it wasn't better", "chickenTreat.png"));
        restaurantList.add(new Restaurant("Oporto", "Fuel tonight with flavour", "oporto.png"));
        restaurantList.add(new Restaurant("San Churro", "My house is your house", "sanChurro.png"));
        restaurantList.add(new Restaurant("Taco Bell", "Live mas", "tacoBell.png"));
        restaurantList.add(new Restaurant("Guzman y Gomez", "Imagine if fast food was something mum said yes to", "guzman.png"));

        FragmentManager fragMan = getSupportFragmentManager();

        RestaurantListFragment restaurantListFragment = (RestaurantListFragment) fragMan.findFragmentById(R.id.fragmentView);
        if(restaurantListFragment == null) {
            restaurantListFragment = new RestaurantListFragment(restaurantList);
            fragMan.beginTransaction().add(R.id.fragmentView, restaurantListFragment).commit();
        }
    }
}