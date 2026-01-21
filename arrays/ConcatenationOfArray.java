package arrays;

import java.util.Scanner;

// LeetCode: 1929. Concatenation of Array
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConcatenationOfArray solution = new ConcatenationOfArray();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = solution.getConcatenation(nums);

        System.out.println("Concatenated array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
