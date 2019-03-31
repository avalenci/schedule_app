package com.example.schedule_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class StartSchedule extends AppCompatActivity {

    private boolean button = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        for(int i=0; i<3; i++) {

        }
    }
    public static void courseLoad() {
        Course newCourse[] = new Course[10];
        boolean go = true;
//        while (go) {
//
//        }
    }
    public boolean buttonCheck() {
        return true;
    }
    public void pressButton() {
        button = true;
    }
}