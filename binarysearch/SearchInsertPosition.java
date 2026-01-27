package binarysearch;

import java.util.Scanner;

// 35. Search Insert Position
// Difficulty: Easy
// Topic: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // insertion position
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchInsertPosition solution =
                new SearchInsertPosition();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = solution.searchInsert(nums, target);

        System.out.println("Search insert position: " + result);

        sc.close();
    }
}