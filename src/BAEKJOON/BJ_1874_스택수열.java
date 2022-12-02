package BAEKJOON;

import java.io.*;
import java.util.Stack;

public class BJ_1874_스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int cnt = 2;
        for(int i=0; i<n; i++) num[i] = Integer.parseInt(br.readLine());

        stack.push(1);
        bw.write("+\n");
        for(int i=0; i<n; i++) {
            if(stack.isEmpty() || num[i] < cnt && num[i] > stack.peek()) {
                bw = new BufferedWriter(new OutputStreamWriter(System.out));
                bw.write("NO");
                bw.close();
                return;
            }
            while(!stack.isEmpty()) {
                if(num[i] <= stack.peek()) {
                    bw.write("-\n");
                    stack.pop();
                    break;
                }
                bw.write("+\n");
                stack.push(cnt++);
            }
        }
        bw.flush();
        bw.close();
    }
}
