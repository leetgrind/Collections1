import java.util.Comparator;

public class StudentGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // return 0 means equal
        // negative number o1 < o2
        // positive number o1 > o2
        return o1.getGrade() - o2.getGrade();
    }
}
