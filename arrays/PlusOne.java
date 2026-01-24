package arrays;

import java.util.Scanner;

// 66. Plus One
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlusOne solution = new PlusOne();

        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int[] digits = new int[n];
        System.out.println("Enter digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        int[] result = solution.plusOne(digits);

        System.out.println("Result:");
        for (int d : result) {
            System.out.print(d + " ");
        }

        sc.close();
    }
}