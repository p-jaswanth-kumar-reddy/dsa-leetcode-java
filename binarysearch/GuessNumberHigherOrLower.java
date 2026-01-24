package binarysearch;

import java.util.Scanner;

// 374. Guess Number Higher or Lower
// Difficulty: Easy
// Topic: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class GuessNumberHigherOrLower {

    // This method simulates the guess API for local testing
    // In LeetCode, this method is already provided
    private int pick;

    public GuessNumberHigherOrLower(int pick) {
        this.pick = pick;
    }

    private int guess(int num) {
        if (num > pick) return -1;
        if (num < pick) return 1;
        return 0;
    }

    public int guessNumber(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid;
            } else if (res < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (upper limit): ");
        int n = sc.nextInt();

        System.out.print("Enter picked number: ");
        int pick = sc.nextInt();

        GuessNumberHigherOrLower solution =
                new GuessNumberHigherOrLower(pick);

        int result = solution.guessNumber(n);

        System.out.println("Guessed number: " + result);

        sc.close();
    }
}