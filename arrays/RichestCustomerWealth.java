package arrays;

import java.util.Scanner;

// LeetCode: 1672. Richest Customer Wealth
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(m * n)
// Space Complexity: O(1)

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RichestCustomerWealth solution = new RichestCustomerWealth();

        System.out.print("Enter number of customers: ");
        int m = sc.nextInt();

        System.out.print("Enter number of banks: ");
        int n = sc.nextInt();

        int[][] accounts = new int[m][n];

        System.out.println("Enter account balances:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        int result = solution.maximumWealth(accounts);

        System.out.println("Richest customer wealth: " + result);

        sc.close();
    }
}