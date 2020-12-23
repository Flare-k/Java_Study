package singletonEx;

public class Company {

    private static Company instance = new Company(); // 단 한 개이자, 클래스 내부에서만 사용 가능

    private Company(){}

    public static Company getInstance() {
        if (instance == null)
            instance = new Company();
        return instance;
    }// 객체를 생성하지 않고 메서드를 호출하려면 static으로 해줘야 한다.
}

/*
    Default Constructor를 제공할 것
    private Company(){}로 하면 외부에서 접근할 수 없으므로 클래스 내부에서 생성한다.
 */