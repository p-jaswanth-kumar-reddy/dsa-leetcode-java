package arrays;

import java.util.Scanner;

// LeetCode: 1252. Cells with Odd Values in a Matrix
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n * m + k)
// Space Complexity: O(n + m)

public class CellsWithOddValuesInAMatrix {

    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rows[i] + cols[j]) % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CellsWithOddValuesInAMatrix solution =
                new CellsWithOddValuesInAMatrix();

        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        System.out.print("Enter number of indices: ");
        int k = sc.nextInt();

        int[][] indices = new int[k][2];
        System.out.println("Enter indices (row column):");
        for (int i = 0; i < k; i++) {
            indices[i][0] = sc.nextInt();
            indices[i][1] = sc.nextInt();
        }

        int result = solution.oddCells(m, n, indices);

        System.out.println("Number of cells with odd values: " + result);

        sc.close();
    }
}