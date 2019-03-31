package com.example.schedule_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;

//adapter to convert Java object to View
public class CourseAdapter extends ArrayAdapter<Course> {
    public CourseAdapter(@NonNull Context context, ArrayList<Course> courses) {
        super(context, 0, courses);
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        Course course = getItem(pos);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_table, parent, false);

        }
        TextView viewName = (TextView) convertView.findViewById(R.id.textView5);

        return convertView;
    }
}