import java.util.Comparator;

public class Student{

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static Comparator<Student> GradeComp = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.grade - o2.getGrade();
        }
    };

    public static Comparator<Student> GradeCompLambda = (o1, o2) -> o1.getGrade() - o2.getGrade();
}
