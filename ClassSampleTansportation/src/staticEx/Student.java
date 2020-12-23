package staticEx;

public class Student {
    private static int serialNum = 10000;
    /*
        static 변수는 인스턴스가 생성될 때마다 다른 메모리를 가지는 것이
        아니라 프로그램이 메모리에 적재(load)될때 데이터 영역의 메모리에
        생성된다. -> 클래스 변수라고도 한다. 클래스 내의 전역변수 느낌
     */
    private int studentID;
    private String studentName;

    public Student(){
        serialNum++;
        studentID += serialNum;
    }

    public int getStudentID() {
        return studentID;
    }
    /*
    static method에서는 Instance Variable을 쓸 수 없다.
    즉, studentID, studentName을 쓸 수 없다. 생성되지 않은 인스턴스의 변수를 사용하는 꼴이므로..
    static 변수를 사용하는 것은 상관없다.
     */
}
