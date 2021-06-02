package com.company;

import java.util.Random;
import org.apache.commons.lang.ArrayUtils;

public class MakeRoster {
    String[] studentNames = {"Charlie BitMyFinger, Garfield TheCat, Peppermint Patty", "Steven Universe"};
    double[] gpas = {1.2, 3.8, 3.5, 3.6};
    String[] allCourses = {"Algebra", "Biology", "Chemistry", "Badminton", "Journalism", "World History", "Ceramics"};

    Roster thisRoster;

    public MakeRoster() {
        buildRoster();
    }

    Roster buildRoster() {
        for (int i = 0; i < studentNames.length; i++) {
            String[] courses = {};
            for(int j = 0; j < 3; j++) {
                Random rand = new Random();
                int randomIndex = rand.nextInt(allCourses.length);
                ArrayUtils.add(courses, allCourses[randomIndex]);
            }
            Student newStudent = new Student(studentNames[i], gpas[i], courses);
            thisRoster.addStudent(newStudent);
        }
    }
}
