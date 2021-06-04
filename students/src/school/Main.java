package school;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MakeRoster myClass = new MakeRoster();
//        myClass.thisRoster.printRoster();

        System.out.println("Top Students:");
        Roster topStudents = new Roster(myClass.thisRoster.getTopStudents());
        topStudents.printRoster();

        List<Student> mutableStudentList = new ArrayList<>();
        mutableStudentList.add(Student.of("Jim", 2.8, "Journalism"));
        mutableStudentList.add(Student.of("Fred", 3.2, "Math", "Physics"));
        mutableStudentList.add(Student.of("Sheila", 3.9, "Math", "Physics", "Astrophysics", "Quantum Mechanics"));

        mutableStudentList.sort((student1, student2) -> {
            int student1NameAscii = (int) student1.getName().charAt(0);
            int student2NameAscii = (int) student2.getName().charAt(0);
            if (student1NameAscii == student2NameAscii) {
                return 0;
            } else if (student1NameAscii < student2NameAscii) {
                return -1;
            } else {
                return 1;
            }
        });

        System.out.println("all students (Jim, Fred, and Sheila--------------------------------");
        mutableStudentList.stream()
            .forEach(System.out::println);

        System.out.println("student names only--------------------------------");
        mutableStudentList.stream()
            .map(Student::getName)
            .forEach(System.out::println);

        System.out.println("student names and current grade--------------------------------");
        mutableStudentList.stream()
            .map(student -> student.getName() + ": " + student.getGpa())
            .forEach(System.out::println);

        System.out.println("student names and current course count--------------------------------");
        mutableStudentList.stream()
            .map(student -> student.getName() + ": " + student.getCourses().size())
            .forEach(System.out::println);

        System.out.println("all courses (nonunique)-------------------------------");
        mutableStudentList.stream()
            .flatMap(student -> student.getCourses().stream())
            .forEach(System.out::println);

        System.out.println("all courses with GPA > 3-------------------------------");
        mutableStudentList.stream()
                .filter(student -> student.getGpa() > 3)
                .flatMap(student -> student.getCourses().stream())
                .forEach(System.out::println);

        System.out.println("'name takes course' for all student/course pairs-------------------------------");
        mutableStudentList.stream()
                .flatMap(student -> student.getCourses().stream()
                        .map(course -> student.getName() + " takes " + course))
                .forEach(System.out::println);

        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");
//        System.out.println("top students--------------------------------");
//        mutableStudentList.stream()
//            .filter(student -> student.getGpa() >= 3.5)
//            .forEach(System.out::println);
//
//        System.out.println("enthusiastic students--------------------------------");
//        mutableStudentList.stream()
//            .filter(student -> student.getCourses().size() > 3)
//            .forEach(System.out::println);
    }
}
