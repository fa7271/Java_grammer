package C12ClassLecture;

import java.util.*;

import static java.lang.Math.max;

public class C1207RecurCombiPermu {
    static Stack<Integer> stack;
    static int n = 4;
    static boolean[] visited = new boolean[n];
    static int m = 4;
    static int res_1 = 0;
    static int res0 = 0;
    static int res1 = 0;
    static int result, count;
    static ArrayList<List<Integer>> combinations_arr = new ArrayList<>();
    static ArrayList<List<Integer>> permutaitons_arr = new ArrayList<>();


    static ArrayList<Integer> temp = new ArrayList<>();
    static ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 4, -1));


    public static void main(String[] args) {
        ArrayList<List<Integer>> combinations = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        for (int i = 0; i < myList.size(); i++) {
            temp.add(myList.get(i));
            for (int j = i + 1; j < myList.size(); j++) {
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
//        System.out.println(combinations);
//        stack = new Stack<>();
////        combi(0);
//        System.out.println("tm = " + temp);
//        combi_arr(0, combinations_arr, temp, myList);
//
//        System.out.println("combinations_arr = " + combinations_arr);

//        permu(0);
//        System.out.println("permutaitons_arr = " + permutaitons_arr);

//        permu1(0);
//        System.out.println(permutaitons_arr);

//        for (int i = 0; i <= m; i++) {
//            permu2(0, i);
//        }
//        System.out.println("permutaitons_arr = " + permutaitons_arr);
//        for (int i = 1; i <= m; i++) {
//            result = 0;
//            permu3(0, i);
//            res1 = max(result, res1);
//        }
//        System.out.println(res1);
        permu3(0, 3);
        System.out.println("res_1 = " + res_1);
    }

    /*public static void permu(int node) {
        if (temp.size() == m) {
            permutaitons_arr.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(i);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }*/

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
        for (int i = node; i < n; i++) {
            temp.add(myList.get(i));
            combi_arr(i + 1, combinations_arr, temp, myList);
            temp.remove(temp.size() - 1);
//            temp.add(i);
//            combi_arr(i+1, combinations_arr, temp);
//            temp.remove(temp.size()-1);
        }
    }

    //    public static void permu1(int node) {
//        if (temp.size() == m) {
//            if (res >= 6) {
//                System.out.println(temp);
//            }
//            permutaitons_arr.add(new ArrayList<>(temp));
//            return;
//        }
//        for (int i = 0; i < n; i++) {
//            if (visited[i] == false) {
//                visited[i] = true;
//                temp.add(myList.get(i));
//                res += myList.get(i);
//                permu1(i + 1);
//                temp.remove(temp.size() - 1);
//                res -= myList.get(i);
//                visited[i] = false;
//            }
//        }
//    }
//    public static void permu2(int node, int size) {
//        if (temp.size() == size) {
//            if (res >= 6) {
//                permutaitons_arr.add(new ArrayList<>(temp));
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (visited[i] == false) {
//                visited[i] = true;
//                temp.add(myList.get(i));
//                res += myList.get(i);
//                permu2(i, size);
//                temp.remove(temp.size() - 1);
//                res -= myList.get(i);
//                visited[i] = false;
//            }
//        }
//    }
    public static void permu3(int node, int size) {
        if (count == size) {
            res_1 = Math.max(res_1, res0);
            return;
//            result = Math.max(result, temp.stream().mapToInt(Integer::intValue).sum());
        }
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                visited[i] = true;
//                temp.add(myList.get(i));
                count++;
                res0 += myList.get(i);
                permu3(i, size);
//                temp.remove(temp.size() - 1);
                count--;
                res0 -= myList.get(i);
                visited[i] = false;
            }
        }
    }
}

//
//    }
