package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1463_1로만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        System.out.print(n + " -> ");
        while(n != 1) {
            if(n % 3 == 0) n /= 3;
            else if(n % 2 == 0) n /= 2;
            else n--;
            cnt++;
            System.out.print(n + " -> ");
        }

        System.out.println(cnt);
    }
}
