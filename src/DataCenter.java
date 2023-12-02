import java.util.ArrayList;
import java.util.List;

public class DataCenter {

    private ArrayList<Student> studentList;
    private ArrayList<Course> courseList;

    public DataCenter() {
        this.studentList = new ArrayList<Student>();
        this.courseList = new ArrayList<Course>();

    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void addStudent(Student student) {
        if(isUniqueUsername(student.getUsername())){
            studentList.add(student);
        }else {
            System.out.println("Username is already taken");
        }
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

    public Course findCourseByCrn(int crn){
        for (Course course: courseList) {
            if (course.getCrn() == crn)
                return course;
        }
        return null;
    }
    public Course findCourseBySubject(String subject){
        for (Course course: courseList) {
            if (course.getSubject().equals(subject))
                return course;
        }
        return null;
    }
    private boolean isUniqueUsername(String enteredUsername){
        for (Student student: studentList) {
            if (student.getUsername().equals(enteredUsername)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataCenter = " + '\n' +
                "studentList: " + '\n' +
                studentList + '\n' +
                "courseList: " +'\n'+ courseList + '\n';
    }
}
