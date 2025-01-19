package algorithms.sort;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    static int n;
    static int[] arr = new int[10_000];
    public static void sort() {
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(0, 10 * n);
        }
        System.out.print("Before sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("After sort: ");
        sort();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
