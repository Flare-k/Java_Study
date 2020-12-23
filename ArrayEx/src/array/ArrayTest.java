package array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] num = new int[] {0, 1, 2};
        // int[] num = new int[3] {0, 1, 2}; 이렇게 쓰면 error!
        // 초기화를 바로 안하면 [3]이라고 명시해줘야 함
        // <가능한 경우>
        // -> int[] num = new int[3]; -> 0으로 초기화
        // -> int[] num = new int[] {1, 2, 3};
        // -> int[] num = {1, 2, 3};

        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

        char[] alphabets = new char[26];
        char ch = 'A';
        for (int i = 0; i < alphabets.length; i++, ch++){
            alphabets[i] = ch;
        }
        for (int i = 0; i < alphabets.length; i++){
            System.out.println(alphabets[i]);
        }
    }
}
