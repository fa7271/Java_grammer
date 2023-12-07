import java.math.BigDecimal;
import java.sql.Array;

public class C02Variable {

    public static void main(String[] args) {
//        byte 의 범위 -128 ~ 127 그 이상이하 일때는 오버/언더 플로우 발생.
        byte num1 = 127;
        byte num2 = -128;
        num1 ++;
        num2 -= 1;
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);

//        float 는 소수 부분 6자리 까지 오차 없이 표현할 수 있음
//        double 은 소수 부분 15자리 까지 오차 없이 표현할 수 있다.
        float f1 = 1.2345564237f;
        double b1 =1.2345564237f;

//        System.out.println("b1 = " + b1);
//        System.out.println("f1 = " + f1);

//        부동소수점 오차 테스트
        double double_num =0.1;
//        System.out.println("double_num = " + double_num);

        double res = 0;
        for (int i = 0; i < 1000; i++) {
            res += double_num * 10;
        }
//        System.out.println("res = " + res/10);

        //BigDecimal // 저장할때는 문자열 -> 연산할때는 정수로 변환 -> 최종결과는 실수로 반환

        BigDecimal bd1 = new BigDecimal("1.03");
        BigDecimal bd2 = new BigDecimal("0.42");

        double v = bd1.add(bd2).doubleValue();
//        System.out.println("v = " + v);


//        문자 : char
        char my_char = '가';
//        System.out.println("my_char = " + my_char);

//        boolean : true(1) or false(0)
        boolean my_bool = true;
        if (my_bool) System.out.println("참");

        int a = 20;
        int b = 10;
        if(a >= b) System.out.println("참 입니다");

        int ch1  = 'a';
        int ch1_num = ch1;
//        System.out.println("ch1_num = " + ch1_num);

        int my_int1 = 10;
        double my_double1 = my_int1;
//        System.out.println("my_double1 = " + my_double1);
//        에러상황 : my_int1 = my_double1;
//        명시적 타입은 가능
//        double 에서 int 는 가능 소수점 값 손실발생 가능성이있다.

        my_int1 = (int)my_double1;
        System.out.println("my_double1 = " + my_double1);

        double my_double2 = 7.2f + 3;
        System.out.println("my_double2 = " + my_double2);

        char my_char2 = 'b';
        int char_num = (int) my_char2;

        int aa = 1;
        int bb = 4;

        int c = aa/bb;
        double d = aa / bb;
        System.out.println("d = " + d);
        System.out.println("c = " + c);

        double d2 = aa / (double)bb;
        System.out.println("d2 = " + d2);

//        선언 만 한 뒤에 나중에 초기화
        int a1 = 10; // 지역변수는 선언만 됐을때는 값이 0 으로 초기화 되지 않으나, 객체로 선언될때는 0 으로 초기화 
        a1 = 20;

        // 객체로 만들때는 0으로 치과 된다.
        int[] ints = new int[5];
        System.out.println("ints[0] = " + ints[0]);
        System.out.println(ints);


        int a2; // 선언만 됐을때는 값이 0으로 초기화
        a2 = 20;

//        상수는 값의 재혈당이 불가능, 에러발생한다.
//        상수는 선어만 한 뒤에 나중에 초기화 하는 방식이 java8 이후 가능해짐
        final int AGES = 20;

//        int 는 선언만 할 경우 0이 할당, String 은 null 이 할당

        String aaa;
        aaa = "sfaj";


    }
}
