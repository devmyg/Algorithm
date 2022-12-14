package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1463_1로만들기 {
    static Integer[] cache;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        cache = new Integer[n + 3];
        cache[1] = 0;
        cache[2] = cache[3] = 1;
        System.out.println(recur(n));
    }

    static int recur(int n) {
        if(cache[n] == null) {
            if(n % 6 == 0) cache[n] = Math.min(Math.min(recur(n / 3), recur(n / 2)), recur(n - 1)) + 1;
            else if(n % 3 == 0) cache[n] = Math.min(recur(n / 3), recur(n - 1)) + 1;
            else if(n % 2 == 0) cache[n] = Math.min(recur(n / 2), recur(n - 1)) + 1;
            else cache[n] = recur(n - 1) + 1;
        }
        return cache[n];
    }
}