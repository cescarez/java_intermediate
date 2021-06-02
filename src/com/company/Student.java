package com.company;

public class Student {
    String name;
    double gpa;
    String[] courses;

    public Student(String name, double gpa, String[] courses) {
        this.name = name;
        this.gpa = gpa;
        this.courses = courses;
    }

    String getName() { return name; }
    double getGpa() { return this.gpa; }
}
