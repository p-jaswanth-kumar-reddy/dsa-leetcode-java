package arrays;

import java.util.Scanner;

// LeetCode: 1920. Build Array from Permutation
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)

public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BuildArrayFromPermutation solution = new BuildArrayFromPermutation();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = solution.buildArray(nums);
        
        System.out.println("Result array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
