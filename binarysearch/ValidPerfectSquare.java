package binarysearch;

import java.util.Scanner;

// 367. Valid Perfect Square
// Difficulty: Easy
// Topic: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        int left = 1, right = num / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidPerfectSquare solution = new ValidPerfectSquare();

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        boolean result = solution.isPerfectSquare(num);

        System.out.println("Is perfect square: " + result);

        sc.close();
    }
}