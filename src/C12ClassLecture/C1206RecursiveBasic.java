package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;

public class C1206RecursiveBasic {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 10; i >= 1; i--) {
            res += i;
        }
        System.out.println("add_acc(10) = " + add_acc(10));
        System.out.println("add_f(10) = " + add_f(10));


//        메모이제이션, dp
        int n = 10;
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,1));
        int[] arr = new int[11];
        arr[0] = arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arrayList.add(arrayList.get(i - 1) + arrayList.get(i - 2));
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("arrayLisT = " + Arrays.toString(arr));
        System.out.println("arrayList = " + arrayList);
        System.out.println(fibo(10));
    }

    //   메서드가 자기자신을 호출하는 메서드를 재귀함수, 이러한 호출 방식을 재귀호출이라고 한다.
    static int add_acc(int n) {
        if (n == 1) {
            return 1;
        }
        return n + add_acc(n - 1);
    }

    static int add_f(int n) {

        if (n == 1) {
            return 1;
        }
        return n * add_f(n - 1);
    }

    static int fibo(int n) {
        if (n <= 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}



