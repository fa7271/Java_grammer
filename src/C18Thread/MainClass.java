package C18Thread;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass {
    public static void main(String[] args) {
//        상속방식으로 스레드 생성
        Thread etc1 = new ExtendsThreadClass();
        etc1.start();
        Thread etc2 = new ExtendsThreadClass();
        etc2.start();
        Thread etc3 = new ExtendsThreadClass();
        etc3.start();

        System.out.println("-------------");
//        Thread 실행시 순차적으로 실행되지 않음에 유의

//        Thread 생성자로 Runnable 객체를 주입하는 방식.
//        Thread 클래스에 Runnable객체가 전달되어 사용자가 정의 run 메서드가 실행

        new Thread(new RunnableImplementsClass()).start();
        new Thread(() -> System.out.println("익명객체 스레드 :")).start();

//        thread 의 동시성 이슈 테스트
//        단일 스레드 일반 호출
        for (int i = 0; i < 1000; i++) {
            Library.borrow();
        }

        for (int i = 0; i < 1000; i++) {
            Thread th = new Thread(() -> Library.borrow());
            th.start();
 /*           try {
                th.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
 */       }
        System.out.println("남은 책: " + Library.bookcount);
    }
}