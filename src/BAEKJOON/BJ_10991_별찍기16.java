package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10991_별찍기16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) System.out.print(" ");
            for(int j=1; j<=i*2-1; j++) {
                if(j % 2 == 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
