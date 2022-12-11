package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2445_별찍기8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            for(int j=i; j>=0; j--) System.out.print("*");
            for(int j=1; j<(n*2-1)-i*2; j++) System.out.print(" ");
            for(int j=i; j>=0; j--) System.out.print("*");
            System.out.println();
        }
        for(int i=0; i<n; i++) {
            for(int j=n-i-1; j>0; j--) System.out.print("*");
            for(int j=0; j<(i+1)*2; j++) System.out.print(" ");
            for(int j=n-i-1; j>0; j--) System.out.print("*");
            System.out.println();
        }
    }
}
