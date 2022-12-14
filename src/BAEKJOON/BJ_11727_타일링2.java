package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11727_타일링2 {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 2];
        dp[1] = 1;
        dp[2] = 3;

        System.out.println(recur(n));
    }

    static int recur(int n) {
        if(dp[n] == null) dp[n] = recur(n - 1) + recur(n - 2) * 2;
        return dp[n] % 10007;
    }
}
