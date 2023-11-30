import java.util.ArrayList;
import java.util.List;

public class Student extends User {

    private int studentId;
    private String major;
    private List<Course> courses;
    private static int studentBaseId = 1;

    public Student(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, username, password);
        this.courses = new ArrayList<>();
        major = "Undefined";
        studentId = studentBaseId++;
    }

    public Student(String firstName, String lastName, String username, String password, String major, List<Course> courses) {
        super(firstName, lastName, username, password);
        this.major = major;
        this.courses = courses;
        studentId = studentBaseId++;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    public void enrollCourse(Course course) {
        this.courses.add(course);
    }

    @Override
    public String toString() {
        return "Student " + '\n'+
                "   studentId = " + studentId + '\n' +
                "   major = '" + major + '\n' +
                "   courses = " + '\n' + courses;
    }
}
