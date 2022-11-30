package BAEKJOON;

import java.io.*;
import java.util.Stack;

public class BJ_10799_쇠막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        char[] chArr = br.readLine().toCharArray();

        for(int i=0; i<chArr.length; i++) {
            if(chArr[i] == '(') stack.push(chArr[i]);
            else {
                stack.pop();
                if(chArr[i-1] == '(') cnt += stack.size();
                else cnt++;
            }
        }
        System.out.println(cnt);
    }
}
