package BAEKJOON;

import java.io.*;

public class BJ_10808_알파벳개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int[] arr = new int[26];
        for(int i=0; i<str.length(); i++) arr[str.charAt(i) - 97]++;
        for(int i=0; i<26; i++) bw.write(arr[i] + " ");

        bw.flush();
        bw.close();
    }
}
