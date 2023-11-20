public class Student extends User {

    private int id;
    private String major;
    private List<Courses> courses;


    public Student(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, username, password);
    }
}
