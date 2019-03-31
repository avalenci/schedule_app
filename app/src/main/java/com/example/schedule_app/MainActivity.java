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
    public static final String EXTRA_MESSAGE = "com.example.schedule_app.MESSAGE";
    /** Check if this device has a camera */

    //Use this to test methods
    public void newSchedule(View view) {
        Intent intent = new Intent(this, StartSchedule.class);
        String message = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /** A safe way to get an instance of the Camera object. */

}
