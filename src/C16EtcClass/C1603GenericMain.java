package C16EtcClass;

import java.util.Arrays;

public class C1603GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C++"};
        Integer[] Arr = {1,2,3,4,5};
       /*
        String temp = stArr[0];
        stArr[0] = stArr[1];
        stArr[1] = temp;
*/
/*
        Integer temp1 = Arr[0];
        Arr[0] = Arr[1];
        Arr[1] = temp1;
 */
//        swap(stArr,1,2);
//        swap(Arr,1,2);
        swap_generic(stArr, 1, 2);
        swap_generic(Arr, 1, 2);
        System.out.println(Arrays.toString(Arr));
        System.out.println(Arrays.toString(stArr));

        GenericClass<Integer> student = new GenericClass<>();
        student.setAge(11);
        student.setName("bosek");

        GenericClass<String> student2 = new GenericClass<>();
        student2.setAge("1235");
        student2.setName("bosek");
        student2.getAge().getClass(); // getage에 클래스(타입) 을 알 수 있음.


    }
//    private static String[] swap(String[] stArr, int i, int i1) {
//        String temp = stArr[i];
//        stArr[i] = stArr[i1];
//        stArr[i1] = temp;
//        return stArr;
//    }
//    private static Integer[] swap(Integer[] arr, int i, int i1) {
//        Integer temp1 = arr[i];
//        arr[i] = arr[i1];
//        arr[i1] = temp1;
//        return arr;
//    }
//        제네릭 메서드 생성 : 반환타입 왼쪽에 <T> 선언
//    제네릭은 객체 타입이 들어와야 함에 유의
    static <T> T[] swap_generic(T[] arr, int i, int i1) {
        T temp1 = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp1;

        return arr;
    }

}

class GenericClass<T> {
    String name;
    T age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}