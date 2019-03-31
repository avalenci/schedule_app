package com.example.schedule_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Schedule extends AppCompatActivity {

    Spinner spinner;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;
    Spinner spinner6;
    Spinner spinner7;

    // Create an ArrayAdapter using the string array and a default spinner layout
    ArrayAdapter<CharSequence> adapter;
    ArrayAdapter<CharSequence> adapter2;
    ArrayAdapter<CharSequence> adapter3;
    ArrayAdapter<CharSequence> adapter4;
    public static final String EXTRA_MESSAGE = "com.example.schedule_app.MESSAGE";

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

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner5 = (Spinner) findViewById(R.id.spinner5);
        spinner6 = (Spinner) findViewById(R.id.spinner6);
        spinner7 = (Spinner) findViewById(R.id.spinner7);

        // Create an ArrayAdapter using the string array and a default spinner layout
        adapter = ArrayAdapter.createFromResource(this,
                R.array.hour_array, android.R.layout.simple_spinner_item);
        adapter2 = ArrayAdapter.createFromResource(this,
                R.array.minute_array, android.R.layout.simple_spinner_item);
        adapter3 = ArrayAdapter.createFromResource(this,
                R.array.AMPM_array, android.R.layout.simple_spinner_item);
        adapter4 = ArrayAdapter.createFromResource(this,
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
        EditText editText = (EditText) findViewById(R.id.editText2);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void writeFile() throws IOException {
        FileWriter filewriter = new FileWriter("Courses");
        PrintWriter printwriter = new PrintWriter(filewriter);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String name = editText.getText().toString();
        int hour1 = Integer.parseInt(spinner.getSelectedItem().toString());
        int hour2 = Integer.parseInt(spinner2.getSelectedItem().toString());
        int minute1 = Integer.parseInt(spinner3.getSelectedItem().toString());
        int minute2 = Integer.parseInt(spinner4.getSelectedItem().toString());
        String AMPM1 = spinner5.getSelectedItem().toString();
        String AMPM2 = spinner6.getSelectedItem().toString();
        String days = spinner7.getSelectedItem().toString();
        printwriter.write(name + " " + hour1 + " " + minute1 + " " + hour2 + " " + minute2
                + " " + AMPM1 + " " + AMPM2 + " " + days);
        printwriter.close();
    }

}
