package com.example.schedule_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Schedule extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.schedule_app.MESSAGE";

    private static boolean button = false;
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

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
        Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);
        Spinner spinner7 = (Spinner) findViewById(R.id.spinner7);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.hour_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.minute_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.AMPM_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.days_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter2);
        spinner4.setAdapter(adapter2);
        spinner5.setAdapter(adapter3);
        spinner6.setAdapter(adapter3);
        spinner7.setAdapter(adapter4);
    }

    public void newClass(View view) {
        Intent intent = new Intent(this, Table.class);
        startActivity(intent);
    }

    public static void courseLoad() {
        Course newCourse[] = new Course[10];
        int n = 0;
        while (buttonCheck()) {
        }
    }
    private static boolean buttonCheck() {
        return button;
    }
    public void pressButton() {
        button = true;
    }
}
