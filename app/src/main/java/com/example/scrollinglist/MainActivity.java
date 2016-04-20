package com.example.scrollinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private RecyclerView mRecyclerView;

    private ArrayList<String> mArrayList;
    private BasicAdapter mBasicAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.a_main_toolbar);
        setSupportActionBar(mToolbar);

        mArrayList = new ArrayList<>();
        mArrayList.add("Hello");
        mArrayList.add("World");
        mArrayList.add("Why");
        mArrayList.add("Always");
        mArrayList.add("Me");

        mBasicAdapter = new BasicAdapter(mArrayList);

        mRecyclerView = (RecyclerView) findViewById(R.id.a_main_recycler);
        mRecyclerView.setAdapter(mBasicAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }
}
