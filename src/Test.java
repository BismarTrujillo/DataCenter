import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        DataCenter dc = new DataCenter();

        //Creating and Adding Courses
        dc.addCourse(new Course("CSE148","OOP", 3));
        dc.addCourse(new Course("PHI","philo", 1));
        dc.addCourse(new Course("MAT","su madre", 3));
        dc.addCourse(new Course("GOP","goppo", 1));
        dc.addCourse(new Course("PHY","physics", 2));



        dc.addStudent(new Student("qq","www","abd","password4"));
        //Register student
        System.out.println("Registtring Student");
        dc.addStudent(new Student("x","z","abc","password4","CSE", new ArrayList<Course>(){{
            add(dc.findCourseByCrn(1000));
            add(dc.findCourseByCrn(1001));
            add(dc.findCourseByCrn(1002));
        }} ));

        dc.addStudent(new Student("b","a","ab","password4","CSE", new ArrayList<Course>(){{
            add(dc.findCourseByCrn(1000));
            add(dc.findCourseByCrn(1001));
            add(dc.findCourseByCrn(1002));
        }} ));

        //Login to DataCenter
        System.out.println(dc.validLogin("abd","password4"));

        //Get student information
        dc.findStudentById(1).getCourses().add(dc.findCourseByCrn(1001));

        //Get course information
        System.out.println(dc.findCourseByCrn(1000));

        //Get list of students
        System.out.println(dc.getStudentList());

        //Get list of courses
        System.out.println(dc.getCourseList());

        //Select a course to enroll in
        dc.findStudentById(3).enrollCourse(dc.findCourseByCrn(1001));
        dc.findStudentById(3).enrollCourse(dc.findCourseByCrn(1000));
        System.out.println("student 3" + dc.findStudentById(3));

    }
}



