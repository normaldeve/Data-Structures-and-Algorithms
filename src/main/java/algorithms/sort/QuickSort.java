package algorithms.sort;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static int n;
    public static int[] arr = new int[10_000];
    public static int[] mergedArr = new int[10_000];
    public static int partition(int low, int high) { // pivot의 최종 위치를 알려준다.
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(int low, int high) {
        if(low < high) {
            int pos = partition(low, high);
            quickSort(low, pos - 1);
            quickSort(pos + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(0, n * 10);
        }

        quickSort(0, n - 1);

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
