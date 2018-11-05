package org.redischool.introjava;

import java.util.ArrayList;

// This class is a very basic example of a Java class
// It does not deal with error handling - removing a student that doesn't exist for eg - for simplicity's sake
public class Students {
  
  ArrayList<String> students = new ArrayList<String>();

  public void add(String name) {
    students.add(name);
  }

  public void remove(String name) {
     for(int i = 0; i < students.size(); i++) {
      if(students.get(i).equals(name)) {
        students.remove(i);
      }
    }   
  }

  public void print() {
    for(int i = 0; i < students.size(); i++) {
      System.out.println(students.get(i));
    }
  }

  public int numberOfStudents() {
    return students.size();
  }

}
