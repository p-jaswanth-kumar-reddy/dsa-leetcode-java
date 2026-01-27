package binarysearch;

import java.util.Scanner;

// 1539. Kth Missing Positive Number
// Difficulty: Easy
// Topic: Binary Search (Search on Answer)
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class KthMissingPositiveNumber {

    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // missing numbers until arr[mid]
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // kth missing number
        return left + k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KthMissingPositiveNumber solution =
                new KthMissingPositiveNumber();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted positive array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = solution.findKthPositive(arr, k);

        System.out.println("Kth missing positive number: " + result);

        sc.close();
    }
}