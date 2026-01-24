package arrays;

import java.util.Scanner;

// 41. First Missing Positive
// Difficulty: Hard
// Topic: Arrays (Index Placement / Cyclic Sort)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each number in its correct index if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n
                    && nums[nums[i] - 1] != nums[i]) {

                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // Find the first index where the number is incorrect
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FirstMissingPositive solution =
                new FirstMissingPositive();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solution.firstMissingPositive(nums);

        System.out.println("First missing positive: " + result);

        sc.close();
    }
}