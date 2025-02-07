package algorithms.bakjun;

import java.io.*;

public class 숫자의합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();
        char[] cNum = num.toCharArray();
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += cNum[i] - '0';
        }
        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }
}
