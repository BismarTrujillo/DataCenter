import java.util.ArrayList;
import java.util.List;

public class DataCenter {

    private List<Student> studentList;
    private List<Course> courseList;

    public DataCenter() {
        this.studentList = new ArrayList<Student>();
        this.courseList = new ArrayList<Course>();

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
    public void addCourse(Course course) {
        courseList.add(course);
    }

    public boolean validLogin(String enteredUsername, String enteredPassword){
        for (Student student: studentList) {
            if (student.getUsername().equals(enteredUsername) && student.getPassword().equals(enteredPassword)) {
                return true;
            }
        }
        return false;
    }

    public Student findStudentById(int studentId){
        for (Student student: studentList) {
            if (student.getStudentId() == studentId)
                return student;
        }
        return null;
    }

    public List<Student> findStudentByName(String firstName, String lastName){
        List<Student> resultList = new ArrayList<>();
        for (Student student: studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName))
                resultList.add(student);
        }
        return resultList;
    }
    public Course findCourseByCrn(int crn){
        for (Course course: courseList) {
            if (course.getCrn() == crn)
                return course;
        }
        return null;
    }

    @Override
    public String toString() {
        return "DataCenter = " + '\n' +
                "studentList: " + '\n' +
                studentList + '\n' +
                "courseList: " +'\n'+ courseList + '\n';
    }
}
