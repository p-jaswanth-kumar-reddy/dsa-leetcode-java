package arrays;

import java.util.Scanner;

// LeetCode: 1512. Number of Good Pairs
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n²)
// Space Complexity: O(1)

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberOfGoodPairs solution = new NumberOfGoodPairs();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solution.numIdenticalPairs(nums);

        System.out.println("Number of good pairs: " + result);

        sc.close();
    }
}