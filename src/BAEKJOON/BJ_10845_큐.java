package BAEKJOON;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_10845_큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        int backNum = 0;
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    backNum = Integer.parseInt(st.nextToken());
                    queue.add(backNum);
                    break;
                case "pop":
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.poll() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.peek() + "\n");
                    break;
                case "back":
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(backNum + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
