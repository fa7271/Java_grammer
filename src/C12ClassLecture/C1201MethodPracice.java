package C12ClassLecture;

import java.util.Arrays;

public class C1201MethodPracice {

    static boolean[] dp;


    public static void main(String[] args) {

//        소수 인지 아닌지 판별하는 메서드
        int x = 100;
        System.out.println(isprime(x));
        System.out.println(isprime_era(x));
    }
    private static boolean isprime_era(int x) {
        boolean[] dp = new boolean[x + 1];
        Arrays.fill(dp, true);
        dp[0] = dp[1] = dp[2] = false;
        for (int i = 2; i < Math.sqrt(x); i++) {
            for(int j=i*i; j<=x; j+=i) {
                dp[j] = false;        //2를 제외한 2의 배수 false
            }
        }
        return dp[x];
    }


    private static boolean isprime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
