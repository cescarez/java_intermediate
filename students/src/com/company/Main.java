package com.company;

public class Main {

    public static void main(String[] args) {
        MakeRoster myClass = new MakeRoster();
//        myClass.thisRoster.printRoster();

        System.out.println("Top Students:");
        Roster topStudents = new Roster(myClass.thisRoster.getTopStudents());
        topStudents.printRoster();
    }
}
