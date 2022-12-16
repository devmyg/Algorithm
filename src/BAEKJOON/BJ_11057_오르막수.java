package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11057_오르막수 {
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long ans = 0L;
        dp = new long[n + 1][10];

        for(int i = 0; i < 10; i++) dp[1][i] = 1L;

        for(int i = 0; i < 10; i++) ans += recur(n, i);

        System.out.println(ans % 10007);
    }

    static long recur(int len, int num) {
        if(len == 1) return dp[len][num];

        if(dp[len][num] == 0) {
            long sum = 0L;
            for(int i = num; i < 10; i++) sum += recur(len - 1, i);
            dp[len][num] = sum;
        }

        return dp[len][num] % 10007;
    }
}
