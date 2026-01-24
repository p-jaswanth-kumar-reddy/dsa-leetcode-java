package binarysearch;

import java.util.Scanner;

// 278. First Bad Version
// Difficulty: Easy
// Topic: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class FirstBadVersion {

    // Simulating the API for local testing
    // In LeetCode, isBadVersion(version) is already provided
    private int firstBad;

    public FirstBadVersion(int firstBad) {
        this.firstBad = firstBad;
    }

    private boolean isBadVersion(int version) {
        return version >= firstBad;
    }

    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;       // first bad is at mid or before
            } else {
                left = mid + 1;    // first bad is after mid
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total versions (n): ");
        int n = sc.nextInt();

        System.out.print("Enter first bad version: ");
        int firstBad = sc.nextInt();

        FirstBadVersion solution =
                new FirstBadVersion(firstBad);

        int result = solution.firstBadVersion(n);

        System.out.println("First bad version: " + result);

        sc.close();
    }
}