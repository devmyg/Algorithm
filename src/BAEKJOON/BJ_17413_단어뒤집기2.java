package BAEKJOON;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BJ_17413_단어뒤집기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Character> deque = new ArrayDeque<>();

        char[] chArr = br.readLine().toCharArray();
        boolean checkChevron = false;

        for(int i=0; i<chArr.length; i++) {
            if(chArr[i] == ' ' && !checkChevron) {
                while(!deque.isEmpty()) bw.write(deque.pollLast());
                bw.write(" ");
            }
            else if(chArr[i] == '<') {
                checkChevron = true;
                while(!deque.isEmpty()) bw.write(deque.pollLast());
                deque.addFirst(chArr[i]);
            }
            else if(chArr[i] == '>') {
                checkChevron = false;
                deque.addLast(chArr[i]);
                while(!deque.isEmpty()) bw.write(deque.pollFirst());
            }
            else deque.addLast(chArr[i]);

            if(i == chArr.length - 1) while(!deque.isEmpty()) bw.write(deque.pollLast());
        }
        bw.flush();
        bw.close();
    }
}
