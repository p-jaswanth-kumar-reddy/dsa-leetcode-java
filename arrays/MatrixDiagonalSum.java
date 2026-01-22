package arrays;

import java.util.Scanner;

// 1572. Matrix Diagonal Sum
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixDiagonalSum solution = new MatrixDiagonalSum();

        System.out.print("Enter matrix size (n): ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int result = solution.diagonalSum(mat);
        System.out.println("Diagonal sum: " + result);

        sc.close();
    }
}