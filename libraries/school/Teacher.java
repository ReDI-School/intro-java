package org.redischool.introjava;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * A teacher is a person that teaches Java at the school.
 *
 * Apart from what a person can do, a teacher can invent
 * homework and assign homework to students.
 */
public class Teacher extends Person {

    // This list contains all the homework ideas the teacher has
    private final Queue<String> homeworkIdeas = new ArrayDeque<>();

    /**
     * Construct a new teacher with given name and surname.
     *
     * @param name The name of the teacher.
     * @param surname The surname of the teacher.
     */
    public Teacher(String name, String surname) {
        super(name, surname);
        homeworkIdeas.add("Sort an array of integers");
        homeworkIdeas.add("Compare two strings");
        homeworkIdeas.add("Study object oriented programming");
        homeworkIdeas.add("Check if two arrays contain the same elements");
    }

    /**
     * Assign homework to a student. If the student has already homework assigned,
     * this is discarded and the new one becomes the homework the student has to do next.
     *
     * @param hw The homework to assign.
     * @param st The student to whom to assign homework.
     */
    public void assignHomework(Homework hw, Student st) {
        if (st.hasHomeworkAssigned()) {
            System.out.println(this + ": " + st.name + ", please forget your previous homework, do '" + hw + "' instead");
        }
        else {
            System.out.println(this + ": " + st.name + ", please do the homework '" + hw + "'");
        }
        st.homework = hw;
    }

    /**
     * Invent Java homework for a student. The teacher has a lot of fantasy, but this is
     * not infinite: after some time, he/she will start to reuse ideas he/she already had.
     *
     * @return Newly-invented homework.
     */
    public Homework inventNewHomework() {
        String idea = homeworkIdeas.remove();
        homeworkIdeas.add(idea);
        System.out.println(this + ": What about '" + idea + "'?");
        return new Homework(idea);
    }
}
