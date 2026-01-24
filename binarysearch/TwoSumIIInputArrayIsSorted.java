package binarysearch;

import java.util.Scanner;

// 167. Two Sum II - Input Array Is Sorted
// Difficulty: Medium
// Topic: Two Pointers / Binary Search
// Time Complexity: O(n)
// Space Complexity: O(1)

public class TwoSumIIInputArrayIsSorted {

    // Two-pointer approach (preferred)
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                // 1-indexed result as per problem statement
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoSumIIInputArrayIsSorted solution =
                new TwoSumIIInputArrayIsSorted();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = solution.twoSum(numbers, target);

        System.out.println("Indices (1-based):");
        for (int idx : result) {
            System.out.print(idx + " ");
        }

        sc.close();
    }
}