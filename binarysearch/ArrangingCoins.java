package binarysearch;

import java.util.Scanner;

// 441. Arranging Coins
// Difficulty: Easy
// Topic: Binary Search (Search on Answer)
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class ArrangingCoins {

    public int arrangeCoins(int n) {
        long left = 0, right = n;
        long ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long used = mid * (mid + 1) / 2;

            if (used <= n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrangingCoins solution = new ArrangingCoins();

        System.out.print("Enter number of coins: ");
        int n = sc.nextInt();

        int result = solution.arrangeCoins(n);

        System.out.println("Complete rows: " + result);
        sc.close();
    }
}