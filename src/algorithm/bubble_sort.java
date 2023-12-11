package algorithm;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {

        int[] arr = {5,1,4,3,2};

        int arr_len = arr.length;
        // 정렬 완료 조건
        for (int i = 0; i < arr_len -1 ; i++) {
            boolean change_temp = false;

            for (int j = 0; j < arr_len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    change_temp = true;
                }
            }
            if (change_temp == false) {
                break;
            }
        }
        System.out.println("Arrays.toString(a) = " + Arrays.toString(arr));
    }
}
