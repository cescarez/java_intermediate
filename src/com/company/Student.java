package com.company;

import java.util.List;

public class Student {
    String name;
    double gpa;
    List<String> courses;

    public Student(String name, double gpa, List<String> courses) {
        this.name = name;
        this.gpa = gpa;
        this.courses = courses;
    }

    String getName() { return name; }
    double getGpa() { return this.gpa; }
}
