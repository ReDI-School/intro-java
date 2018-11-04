/**
 * This is an example class for the introduction to Objects lesson.
 *
 * This class allows you to add and delete students by name. And print all the student names and return the number of students.
 *
 * This class doesn't deal with duplicate student names, nor does it deal with deleting a student that doesn't exist. 
 * 
 * It's simply to show an example of a class.
 **/

package com.newfivefour;

import java.util.ArrayList;

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
