package com.example.schedule_app;

import android.content.ClipData;
import android.icu.util.Calendar;

import java.util.List;


public class Course {

    Course(String name) {
        this.name = name;
    }


    private String name;
    private List<Course> courses;

    public boolean conflicts(Course a, Course b) {
        return true;
    }

    private void setName(String _name) {
        this.name = _name;
    }
    public String getName() {
        return name;
    }

}
