package C16EtcClass;

public class C1601Math {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double randomValue = Math.random();
            System.out.println((int)(randomValue * 100));
        }
//        abs()메소드 : 절대값 반환
        System.out.println(Math.abs(-5));

//        floor() 소수점 내리, ceil 소수점 올리, round 소수점 반올림.
        System.out.println(Math.floor(5.7));
        System.out.println(Math.ceil(5.7));
        System.out.println(Math.round(5.7));

//        max, min
        System.out.println(Math.max(5,7));
        System.out.println(Math.min(5,7));

//        pow(a, b): 제곱 연산 수행 a의 b제곱
        System.out.println(Math.pow(5, 2));
//        sqrt(): 제곱근 연산
        System.out.println(Math.sqrt(25));
//        1~n 개 숫자중 소수의 갯수를 구하라.
        int n = 100;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("노 소수");
            }
        }
    }
}
