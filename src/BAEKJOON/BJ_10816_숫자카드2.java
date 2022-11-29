package BAEKJOON;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_10816_숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> map = new HashMap();
        int num;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) bw.write(map.getOrDefault(Integer.parseInt(st.nextToken()), 0) + " ");
        bw.flush();
        bw.close();
    }
}