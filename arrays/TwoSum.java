package arrays;

import java.util.Scanner;
import java.util.HashMap;

// 1. Two Sum
// Difficulty: Easy
// Topic: Arrays / HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoSum solution = new TwoSum();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices:");
        for (int idx : result) {
            System.out.print(idx + " ");
        }

        sc.close();
    }
}