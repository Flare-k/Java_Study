package cooperation;

public class Subway {
    int lineNumber;  // 지하철 번호
    int passengerCount; // 승객 수
    int money;  // 요금

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }
    // 승객을 태웠을 때 호출

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println("지하철 " + lineNumber + "호선의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
    }
}
