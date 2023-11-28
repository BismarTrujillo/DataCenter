import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        DataCenter dc = new DataCenter();
        dc.addCourse(new Course("CSE148","OOP", 3));
        dc.addCourse(new Course("PHI","philo", 1));
        dc.addCourse(new Course("MAT","su madre", 3));
        dc.addCourse(new Course("GOP","goppo", 1));
        dc.addCourse(new Course("PHY","physics", 2));
        dc.addStudent(new Student("b","a","ab","password4","CSE", new ArrayList<Course>(){{
            add(dc.findCourseByCrn(1000));
            add(dc.findCourseByCrn(1001));
            add(dc.findCourseByCrn(1002));
        }} ));



        dc.findCourseByCrn(1000);

        System.out.println();

    }
}
