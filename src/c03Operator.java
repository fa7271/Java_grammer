import static java.lang.System.exit;

public class c03Operator {
    public static void main(String[] args) {

//        1. 산술 연산자
        int num1=8, num2=3;

        System.out.println("num1 + num2 :" + (num1 + num2));
        System.out.println("num1 * num2 :" + num1 * num2);
        System.out.println("num1 / num2 :" + num1 / num2);
        System.out.println("num1 % num2 :" + num1 % num2);
//        2. 대입 연산자
        int n1 = 7, n2 =7, n3 =7, n4 = 10, n5 =10;
        n1 = n1 - 3;
        n2 -= 3;
        n3 =- 3;

        n4 /= 3;
        n5 %= 3;
        System.out.println("n4 = " + n4);
        System.out.println("n5 = " + n5);

        int x = 5;
        int b = x++; // 후위 연산자 : 실행문이 끝나고 증감
        int c = ++x; // 전위 연산자 : 실행문이 끝나기전에 증감
        System.out.println("b = " + b);
        System.out.println("x = " + x);
        System.out.println("c = " + c);

//        3. 비교 연산자 : ==. !=, >, >=
        char char_1 = 'a';
        char char_2 = 'A';
        System.out.println(char_1 == char_2); // false
        System.out.println(char_1 != char_2); // true

//        4. 논리 연산자 : &&, ||, !
        int num3 = 10; int num4 = 20;
        boolean result1, result2;

        result1 = num3 > 5 && num3 < 20 ;
        result2 = num4 < 10 || num4 <30 ;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + !result2);

//        5. 비트 연산자



    }
}
