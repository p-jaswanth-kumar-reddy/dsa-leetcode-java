package arrays;

import java.util.Scanner;

// 53. Maximum Subarray
// Difficulty: Medium
// Topic: Arrays (Kadane's Algorithm)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaximumSubarray solution = new MaximumSubarray();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solution.maxSubArray(nums);

        System.out.println("Maximum subarray sum: " + result);

        sc.close();
    }
}