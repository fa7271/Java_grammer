package C18Thread;

import lombok.Synchronized;

public class Library {
    static int bookcount = 100;

//    public static void borrow() {

//    Synchronized를 통해 해당 메서드에 한해서는 lock을 걸도록 설정.
    public synchronized static void borrow() {
        if (bookcount > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            bookcount -= 1;
            System.out.println("대출 완료");
            System.out.println("남아 있는 책 수량 : " + bookcount);
        } else {
            System.out.println("대출 불가");
        }
    }
}
