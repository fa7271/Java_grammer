package algorithm;

import java.util.Arrays;

public class Insert_sort {
    public static void main(String[] args) {
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
    }
}
