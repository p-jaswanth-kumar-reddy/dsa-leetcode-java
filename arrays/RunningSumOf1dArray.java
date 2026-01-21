package arrays;

import java.util.Scanner;

// LeetCode: 1480. Running Sum of 1d Array
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1) extra space

public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RunningSumOf1dArray solution = new RunningSumOf1dArray();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = solution.runningSum(nums);

        System.out.println("Running sum array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}