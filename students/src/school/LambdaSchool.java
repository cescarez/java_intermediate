package school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Criterion<E> {
    boolean test(E s);
}

public class LambdaSchool {
    public static <E> void showAll(List<E> roster) {
        for (E s : roster) {
            System.out.println("> " + s);
        }
    }

    public static <E> List<E> getByCriterion(List<E> roster, Criterion<E> crit) {
        List<E> res = new ArrayList<>();
        for (E s : roster) {
            if (crit.test(s)) {
                res.add(s);
            }
        }
        return Collections.unmodifiableList(res);
    }

    public static void main(String[] args) {
        List<Student> roster = List.of(
                Student.of("Fred", 3.2, "Math", "Physics"),
                Student.of("Jim", 2.8, "Journalism"),
                Student.of("Sheila", 3.9, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
        );

        // Use showAll and getByCriterion with lambda expressions to show:

        System.out.println("-----------------------------");
        // less-smart students gpa < 3.5
        showAll(getByCriterion(roster, (student) -> {
            return (student.getGpa() < 3.5); //left as a non-expression lambda for comparison
        }));
        System.out.println("-----------------------------");
        // students with names shorter than 4 characters
        showAll(getByCriterion(roster, (student) -> student.getName().length() < 4));
        System.out.println("-----------------------------");
        // students with more than 3 courses
        showAll(getByCriterion(roster, (student) -> student.getCourses().size() > 3));
        System.out.println("-----------------------------");
    }
}