import java.util.List;

public class DataCenter {

    private List<Student> studentList;
    private List<Course> courseList;

    public DataCenter(List<Student> studentList, List<Course> courseList) {
        this.studentList = studentList;
        this.courseList = courseList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public boolean validLogin(String enteredUsername, String enteredPassword){
        for (Student student: studentList) {
            if (student.getUsername().equals(enteredUsername) && student.getPassword().equals(enteredPassword)) {
                return true;
            }
        }
        return false;
    }
    public void addCourse(Course course) {
        courseList.add(course);
    }
}
