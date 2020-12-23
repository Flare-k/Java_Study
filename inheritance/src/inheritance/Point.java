package inheritance;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

/*
    합성과 상속은 다른 것이다.
    위 클래스가 필요하다면 특정 클래스에서 객체를 생성하여 사용하면 되는 것이지 해당 클래스가 필요하다고 상속의 관계를 나타내야 하는 것은 X
    합성 = 'has - a' 관계
    상속 = 'is - a' 관계
 */