package BAEKJOON;

import java.io.*;
import java.util.Stack;

public class BJ_17298_오큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> idxStack = new Stack<>();
        int[] arr = new int[n];
        int[] ans = new int[n];

        String[] tmp = br.readLine().split(" ");
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(tmp[i]);

        idxStack.push(0);
        for(int i=1; i<n; i++) {
            while(!idxStack.isEmpty() && arr[idxStack.peek()] < arr[i]) ans[idxStack.pop()] = arr[i];
            idxStack.push(i);
        }
        while(!idxStack.isEmpty()) ans[idxStack.pop()] = -1;

        for(int m : ans) bw.write(m + " ");
        bw.flush();
        bw.close();
    }
}
