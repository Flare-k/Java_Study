package hiding;

class BirthDay {
    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        this.day = day; // 자기 자신의 인스턴스 메모리를 가리킴
    }
    /*
    this ?
        1) 자신의 메모리를 가리킴
        2) 생성자에서 다른 생성자 호출
        -> Example
        public Person(){
            this("이름없음", 1);
        }
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        3) 자신의 주소 반환
    */

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}

public class BirthDayTest{
    public static void main(String[] args){
        BirthDay day = new BirthDay();

        day.setMonth(5);
        day.setYear(2020);
        day.setDay(29);
        System.out.println(day.getYear() + "년 " + day.getMonth() + "월 " + day.getDay() + "일");
    }
}
// 하나의 파일안에 클래스가 여러 개일수도 있다.