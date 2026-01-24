package arrays;

import java.util.Scanner;

// 189. Rotate Array
// Difficulty: Medium
// Topic: Arrays (Reversal Technique)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle k > n

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RotateArray solution = new RotateArray();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k (steps to rotate): ");
        int k = sc.nextInt();

        solution.rotate(nums, k);

        System.out.println("Rotated array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}