package classpart;

public class StudentTest {
    public static void main(String[] args){
        // 클래스를 사용하려면 new를 반드시 사용해야 한다.
        // 클래스형 변수이름 = new 생성자;
        Student s = new Student(2017110267, "강연욱");
        // 객체 자체는 스택에 생성, 주소는 힙 메모리에 생성
        // Garbage Collector 가 쓰지 않는 메모리를 수거한다.
        s.setKorea("국어", 100);
        s.setMath("수학", 100);
        s.showStudentInfo();

        Student ss = new Student(2017110268, "홍길동");
        ss.setKorea("국어", 100);
        ss.setMath("수학", 100);
        ss.showStudentInfo();

    }
}
