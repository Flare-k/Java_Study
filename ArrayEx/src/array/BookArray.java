package array;

public class BookArray {
    public static void main(String[] args){
        Book[] lib = new Book[5];

        lib[0] = new Book("태백산맥", "조정래");
        lib[1] = new Book("데미안", "헤르만 헤세");
        lib[2] = new Book("어떻게 살 것인", "유시민");
        lib[3] = new Book("토지", "박경리");
        lib[4] = new Book("어린왕자", "생텍쥐페리");

        for (int i = 0; i < lib.length; i++){
            lib[i].showBookInfo();
        }
        /*
        배열 복사하기
        System.arraycopy(src, srcPos, dest, destPos, length);
        src = 복사할 배열 이름
        srcPos = 복사할 배열의 첫번째 위치
        dest = 복사해서 붙여 넣을 대상 배열 이름
        destPos = 복사해서 대상 배열에 붙여 넣기를 시작할 첫번째 위치
        length = src에서 dest로 자료를 복사할 요소 개수
         */
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2  = {1, 2, 3, 4, 5};

        System.arraycopy(arr1, 0, arr2, 1, 4);
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}
