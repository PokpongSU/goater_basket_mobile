package com.example.myprojectgoater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.giannis, "Giannis Antetokounmpo", "Forward : 31.1 PPG, 11.8 RPG, 5.7"));
        exampleList.add(new ExampleItem(R.drawable.kd, "Kevin Durant", "Forward : 29.1 PPG, 6.7 RPG, 5.0"));
        exampleList.add(new ExampleItem(R.drawable.embiid, "Joel Embiid", "Center : 33.1 PPG, 10.2 RPG, 4.2"));
        exampleList.add(new ExampleItem(R.drawable.curry, "Stephen Curry", "Guard : 29.4 PPG, 6.1 RPG, 6.3"));
        exampleList.add(new ExampleItem(R.drawable.jokic, "Nikola Jokic", "Center : 24.5 PPG, 11.8 RPG, 9.8"));
        exampleList.add(new ExampleItem(R.drawable.tatum, "Jayson Tatum", "Forward : 30.1 PPG, 8.8 RPG, 4.6"));
        exampleList.add(new ExampleItem(R.drawable.kawhi, "Kawhi Leonard", "Forward : 23.8 PPG, 6.5 RPG, 3.9"));
        exampleList.add(new ExampleItem(R.drawable.lebron, "LeBron James", "Forward : 28.9 PPG, 8.3 RPG, 6.8"));
        exampleList.add(new ExampleItem(R.drawable.booker, "Devin Booker", "Guard : 27.8 PPG, 4.5 RPG, 5.5"));
        exampleList.add(new ExampleItem(R.drawable.ad, "Anthony Davis", "Guard : 25.9 PPG, 12.5 RPG, 2.6"));


        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);



    }
    public void openActivity3() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}