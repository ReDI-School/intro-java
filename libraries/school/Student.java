public class Student extends Person {

    protected Homework homework = null;

    public Student(String name, String surname) {
        super(name, surname);
    }

    public boolean hasHomeworkAssigned() {
        return homework != null;
    }

    public Homework getHomework() {
        if (hasHomeworkAssigned()) {
            return homework;
        }
        else {
            throw new RuntimeException(this + " doesn't have any homework assigned!");
        }
    }

    public void doHomework() {
        if (hasHomeworkAssigned()) {
            System.out.println(this + ": doing my homework '" + homework.text +"'");
        }
        else {
            System.out.println(this + ": I have no homework assigned");
        }
    }
}
