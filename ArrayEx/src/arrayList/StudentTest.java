package arrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 90);

        Student studentKang = new Student(1002, "Kang");
        studentKang.addSubject("국어", 90);
        studentKang.addSubject("수학", 100);

        studentLee.showStudentInfo();
        System.out.println("=====================");
        studentKang.showStudentInfo();
    }
}
