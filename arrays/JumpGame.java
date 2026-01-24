package arrays;

import java.util.Scanner;

// 55. Jump Game
// Difficulty: Medium
// Topic: Arrays (Greedy)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class JumpGame {

    public boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JumpGame solution = new JumpGame();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = solution.canJump(nums);

        System.out.println("Can reach last index: " + result);

        sc.close();
    }
}