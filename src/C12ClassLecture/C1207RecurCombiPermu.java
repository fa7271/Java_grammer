package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class C1207RecurCombiPermu {
    static Stack<Integer> stack;
    static int n = 4;
    static int m = 2;
    static ArrayList<List<Integer>> combinations_arr = new ArrayList<>();

//    static ArrayList<Integer> temp = new ArrayList<>();
//    static ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));


    public static void main(String[] args) {
        ArrayList<List<Integer>> combinations = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        for (int i = 0; i < myList.size(); i++) {
            temp.add(myList.get(i));
            for (int j = i+1; j < myList.size(); j++) {
                temp.add(myList.get(j));
                combinations.add(new ArrayList<>(temp));
                temp.remove(temp.size() - 1);
//                ArrayList<Integer> temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                combinations.add(temp);
//                combinations.add(Arrays.asList(myList.get(i), myList.get(j)));
            }
            temp.remove(temp.size() - 1);
        }
        System.out.println(combinations);
        stack = new Stack<>();
//        combi(0);
        System.out.println("tm = " + temp);
        combi_arr(0,combinations_arr, temp, myList);

        System.out.println("combinations_arr = " + combinations_arr);
//        permu();
    }

//    private static void permu() {
//    }

    public static void combi(int depth) {
        if (stack.size() == m) {
            for (int i : stack)
                System.out.print(i + " ");
            System.out.println();
            return;
        }
        for (int i = depth + 1; i < n + 1; i++) {
            stack.add(i);
            combi(i);
            stack.pop();
        }
    }

    public static void combi_arr(int node, ArrayList<List<Integer>> combinations_arr, ArrayList<Integer> temp, ArrayList<Integer> myList) {
        if (temp.size() == m) {
            combinations_arr.add(new ArrayList<>(temp));
            return;
        }
        for (int i = node ; i < n; i++) {
            temp.add(myList.get(i));
            combi_arr(i+1, combinations_arr, temp, myList);
            temp.remove(temp.size() - 1);
//            temp.add(i);
//            combi_arr(i+1, combinations_arr, temp);
//            temp.remove(temp.size()-1);
        }
    }
//
//    }
}
