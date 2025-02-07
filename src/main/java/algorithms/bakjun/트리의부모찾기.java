package algorithms.bakjun;

import java.util.*;

public class 트리의부모찾기 {
    static int N;
    static boolean[] visited;
    static ArrayList<Integer>[] tree;
    static int[] answer;

    static void DFS(int number) {
        visited[number] = true;
        for (int i : tree[number]) {
            if (!visited[i]) {
                answer[i] = number;
                DFS(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visited = new boolean[N + 1];
        tree = (ArrayList<Integer>[]) new ArrayList[N + 1];
        answer = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) { // 수정된 부분
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            tree[n1].add(n2);
            tree[n2].add(n1);
        }
        sc.close(); // Scanner 닫기

        DFS(1); // 문제에서 루트가 1로 주어졌다고 가정

        for (int i = 2; i <= N; i++) {
            System.out.println(answer[i]);
        }
    }
}
