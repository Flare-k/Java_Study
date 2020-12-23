package array;

public class ObjectCopy {
    public static void main(String[] args) {
        /*
        객체 배열 복사
         */
        Book[] book1 = new Book[3];
        Book[] book2 = new Book[3];

        book1[0] = new Book("태백산맥", "조정래");
        book1[1] = new Book("데미안", "헤르만 헤세");
        book1[2] = new Book("어떻게 살 것인", "유시민");

        System.arraycopy(book1, 0, book2, 0, 3);
        // 주소가 복사.. 즉, 얕은 복사가 되게 된다.
        // 따라서 book1의 값을 이후에 변경하게 되면 book2도 같은 주소를 복사했으므로 같은 변경이 일어난다.
        System.out.println("==========Shallow Copy book2==========");
        for (Book b : book2){
            b.showBookInfo();
        }

        System.out.println("==========book1==========");
        book1[0].setBookName("나목");
        book1[0].setAuthor("박완서");
        for (Book b : book1){
            b.showBookInfo();
        }

        System.out.println("==========book2==========");
        for (Book b : book2){
            b.showBookInfo();
        }

        // 복사를 한 객체와 따로 관리하고 싶다면?? -> 깊은 복사가 필요하다.
        book2[0] = new Book();
        book2[1] = new Book();
        book2[2] = new Book();

        for (int i = 0; i < book1.length; i++) {
            book2[i].setBookName(book1[i].getBookName());
            book2[i].setAuthor(book1[i].getAuthor());
        }

        System.out.println("==========DeepCopy book2==========");
        for (int i = 0; i < book2.length; i++) {
            book2[i].showBookInfo();
        }

        System.out.println("==========book1==========");
        book1[0].setBookName("어린왕자");
        book1[0].setAuthor("생텍쥐페리");
        for (Book b : book1){
            b.showBookInfo();
        }

        System.out.println("==========book2==========");
        for (Book b : book2){
            b.showBookInfo();
        }
    }
}
