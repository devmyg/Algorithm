package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2522_별찍기12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) System.out.print(" ");
            for(int j=0; j<=i; j++) System.out.print("*");
            System.out.println();
        }
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<=i; j++) System.out.print(" ");
            for(int j=n-i-1; j>0; j--) System.out.print("*");
            System.out.println();
        }
    }
}
