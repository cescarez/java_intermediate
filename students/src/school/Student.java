package school;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Student {
    private String name;
    private double gpa;
    private List<String> courses;
    private static Map<String, Student> studentPool = new HashMap<>();

    //best practice is to make the below private
    public Student(String name, double gpa, List<String> courses) {
        if (!isValid(name, gpa)) throw new IllegalArgumentException("Bad data for Student");
        this.name = name;
        this.gpa = gpa;
        this.courses = courses;
    }

    public static Student of(String name, double gpa, String ... courses) {
        Student foundStudent = studentPool.get(name);
        if (foundStudent == null) {
            return new Student(name, gpa, List.of(courses)); // Java 9, "truly" unmodifiable list
        } else {
            return foundStudent;
        }
    }

    public static boolean isValid(String name, double gpa) {
        return name != null && !name.isBlank() && gpa >= 0 && gpa < 5;
    }

    public String getName() { return name; }
    public double getGpa() { return gpa; }
    public List<String> getCourses() { return courses; }
    public static Student getStudent(String studentName) {
        Student foundStudent = studentPool.get(studentName);
        if (foundStudent != null) {
            return foundStudent;
        } else {
            return null;
        }
    };


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", courses=" + courses +
                '}';
    }
}
