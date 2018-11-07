package org.redischool.introjava;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a person, with a given name and surname.
 *
 * Persons can present themselves.
 * Persons are polite so they can greet each other,
 * although greeting someone more than once a day sounds strange.
 * Persons keep in mind who they've already greeted and who haven't.
 */
public class Person {

    /** The name of the person. */
    public final String name;

    /** The surname of the person. */
    public final String surname;

    // In this collection a person remember who he/she has already met and greeted.
    private final List<Person> alreadyMet;

    /**
     * Construct a new person with given name and surname.
     *
     * @param name The name of the person.
     * @param surname The surname of the person.
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.alreadyMet = new ArrayList<>();
    }

    public String toString() {
        return name + " " + surname;
    }

    /**
     * Say "Hi" and present him/herself.
     */
    public void sayHi() {
        System.out.println(this + ": Hi, my name is " + this);
    }

    /**
     * Meet and greet another person.
     *
     * @param other The other person greeted.
     */
    public void greet(Person other) {
        if (other == this) {
            System.out.println(this + ": I can't greet myself!");
        }
        else if (! hasAlreadyMet(other)) {
            System.out.println(this + ": Good morning " + other.name);
            alreadyMet.add(other);
        }
        else {
            System.out.println(this + ": I've already met " + other.name);
        }
    }

    /**
     * Check if he/she has already met another person.
     *
     * @param other The other person to check.
     * @return Whether the other person has been already met.
     */
    public boolean hasAlreadyMet(Person other) {
        return alreadyMet.contains(other);
    }
}
