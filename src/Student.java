import java.util.List;

public class Student extends User {

    private int id;
    private String major;
    private List<Course> courses; //SELECTED OR COMPLETED
    private static int base = 1;

    public Student(String firstName, String lastName, String username, String password, List<Course> courses) {
        super(firstName, lastName, username, password);
        this.courses = courses;
        major = "Undefined";
        id = base++;
    }

    public Student(String firstName, String lastName, String username, String password, String major, List<Course> courses) {
        super(firstName, lastName, username, password);
        this.major = major;
        this.courses = courses;
        id = base++;
    }
}
