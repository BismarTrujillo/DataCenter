import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Course course1 = new Course("CSE","su madre", 3);
        Course course2 = new Course("CSE","su madre", 3);
        List<Course> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);

        Student s1 = new Student("b","t","tb","password", courseList);
        Student s2 = new Student("q","w","wq","password1", courseList);
//        List<Student> sList = new ArrayList<>();
//        sList.add(s1);
//        sList.add(s2);


        DataCenter dc = new DataCenter();

        dc.addStudent(s1);
        dc.addStudent(s2);
        dc.addStudent(new Student("b","a","ab","password4", new ArrayList<Course>() ));
        dc.addCourse(course1);
        dc.addCourse(course2);
        dc.addCourse(new Course("CSE148","OOP", 3));
        System.out.println(dc);

    }
}
