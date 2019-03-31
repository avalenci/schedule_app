package com.example.schedule_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

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

}
