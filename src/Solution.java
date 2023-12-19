import java.util.*;
class Solution {
    static ArrayList<List<Integer>> cases = new ArrayList<>();

    static int n;
    static boolean[] visited;
    static ArrayList<Integer> numbers;
    static ArrayList<Integer> temp = new ArrayList<>();


    public static void main(String[] args) {
        int k = 80;

        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        n = dungeons.length;
        visited = new boolean[n];
        numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(i);
        }
        permu(numbers);

        System.out.println(cases);

        ArrayList<Integer> list = new ArrayList<>();
//        각 조합 뽑아주기
        for (int i = 0; i < cases.size(); i++) {
            int count = 0;
            int now = k;
//            뽑은 조합 분석
            for (int x : cases.get(i)) {
                int least = dungeons[x][0]; //최소
                int req = dungeons[x][1]; // 소모 피로도

                if (now >= least) { // 최소 피로도 이상 보유 중이라면
                    now -= req; // 처리하고
                    count++; // 횟수 증가
                }else{ // 작아지면 못 감
                    break;
                }
            }
//            각 조합마다 탐험한 던전 수
            list.add(count);
        }
//        최댓값 부셔버리기
        System.out.println(Collections.max(list));
    }

    public static void permu(ArrayList<Integer> numbers) {
        if (temp.size() == n) {
            cases.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                temp.add(numbers.get(i));
                permu(numbers);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}
