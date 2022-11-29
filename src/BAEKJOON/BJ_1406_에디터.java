package BAEKJOON;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_1406_에디터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] chArr = br.readLine().toCharArray();
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for(char ch : chArr) leftStack.push(ch);

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "L":
                    if(!leftStack.isEmpty()) rightStack.push(leftStack.pop());
                    break;
                case "D":
                    if(!rightStack.isEmpty()) leftStack.push(rightStack.pop());
                    break;
                case "B":
                    if(!leftStack.isEmpty()) leftStack.pop();
                    break;
                case "P":
                    leftStack.push(st.nextToken().charAt(0));
                    break;
            }
        }

        while(!rightStack.isEmpty()) leftStack.push(rightStack.pop());
        for(char ch : leftStack) bw.write(ch);
        bw.flush();
        bw.close();
    }
}
