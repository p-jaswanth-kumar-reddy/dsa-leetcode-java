package arrays;

import java.util.Scanner;

// 1304. Find N Unique Integers Sum up to Zero
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)

public class FindNUniqueIntegersSumUpToZero {

    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        for (int i = 1; i <= n / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        // If n is odd, middle element remains 0 (default value)
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindNUniqueIntegersSumUpToZero solution =
                new FindNUniqueIntegersSumUpToZero();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] result = solution.sumZero(n);

        System.out.println("Result array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}