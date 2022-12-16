package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2193_이친수 {
    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new long[n + 2];
        dp[1] = dp[2] = 1;

        System.out.println(recur(n));
    }

    static long recur(int n) {
        if(dp[n] != 0) return dp[n];
        else return dp[n] = recur(n - 1) + recur(n - 2);
    }
}
