package com.company;
import java.util.HashMap;
import java.util.Map;

//flyweight design pattern
public class Course {
    private static Map<String, Course> allCourses = new HashMap<>();
    private final String courseName; //pooled shared objects should be immutable

    private Course(String courseName) { this.courseName = courseName; }

    public static Course of(String courseName) {
        if(!isValid(courseName)) throw new IllegalArgumentException("Invalid course name input");
        Course foundCourse = allCourses.get(courseName);
        if (foundCourse != null) {
            return foundCourse;
        } else {
            Course newCourse = new Course(courseName);
            allCourses.put(courseName, newCourse);
            return newCourse;
        }
    }

    public static boolean isValid(String courseName) {
        return courseName != null && !courseName.isBlank();
    }
}
