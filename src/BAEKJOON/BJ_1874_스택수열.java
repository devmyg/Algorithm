package BAEKJOON;

import java.io.*;
import java.util.Stack;

public class BJ_1874_스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num > cnt) {
                for(int j = cnt + 1; j <= num; j++) {
                    st.push(j);
                    sb.append("+\n");
                }
                cnt = num;
            }
            else if(st.peek() != num) {
                System.out.println("NO");
                return;
            }
            st.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}