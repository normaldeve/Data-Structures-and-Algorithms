package algorithms.sort;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100_000;
    public static int n;
    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(0, n * 10);
        }
        System.out.println("<삽입 정렬>");
        System.out.print("Example list: ");
        print();
        System.out.println();
        insertSortTime();
        System.out.print("InsertSort: ");
        print();
        System.out.println();
        System.out.println("==============================================================================");
    }

    private static void print() {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }

    private static void insertSortTime() {
        long startTime = System.currentTimeMillis();
        InsertSort.insertSort(arr, n);
        long endTime = System.currentTimeMillis();
        System.out.println("삽입 정렬 시 걸리는 시간: " + (endTime - startTime) + "ms");
    }
}
