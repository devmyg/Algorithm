package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10844_쉬운계단수 {
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long ans = 0;
        dp = new long[n + 1][10];

        for(int i=0; i<10; i++) dp[1][i] = 1L;
        for(int i=1; i<10; i++) ans += recur(n, i);

        System.out.println(ans % 1000000000);
    }

    static long recur(int len, int val) {
        if(len == 1) return dp[len][val];

        if(dp[len][val] == 0) {
            if(val == 0) dp[len][val] = recur(len - 1, val + 1);
            else if(val == 9) dp[len][val] = recur(len - 1, val - 1);
            else dp[len][val] = recur(len - 1, val - 1) + recur(len - 1, val + 1);
        }
        return dp[len][val] % 1000000000;
    }
}
