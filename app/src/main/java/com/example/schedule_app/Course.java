package com.example.schedule_app;

import android.icu.util.Calendar;


public class Course {

    public Course(String name, String Date) {
        name = getName();
    }

    private String name;

    private void setName(String _name) {
        this.name = _name;
    }
    private String getName() {
        return name;
    }



}
