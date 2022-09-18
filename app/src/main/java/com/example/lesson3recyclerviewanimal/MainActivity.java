package com.example.lesson3recyclerviewanimal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> animalList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
            ArrayList<String> animal = new ArrayList<>();
            animalList.add("Dog");
            animalList.add("Cat");
            animalList.add("Mouse");
            animalList.add("Rat");
            animalList.add("Parrot");
            animalList.add("Chicken");
            animalList.add("Cow");
            animalList.add("Pig");
            animalList.add("Sheep");
            animalList.add("Horse");
            animalList.add("Goat");
            animalList.add("Donkey");
            animalList.add("Bear");
            animalList.add("Wolf");
            animalList.add("Fox");
            animalList.add("Tiger");
            animalList.add("Lion");
            animalList.add("Elephant");
            animalList.add("Monkey");
            animalList.add("Spider");

        AnimalAdapter adapter = new AnimalAdapter(animalList);
        recyclerView.setAdapter(adapter);

    }
}