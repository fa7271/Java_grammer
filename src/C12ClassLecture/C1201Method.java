package C12ClassLecture;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class C1201Method {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        int total2 = 0;
        for (int i = 10; i <=20 ; i++) {
            total2 += i;
        }

        int sum1 = IntStream.rangeClosed(1, 10).sum();
//        코드의 중복이 발생 >> 코드의 반복을 피하기 위해 특정 기능집합을 별도로 분리

        int total = sumAcc(100,200);
        System.out.println("total = " + total);
//        같은 클래스내의 메서드들 사이에서의 호출은 static 메서드라 할지라도 클래스명 생략가능.
        System.out.println(C1201Method.sumAcc(1,10));

        // 메서드 구성요서 : 매개변수, 반환타입, 접근제어자, 클래스메서드여부(static)
    }

//    void 타입은 : 리턴 타입없는 거스
//    int, String : 리턴타입 명시
    static int sumAcc(int a, int b) {
        int total = 0;
        for (int i = a; i <= b; i++) {
            total += i;
        }
        return total;
    }
}
