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
        mutableStudentList.add(null);
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
    }
}
