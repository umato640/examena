package com.example.myaplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapters.TestAdapter;
import Models.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Test> data = new ArrayList<>();
        data.add(new Test("Item", "1"));
        data.add(new Test("Item", "2"));
        data.add(new Test("Item", "3"));

        TestAdapter adapter = new TestAdapter(data);
        recyclerView.setAdapter(adapter);

    }
}