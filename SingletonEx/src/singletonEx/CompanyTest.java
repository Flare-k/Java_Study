package singletonEx;

public class CompanyTest {
    public static void main(String[] args) {
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        System.out.println(c1);
        System.out.println(c2);
    }
}
/*
    Singleton Pattern: 객체가 단 하나만 생성될 수 있게 하자
 */