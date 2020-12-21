package classpart;

public class Student {
    // 멤버변수 = property = attribute
    int studentID; // 학번
    String studentName; // 이름
    int grade;  //학년
    String address;
    Subject korea;
    Subject math;

    public  Student(){
        korea = new Subject();
        math = new Subject();
    }

    public Student(int id, String name){
        studentID = id;
        studentName = name;

        korea = new Subject();
        math = new Subject();
    }

    public String getStudent(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public void setKorea(String name, int score){
        korea.setSubjectName(name);
        korea.setScore(score);
    }

    public void setMath(String name, int score){
        math.setSubjectName(name);
        math.setScore(score);
    }

    public void showStudentInfo(){
        int total = korea.getScore() + math.getScore();

        System.out.println(studentName + " 학생의 총점: " + total + "점");
    }

/*
    public static void main(String[] args){
        Student s = new Student();
        s.studentID = 1;
        s.studentName = "강연욱";
        s.address = "경기도 화성시";

        s.showStudentInfo();
    }
*/
}
