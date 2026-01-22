package arrays;

import java.util.Scanner;

// 566. Reshape the Matrix
// Difficulty: Easy
// Topic: Arrays / Matrix
// Time Complexity: O(m * n)
// Space Complexity: O(m * n)

public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];
        int row = 0, col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReshapeTheMatrix solution =
                new ReshapeTheMatrix();

        System.out.print("Enter original rows: ");
        int m = sc.nextInt();

        System.out.print("Enter original columns: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter reshaped rows (r): ");
        int r = sc.nextInt();

        System.out.print("Enter reshaped columns (c): ");
        int c = sc.nextInt();

        int[][] result = solution.matrixReshape(mat, r, c);

        System.out.println("Reshaped matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}