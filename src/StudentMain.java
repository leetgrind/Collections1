import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("ZAB", 5));
        students.add(new Student("IBC", 10));
        students.add(new Student("CA", 3));

        //Collections.sort(students, new StudentNameComparator());
        Collections.sort(students, Student.GradeCompLambda);

        Collections.sort(students, ((o1, o2) -> o1.getGrade() - o2.getGrade()));

        for (var student: students) {
            System.out.println(student.getName() + " " + student.getGrade());
        }
    }
}
