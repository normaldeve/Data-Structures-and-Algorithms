# Sort

## Insertion Sort

삽입 정렬은 데이터 전체를 **정렬된 영역**과 **정렬되지 않은 영역**으로 나누어, 정렬되지 않은 영역의 값을 정렬된 영역의 적절한 위치에 삽입하면서 정렬하는 알고리즘입니다.

정렬되지 않은 영역의 맨 앞에 있는 값을 **Key**라고 부릅니다.

### 알고리즘 단계
1. 초기 상태에서는 **정렬된 영역**을 배열의 첫 번째 요소로 하고, 나머지를 **정렬되지 않은 영역**으로 설정합니다.
2. **Key**와 **정렬된 영역**의 끝에서부터 값을 비교하며 다음을 수행합니다:
    - **Key**보다 큰 값을 오른쪽으로 한 칸 밀어냅니다.
    - **Key**보다 작은 값이 나오거나, 더 이상 비교할 값이 없으면, 빈 자리에 **Key**를 삽입합니다.
3. 모든 데이터가 **정렬된 영역**에 포함될 때까지 2단계를 반복합니다.

### 시간 복잡도
- **최악의 경우 (O(n^2))**: 배열이 내림차순으로 정렬되어 있는 경우.
- **최선의 경우 (O(n))**: 배열이 이미 정렬되어 있는 경우.

### 구현 예제 (Java)
```java
public class InsertionSort {
    public static void sort(int[] arr, int n) {
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
        int[] array = {5, 2, 9, 1, 5, 6};
        sort(array, array.length);

        // 결과 출력
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
```

## 실행 결과
- 정렬 전: `5, 2, 9, 1, 5, 6`
- 정렬 후: `1, 2, 5, 5, 6, 9`

