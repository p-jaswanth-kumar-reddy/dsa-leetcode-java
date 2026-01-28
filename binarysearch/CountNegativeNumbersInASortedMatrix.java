package binarysearch;

import java.util.Scanner;

// 1351. Count Negative Numbers in a Sorted Matrix
// Difficulty: Easy
// Topic: Binary Search / Matrix
// Time Complexity: O(m log n)
// Space Complexity: O(1)

public class CountNegativeNumbersInASortedMatrix {

    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            int left = 0, right = n - 1;
            int firstNegativeIndex = n;

            // Binary search in each row
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (grid[i][mid] < 0) {
                    firstNegativeIndex = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            count += (n - firstNegativeIndex);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountNegativeNumbersInASortedMatrix solution =
                new CountNegativeNumbersInASortedMatrix();

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        System.out.println("Enter matrix elements (row & column sorted):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = solution.countNegatives(grid);

        System.out.println("Count of negative numbers: " + result);

        sc.close();
    }
}