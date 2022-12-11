package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11655_ROT13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chArr = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<chArr.length; i++) {
            if(Character.isUpperCase(chArr[i])) {
                if(chArr[i] + 13 > 90) chArr[i] = (char) (chArr[i] + 13 - 90 + 64 - 1);
                else chArr[i] += 13;
            }
            else if(Character.isLowerCase(chArr[i])) {
                if(chArr[i] + 13 > 122) chArr[i] = (char) (chArr[i] + 13 - 122 + 96 - 1);
                else chArr[i] += 13;
            }
        }
        for(char ch : chArr) sb.append(ch);
        System.out.println(sb);
    }
}
