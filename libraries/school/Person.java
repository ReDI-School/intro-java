import java.util.ArrayList;
import java.util.List;

public class Person {

    public final String name;
    public final String surname;

    private final List<Person> alreadyMet;

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.alreadyMet = new ArrayList<>();
    }

    public String toString() {
        return name + " " + surname;
    }

    public void sayHi() {
        System.out.println(this + ": Hi, my name is " + this);
    }

    public void greet(Person p) {
        if (p == this) {
            System.out.println(this + ": I can't greet myself!");
        }
        else if (! hasAlreadyMet(p)) {
            System.out.println(this + ": Good morning " + p.name);
            alreadyMet.add(p);
        }
        else {
            System.out.println(this + ": I've already met " + p.name);
        }
    }

    public boolean hasAlreadyMet(Person p) {
        return alreadyMet.contains(p);
    }
}
