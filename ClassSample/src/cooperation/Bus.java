package cooperation;

public class Bus {
    int passengerCount; // 승객 수
    int busNumber;  // 버스 번호
    int money;  // 요금

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    // 승객을 태웠을 때 호출
    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
    }
}
