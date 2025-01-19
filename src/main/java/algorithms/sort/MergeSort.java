package algorithms.sort;

import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    static int n;
    static int[] arr = new int[1000];
    static int[] mergedArr = new int[1000];

    public static void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public static void merge(int low, int mid, int high) {
        int i = low, j = mid + 1;

        int k = low;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                mergedArr[k++] = arr[i++];
            } else {
                mergedArr[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            mergedArr[k++] = arr[i++];
        }
        while (j <= high) {
            mergedArr[k++] = arr[j++];
        }

        for (int l = low; l <= high; l++) {
            arr[l] = mergedArr[l];
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
        mergeSort(0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
