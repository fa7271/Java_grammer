package C12ClassLecture;

public class C1202Class {
    public static void main(String[] args) {
//        int total = MyCalculator.sum(10, 20);

//        A 부서의 매출
        MyCalculator.sum_acc(10);
        MyCalculator.sum_acc(20);
        MyCalculator.sum_acc(30);
        System.out.println(MyCalculator.total);

//        B 부서의 매출
        MyCalculator.sum_acc(10);
        MyCalculator.sum_acc(20);
        MyCalculator.sum_acc(40);
//        클래스변수를 공용으로 사용하다 보니, 변수와 메서드에 고유성이 보장되지 않음
        System.out.println("MyCalculator.total = " + MyCalculator.total);


//        A 부서의 매출
        MyCalInstance myCalA = new MyCalInstance();
        myCalA.sum_acc(10);
        myCalA.sum_acc(20);
        myCalA.sum_acc(30);

        System.out.println("myCalA = " + myCalA.total);
//        B 부서의 매출
        MyCalInstance myCalB = new MyCalInstance();
        myCalB.sum_acc(10);
        myCalB.sum_acc(20);
        myCalB.sum_acc(30);

        System.out.println("myCalB = " + myCalB.total);
    }
}


class MyCalculator {
    static int total = 0;

    static int sum(int x, int y) {
        return x + y;
    }

    static int sum_acc(int x) {
        total += x;
        return total;
    }
}

class MyCalInstance {
//    static 이 붙어있는 변수는 클래스 변수, static이 붙어있지 않으면 객체 변수
    int total = 0;

    int sum(int a, int b) {
        return a + b;
    }

    void sum_acc(int a) {
//        this는 객체의 참조를 나타내므로, 객체가 생성되어야만 this가 유효한 값이 된다.
//        즉 객체 생성 없이는 접근 할 수 없다.
        this.total += total;
    }
}

