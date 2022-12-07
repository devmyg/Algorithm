package BAEKJOON;

import java.io.*;

public class BJ_10820_문자열분석 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while ((str = br.readLine()) != null) {
            int[] ans = new int[4];
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLowerCase(str.charAt(i))) ans[0]++;
                else if (Character.isUpperCase(str.charAt(i))) ans[1]++;
                else if (str.charAt(i) == ' ') ans[3]++;
            }
            ans[2] = str.length() - ans[0] - ans[1] - ans[3];
            bw.write(ans[0] + " " + ans[1] + " " + ans[2] + " " + ans[3] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
