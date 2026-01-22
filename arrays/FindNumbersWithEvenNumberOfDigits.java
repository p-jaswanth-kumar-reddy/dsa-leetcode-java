package arrays;

import java.util.Scanner;

// 1295. Find Numbers with Even Number of Digits
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;
            int temp = num;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindNumbersWithEvenNumberOfDigits solution =
                new FindNumbersWithEvenNumberOfDigits();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solution.findNumbers(nums);

        System.out.println("Count of numbers with even digits: " + result);

        sc.close();
    }
}