package com.example.schedule_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public Course course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Use this to test methods
    public void newSchedule(View view) {
        Intent intent = new Intent(this, StartSchedule.class);
        startActivity(intent);

    }

    public static Object parseJson(String filename) throws FileNotFoundException, JSONException {
        JSONObject json = new JSONObject("courses.json");
        List<String> list = new ArrayList<String>();
        JSONArray array = json.getJSONArray("course");
        for (int i = 0; i < array.length(); i++) {
            list.add(array.getJSONObject(i).getString("name"));
        }
        return list;
    }
}
