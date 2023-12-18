package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class C1205MethodOverloading {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        C1205MethodOverloading mo = new C1205MethodOverloading();

//        메서드 오버로딩을 통해 같은 메서드명 재활용
//        제네릭을 통해 타입 재활용
        System.out.println(mo.sum(a, b));
        System.out.println(mo.sum(a, b, c));
        System.out.println(mo.sum(3.2,1.7));


    }

    public double sum(double a, double b) {
        return a+b;
    }
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
