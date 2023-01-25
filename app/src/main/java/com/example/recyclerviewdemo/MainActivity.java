package com.example.recyclerviewdemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<Contact> contactArrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactArrayList = new ArrayList<>();
        contactArrayList.add(new Contact("Name1", 1));
        contactArrayList.add(new Contact("Name2", 2));
        contactArrayList.add(new Contact("Name3", 3));
        contactArrayList.add(new Contact("Name4", 4));
        contactArrayList.add(new Contact("Name5", 5));
        contactArrayList.add(new Contact("Name6", 6));
        contactArrayList.add(new Contact("Name7", 7));
        contactArrayList.add(new Contact("Name8", 8));

        recyclerView = findViewById(R.id.rView);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), contactArrayList);
        recyclerView.setAdapter(recyclerViewAdapter);


    }
}