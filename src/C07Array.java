import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07Array {
    public static void main(String[] args) {
////        표현1
//        int[] int_arr = {1, 2, 3, 4,};
////        표현2
//        int[] int_arr2 = new int[4];
//
//        int_arr2[0] = 1;
//        int_arr2[1] = 2;
//        int_arr2[2] = 3;
//        int_arr2[3] = 4;
//        표현3
//        int[] int_arr3 = new int[]{1, 2, 3, 4,};

        String[] arr_st = new String[5];
        Arrays.fill(arr_st, ""); // 2차원 배열은 포문 하나 사용해야한다.
        arr_st[0] = "song";
        System.out.println("arr_st = " + Arrays.toString(arr_st));
        for (int i = 0; i < arr_st.length; i++) {
//            if (arr_st[i].isEmpty()) {
//                System.out.println("i = " + i);
//            }
        }

        int[] int_arr3 = {1, 2, 3, 4,}; // null 이 안 들어감
//        Integer[] int_arr4 = {1,2,null,4,5}; // null 이 가능함.
        Integer[] int_arr4 = new Integer[5]; // null 이 가능함.
        int_arr4[1] = 1;

        System.out.println("Arrays.toString(int_arr4) = " + Arrays.toString(int_arr4));
        List<int[]> strArrList = Arrays.asList(int_arr3);

     /*   int[] sol1 = {85, 65, 90};
        int res =0 , mid =0;
        for (int i = 0; i < sol1.length; i++) {
            res += sol1[i];
            mid ++;
        }
        System.out.println(res);
        System.out.println(res / mid);*/

/*
        int[] arr = {10, 20, 30, 12, 8, 17};
        int max = arr[0];
        int min = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        */
        int[] arr2 = {10, 20, 30, 40, 50, 60, 70};

        for (int i = 0; i < arr2.length - 1; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[i + 1];
            arr2[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr = {1, 2, 3, 4, 6};
//        뒤집기
        int[] arrr = new int[5];
        for (int i = arr.length - 1; i >= 0; i--) {
            arrr[i] = arr[arrr.length - i - 1];
        }
        System.out.println("arrr = " + Arrays.toString(arrr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arrr.length - i - 1];
            arr[arrr.length - i - 1] = temp;
        }
        System.out.println("arr = " + Arrays.toString(arr));

        int[] sort_arr = {5, 1, 2, 5, 7, 2, 1};
        Arrays.sort(sort_arr);
        System.out.println("sort_arr = " + sort_arr);


        // 방법1. Comparator 클래스 사용
        // 객체타입인 경우에만 Comparator 클래스 사용가능 >> 참조형 데이터만 가능 기본형은 불가능 >> int, byte, short, long, float, double
//        int[] arrays ={1,2,3,4,6}; // int 형 이기때문에 불가능, integer로 바꾸고 해줘야함


        String[] st_arr = {"hello", "hi", "bye", "goodmoring"};
        Arrays.sort(st_arr, Comparator.reverseOrder());
        Arrays.sort(st_arr, Comparator.reverseOrder());
        System.out.println("st_arr = " + Arrays.toString(st_arr));

        Integer[] arr_integer = {1, 6, 4, 2, 8, 4, 2};
        Arrays.sort(arr_integer, Comparator.reverseOrder());

//        기본형 일때 내림차순 하는 방법 
//        1. 배열 뒤집기
        System.out.println("Arrays.toString(sort_arr) = " + Arrays.toString(sort_arr));

        for (int i = 0; i < sort_arr.length / 2; i++) {
            int temp = sort_arr[i];
            sort_arr[i] = sort_arr[sort_arr.length - i - 1];
            sort_arr[sort_arr.length - i - 1] = temp;
        }
        System.out.println("Arrays.toString(sort_arr) = " + Arrays.toString(sort_arr));

//        스트림 사용 뒤집기
        int[] sort_arr2 = {5, 3, 2, 13, 67, 5, 3};
        int[] new_sort_arr2 = Arrays.stream(sort_arr2) // stream 객체 생성
                        .boxed() // Integer 형 변환 스트림 객체 생성
                        .sorted(Comparator.reverseOrder()) // 내림차순 정렬
                        .mapToInt(a -> a) // Integer 를 int 로 변환
                        .toArray();
        System.out.println(Arrays.toString(new_sort_arr2));
    }
}
