package arrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        // ArrayList는 인덱스를 제공하지 않는다.
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");

        for (String s : list) {
            System.out.println(s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
