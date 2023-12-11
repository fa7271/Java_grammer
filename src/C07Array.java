import java.lang.reflect.Array;
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


        // 선택정렬
        int[] Arr = {30, 22, 20, 25, 12};
        for (int i = 0; i < Arr.length - 1; i++) {
            int mid_idx = i;
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[mid_idx] > Arr[j]) {
                    mid_idx = j;
                }
            }
            int temp = Arr[i];
            Arr[i] = Arr[mid_idx];
            Arr[mid_idx] = temp;
        }
        System.out.println(Arrays.toString(Arr));

//        숫자 조합의 합 : 각기 다른 숫자의 배열이 있을때 만들어질 수 있는 2개의 조합의 합을 출력하라/

        int[] int_arr = {10, 20, 30, 40, 50, 60};

        for (int i = 0; i < int_arr.length - 1; i++) {
            for (int j = i + 1; j < int_arr.length; j++) {
//                System.out.println(int_arr[i] + int_arr[j]);
            }
        }

//        중복 제거하기
        int[] temp = {10, 10, 40, 40, 5, 7};
//        배열 복사 from이상 to 미만
//        int[] new_temp = Arrays.copyOfRange(temp, 1, 5);

        Arrays.sort(temp);
//        System.out.println(Arrays.toString(temp));
//        ArrayList<int[]> tem = new ArrayList<>(Arrays.asList(temp));
//        for (int i = 0; i < int_arr.length - 1; i++) {
//            if (tem.get(i) == tem.get(i + 1)) {
//                tem.remove(i + 1);
//            }
//        }
//        System.out.println(tem);
//        int[] new_temp = new int[temp.length];
//        int start = 0;
//        for (int i = 0; i < temp.length - 1; i++) {
//            if (temp[i] != temp[i + 1]) {
//                new_temp[start] = temp[i];
//                start++;
//            }
//        }
//        new_temp[start] = temp[temp.length - 1];
//        System.out.println("Arr = " + Arrays.toString(new_temp));
//        int[] new_temps = Arrays.copyOfRange(new_temp, 0, start + 1);
//        System.out.println("Arrays.toString(new_temps) = " + Arrays.toString(new_temps));


        // 두 개 뽑아서 더하기
        int[] numbers = {2, 1, 3, 4, 1};
        int[] answer = new int[numbers.length * (numbers.length - 1)];
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer[count] = numbers[i] + numbers[j];
                count++;
            }
        }
        int[] res = Arrays.copyOfRange(answer, 0, count);
        Arrays.sort(res);

        int[] new_temp = new int[res.length];
        int start = 0;
        for (int i = 0; i < res.length - 1; i++) {
            if (res[i] != res[i + 1]) {
                new_temp[start] = res[i];
                start++;
            }
        }

        new_temp[start] = res[res.length - 1];

        int[] new_temps = Arrays.copyOfRange(new_temp, 0, start + 1);

        System.out.println("Arrayts.to = " + Arrays.toString(new_temps));

        int[] index_arr = {1, 3, 6, 8, 9, 11};
        int index_answer = Arrays.binarySearch(index_arr, 8);
        System.out.println(index_answer);

        // 이진탐색
        int index = Arrays.stream(index_arr).filter(a -> a == 8).findFirst().getAsInt();

        int left = 0;
        int right = index_arr.length - 1;
        int target = 8;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (index_arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("right :" + right);

        int[] arr1 = {10, 20, 30};
        int[] arr11 = {10, 20, 30};

        System.out.println(Arrays.equals(arr1, arr11));

//        배열 복사 : 1. copyOf(배열,end) : 처음 부터 endindex 까지, 기존 배열보다 큰 경우, 0으로 세팅
//        2. copyOfRange(배열, start,end)

        int[] ARR = {10, 20, 30, 40, 50};
        int[] ARR2 = Arrays.copyOfRange(ARR, 1, 4);
        int[] ARR3 = Arrays.copyOf(ARR, 10);

        System.out.println("Arrays.toString(ARR2) = " + Arrays.toString(ARR2));
        System.out.println("Arrays.toString(ARR#) = " + Arrays.toString(ARR3));


        int[][] arr_2 = new int[2][3];
        arr_2[0][0] = 1;
        arr_2[0][1] = 2;
        arr_2[0][2] = 3;
        arr_2[1][0] = 4;
        arr_2[1][1] = 5;
        arr_2[1][2] = 6;

        System.out.println("Arrays.deepToString(arr_2) = " + Arrays.deepToString(arr_2));

//        2차원 가변배열 선언 및 할당
        int[][] arr_3 = new int[3][];
        arr_3[0] = new int[1];
        arr_3[1] = new int[2];
        arr_3[2] = new int[3];

        // 가변 배열 리터럴 방식
        int[][] arr4 = {{10}, {20, 30}, {40, 50, 60}};


        System.out.println("Arrays.deepToString(arr_2) = " + Arrays.deepToString(arr_3));
        int[][] arr5 = new int[3][4];
        int idx = 1;
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                arr5[i][j] = idx;
                idx ++;
            }
        }
        System.out.println("Arrays.deepToString() = " + Arrays.deepToString(arr5));

//        가변 배열 만들기 : 전체사이즈 5 각 배열마다 사이즈 1,2,3,4,5
        int[][] arr6 = new int[5][];
        int counts = 1;
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = new int[i+1];
            for (int j = 0; j <= arr6[i].length-1; j++) {
                arr6[i][j] = counts;
            }
            counts ++;
        }
        System.out.println(Arrays.deepToString(arr6));
    }
}
