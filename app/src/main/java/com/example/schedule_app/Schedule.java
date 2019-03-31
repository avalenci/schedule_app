package com.example.schedule_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Schedule extends AppCompatActivity {

    public boolean button = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(StartSchedule.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);
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
