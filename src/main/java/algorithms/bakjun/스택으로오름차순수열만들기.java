package algorithms.bakjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class 스택으로오름차순수열만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        List<String> result = new ArrayList<>();
        int n = sc.nextInt();
        int cur = 1;
        boolean isPossible = true;
        while (n-- > 0) {
            int num = sc.nextInt();
            while (cur <= num) {
                stack.push(cur++);
                result.add("+");
            }
            if (stack.peek() == num) {
                stack.pop();
                result.add("-");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            for (String s : result) {
                System.out.println(s);
            }
        } else {
            System.out.println("NO");
        }
    }
}
