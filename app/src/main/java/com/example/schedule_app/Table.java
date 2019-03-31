package com.example.schedule_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Table extends AppCompatActivity {

    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        listview = (ListView) findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<>();

        //Add entries here
        Scanner scan = new Scanner("");
        try {
            scan = new Scanner(new File("Courses"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Course newCourse = new Course();
        while (scan.hasNext()) {
            String name = scan.next();
            int hour1 = scan.nextInt();
            int minute1 = scan.nextInt();
            int hour2 = scan.nextInt();
            int minute2 = scan.nextInt();
            String AMPM1 = scan.next();
            String AMPM2 = scan.next();
            String days = scan.next();
            try {
                newCourse = new Course(name, hour1, minute1, hour2, minute2, AMPM1, AMPM2, days);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        arrayList.add(newCourse.toString());

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listview.setAdapter(arrayAdapter);
    }

}
