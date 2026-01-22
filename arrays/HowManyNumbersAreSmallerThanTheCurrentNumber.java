package arrays;

import java.util.Scanner;

// LeetCode: 1365. How Many Numbers Are Smaller Than the Current Number
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n²)
// Space Complexity: O(n)

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HowManyNumbersAreSmallerThanTheCurrentNumber solution =
                new HowManyNumbersAreSmallerThanTheCurrentNumber();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = solution.smallerNumbersThanCurrent(nums);

        System.out.println("Result array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}