package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9095_123더하기 {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        dp = new Integer[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=0; i<t; i++) System.out.println(recur(Integer.parseInt(br.readLine())));
    }

    static int recur(int n) {
        if(dp[n] == null) dp[n] = recur(n - 1) + recur(n - 2) + recur(n - 3);
        return dp[n];
    }
}
