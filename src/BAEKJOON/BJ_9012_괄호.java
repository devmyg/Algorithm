package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<Character>();
        String[] str = new String[n];

        for(int i=0; i<n; i++) {
            str[i] = br.readLine();
        }

        for(int i=0; i<n; i++) {
            stack.clear();
            for(int j=0; j<str[i].length(); j++) {
                if(str[i].charAt(j) == ')') {
                    if(stack.empty()) {
                        System.out.println("NO");
                        break;
                    }
                    stack.pop();
                }
                else stack.push(str[i].charAt(j));
                if(j == str[i].length()-1) {
                    if(stack.empty()) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        }
    }
}
