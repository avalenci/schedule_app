package com.example.schedule_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Table extends AppCompatActivity {

    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        listview = (ListView) findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<>();

        //Add entries here
        arrayList.add("");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listview.setAdapter(arrayAdapter);
    }

}
