import java.util.*;
import java.util.stream.IntStream;

public class C05RoopPractice {
    public static void main(String[] args) {

        int sum_A = IntStream.rangeClosed(1, 20).filter(x -> x % 2 == 0).sum();


        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
//        숫자 뒤집기
        int number = 1234;

        int result = 0;
        while (number != 0) {
            int temp = number % 10;
            result = result * 10 + temp;
            number /= 10;
        }
        System.out.println(result);

//        최대공약수 구하기
        int a = 24;
        int b = 36;
        int answer = 0;
        int min = a < b ? a : b;

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                answer = i;
            }
        }
        System.out.println("answer = " + answer);
//        최소공배수

        int result1 = answer * (a / answer) * (b / answer);
        System.out.println("result = " + result1);

        int[] myArr = {1, 5, 7, 9, 10};
//        일반 for 문
        for (int i = 0; i < 5; i++) {
            System.out.println(myArr[i]);
        }
        System.out.println("향상된 포문");

//        enhanced for문
        for (int i : myArr) {
            System.out.println(i);
        }

//        일반 for문을 통해 myArr의 값에 10씩 더한 뒤에 출력
        for (int i = 0; i < 5; i++) {
            myArr[i] += 10;
        }
        System.out.println(Arrays.toString(myArr));

        for (int i : myArr) {
            i += 10;
        }
        System.out.println(Arrays.toString(myArr));

//        자바 변수의 유효 범위 : {}
        int num1 = 10;
        if (num1 > 1) {
            int abc = 20;
            num1 = 20;
        }
        System.out.println(num1); // 접근가능
//        System.out.println(abc); // 접근 불가

        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단 입니다.");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }

        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        int[][] matirx = {{1, 2, 3, 4}, {5, 6, 7,}, {8, 9}, {10, 11, 12, 13, 14}};
        System.out.println(Arrays.deepToString(matirx));
        int target = 11;

    /*    roop1:
        for (int i = 0; i < matirx.length; i++) {
            for (int j = 0; j < matirx[i].length; j++) {
                if (matirx[i][j] == target) {
                    System.out.println("i :" + i + " j :" + j);
                    break roop1;
                }
            }
        }
        */
        roop1:
        for (int i = 1; i < 20; i++) {
            int count = 0;
            roop2:
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0) {
                    count ++;
                } else if (count >= 5) {
                    System.out.println(i);
                    break roop1;
                }
            }
        }
    }
}
