package com.example.schedule_app;

import android.icu.util.Calendar;


public class Course {

    private String name;
    private Calendar startDate;
    private Calendar endDate;

    public boolean conflicts(Course a, Course b) {
        return true;
    }

    private void setName(String _name) {
        this.name = _name;
    }
    private String getName() {
        return name;
    }
}
