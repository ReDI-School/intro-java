/**
 * A student is a person that learns Java at the school.
 *
 * Apart from what a person can do, a student can do homework
 * teachers assign to him/her.
 */
public class Student extends Person {

    // This is the homework currently assigned to the student.
    protected Homework homework = null;

    /**
     * Construct a new student with given name and surname.
     *
     * @param name The name of the student.
     * @param surname The surname of the student.
     */
    public Student(String name, String surname) {
        super(name, surname);
    }

    /**
     * Check if the student has already homework assigned.
     *
     * @return If the student has homework assigned.
     */
    public boolean hasHomeworkAssigned() {
        return homework != null;
    }

    /**
     * Get the homework currently assigned to the student. If no homework
     * is assigned yet and this method is invoked, an exception is generated.
     *
     * @return The homework currently assigned to the student.
     */
    public Homework getHomework() {
        if (hasHomeworkAssigned()) {
            return homework;
        }
        else {
            throw new RuntimeException(this + " doesn't have homework assigned!");
        }
    }

    /**
     * Do the homework.
     *
     * After doing the homework, the student doesn't have any other homework to do,
     * until a teacher assign him/her new homework. If no homework is assigned
     * yet to the student, this method does nothing.
     */
    public void doHomework() {
        if (hasHomeworkAssigned()) {
            System.out.println(this + ": doing my homework '" + homework + "' ...");
            System.out.println(this + ": ... done!");
        }
        else {
            System.out.println(this + ": I have no homework assigned");
        }
        homework = null;
    }
}
