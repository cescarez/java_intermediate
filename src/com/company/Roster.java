package com.company;

import java.util.ArrayList;

public class Roster {
  ArrayList<Student> roster;

  public Roster() {
    this.roster = new ArrayList<>();
  }
  public Roster(ArrayList<Student> roster) {
    this.roster = roster;
  }

  void addStudent(Student newStudent) {
    this.roster.add(newStudent);
  }

  void printRoster() {
    for(Student student : roster) {
      System.out.println(student.getName());
    }
  }

  ArrayList<Student> getTopStudents() {
    ArrayList<Student> topStudents = new ArrayList<>();
    for(Student student : roster) {
      if (student.getGpa() >= 3.5){
        topStudents.add(student);
      }
    }
    return topStudents;
  }
}
