package hiding;

class BirthDay {
    public int day;
    public int month;
    public int year;
}

public class BirthDayTest{
    public static void main(String[] args){
        BirthDay day = new BirthDay();

        day.month = 5;
        day.year = 2020;
        day.day = 29;
    }
}
// 하나의 파일안에 클래스가 여러 개일수도 있다.