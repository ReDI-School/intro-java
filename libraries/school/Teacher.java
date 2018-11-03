import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {

    private final List<String> homeworkIdeas = new LinkedList<>();

    public Teacher(String name, String surname) {
        super(name, surname);
        homeworkIdeas.add("Sort an array of integers");
        homeworkIdeas.add("Compare two strings");
        homeworkIdeas.add("Study object oriented programming");
        homeworkIdeas.add("Check if two arrays contain the same elements");
    }

    public void assignHomework(Homework hw, Student st) {
        if (st.hasHomeworkAssigned()) {
            System.out.println(this + ": " + st.name + ", please forget your previous homework, do '" + hw.text + "' instead");
        }
        else {
            System.out.println(this + ": " + st.name + ", please do the homework '" + hw.text + "'");
            st.homework = hw;
        }
    }

    public Homework inventNewHomework() {
        String idea = homeworkIdeas.get(0);
        homeworkIdeas.remove(0);
        homeworkIdeas.add(idea);
        System.out.println(this + ": What about '" + idea + "'?");
        return new Homework(idea);
    }
}
