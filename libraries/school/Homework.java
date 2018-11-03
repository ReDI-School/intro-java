/**
 * Homework that teachers assign to students.
 */
public class Homework {

    /** The text of the homework. */
    public final String text;

    /**
     * Construct new homework with a given text.
     *
     * @param text The text of the homework.
     */
    public Homework(String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}
