# Insertion Sort

삽입 정렬은 데이터 전체를 **정렬된 영역**과 **정렬되지 않은 영역**으로 나누어, 정렬되지 않은 영역의 값을 정렬된 영역의 적절한 위치에 삽입하면서 정렬하는 알고리즘입니다.

정렬되지 않은 영역의 맨 앞에 있는 값을 **Key**라고 부릅니다.

## 알고리즘 단계
1. 초기 상태에서는 **정렬된 영역**을 배열의 첫 번째 요소로 하고, 나머지를 **정렬되지 않은 영역**으로 설정합니다.
2. **Key**와 **정렬된 영역**의 끝에서부터 값을 비교하며 다음을 수행합니다:
   - **Key**보다 큰 값을 오른쪽으로 한 칸 밀어냅니다.
   - **Key**보다 작은 값이 나오거나, 더 이상 비교할 값이 없으면, 빈 자리에 **Key**를 삽입합니다.
3. 모든 데이터가 **정렬된 영역**에 포함될 때까지 2단계를 반복합니다.

## 시간 복잡도
- **최악의 경우 (O(n^2))**: 배열이 내림차순으로 정렬되어 있는 경우.
- **최선의 경우 (O(n))**: 배열이 이미 정렬되어 있는 경우.

## 구현 예제 (Java)
```java
public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        
        for (int i = 1; i < n; i++) {
            int key = array[i]; // 정렬되지 않은 영역의 첫 번째 값을 키로 설정
            int j = i - 1;      // 정렬된 영역의 마지막 인덱스
            
            // 정렬된 영역을 거꾸로 탐색하며 키보다 큰 값을 오른쪽으로 이동
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            
            // 키를 적절한 위치에 삽입
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        insertionSort(array);

        // 결과 출력
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
```

---

## Merge Sort

병합 정렬은 **정렬되지 않은 영역을 분할**하고, 각 영역을 정렬한 후 이를 병합하여 최종적으로 정렬된 결과를 얻는 **분할 정복 알고리즘**입니다. 병합 시 부분 정렬을 수행합니다.

## 알고리즘 단계
1. 주어진 배열을 더 이상 분할할 수 없을 때까지 나눕니다.
2. 분할된 각 배열을 정렬하며 병합을 수행합니다:
   - 각 부분 배열의 첫 번째 원소를 가리키는 **포인터**를 생성합니다.
   - 포인터가 가리키는 두 값 중 작은 값을 선택해 **새로운 저장 공간**에 저장합니다.
   - 선택된 값의 포인터를 다음 위치로 이동합니다.
3. 한 부분 배열의 모든 값이 새 저장 공간에 저장되면, 나머지 배열의 값들을 순서대로 복사합니다.
4. 병합 과정을 반복하여, 최종적으로 병합된 결과가 원래 배열 크기와 같아질 때까지 수행합니다.

## 시간 복잡도
- **시간 복잡도 (O(n log n))**:
   - 배열을 분할하는 데 걸리는 시간은 `log n`.
   - 배열을 병합하는 데 걸리는 시간은 `n`.

## 구현 예제 (Java)
```java
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

        mergeSort(0, n - 1);

        System.out.print("After sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

