package binarysearch;

import java.util.Scanner;

// 852. Peak Index in a Mountain Array
// Difficulty: Medium
// Topic: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // ascending slope
                left = mid + 1;
            } else {
                // descending slope
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PeakIndexInAMountainArray solution =
                new PeakIndexInAMountainArray();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter mountain array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = solution.peakIndexInMountainArray(arr);

        System.out.println("Peak index: " + result);

        sc.close();
    }
}