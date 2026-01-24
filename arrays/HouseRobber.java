package arrays;

import java.util.Scanner;

// 198. House Robber
// Difficulty: Medium
// Topic: Arrays / Dynamic Programming
// Time Complexity: O(n)
// Space Complexity: O(1)

public class HouseRobber {

    public int rob(int[] nums) {
        int prev1 = 0; // max till previous house
        int prev2 = 0; // max till house before previous

        for (int num : nums) {
            int temp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = temp;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HouseRobber solution = new HouseRobber();

        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter money in each house:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solution.rob(nums);

        System.out.println("Maximum amount that can be robbed: " + result);

        sc.close();
    }
}