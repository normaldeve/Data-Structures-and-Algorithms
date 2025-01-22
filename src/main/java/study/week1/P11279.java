package study.week1;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class P11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (maxHeap.isEmpty()) {
                    bw.write("0\n");
                } else {
                    bw.write(maxHeap.poll() + "\n");
                }
            } else {
                maxHeap.add(x);
            }
        }
        br.close();
        bw.close();
    }
}
