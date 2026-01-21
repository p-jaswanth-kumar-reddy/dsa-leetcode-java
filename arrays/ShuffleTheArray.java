package arrays;

import java.util.Scanner;

// LeetCode: 1470. Shuffle the Array
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShuffleTheArray solution = new ShuffleTheArray();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = solution.shuffle(nums, n);

        System.out.println("Shuffled array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}