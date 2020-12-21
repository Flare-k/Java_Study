package test;

import java.util.Vector;

public class Test {
    public  static void main(String[] args){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        Vector<Integer> v = new Vector<Integer>();
        v.add(3);
        v.add(33);
        v.add(333);
        for (int i = 0; i < v.size(); i++){
            System.out.println(v.elementAt(i));
        }
    }
}
