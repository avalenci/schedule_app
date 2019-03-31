package com.example.schedule_app;

import java.io.IOException;
import java.util.List;


public class Course {

    private int mtime1 = 0;
    private int hour1;
    private int minute1;
    private int hour2;
    private int minute2;
    private String AMPM1;
    private String AMPM2;
    private String days;

    Course() {
        name = "";
    }
    Course(String name, int hour1, int minute1, int hour2, int minute2, String AMPM1, String AMPM2, String days) {
        this.name = name;
        this.hour1 = hour1;
        this.hour2 = hour2;
        this.minute1 = minute1;
        this.minute2 = minute2;
        this.AMPM1 = AMPM1;
        this.AMPM2 = AMPM2;
        this.days = days;
    }

    @Override
    public String toString() {
        return getName() + "\n"
                + hour1 + ":" + minute1 + AMPM1 + " - "
                + hour2 + ":" + minute2 + AMPM2 + "\n";
    }
    private String name;
    private List<Course> courses;

    public boolean conflicts(Course a, Course b) {
        return true;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
