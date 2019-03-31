package com.example.schedule_app;

import java.sql.Time;
import java.util.Timer;

public class Course {

    private String name;


    private String setName(String _name) {
        this.name = _name;
        return _name;
    }
    private String getName() {
        return name;
    }

}
