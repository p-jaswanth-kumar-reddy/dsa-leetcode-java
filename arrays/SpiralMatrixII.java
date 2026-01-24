package arrays;

import java.util.Scanner;

// 59. Spiral Matrix II
// Difficulty: Medium
// Topic: Arrays / Matrix
// Time Complexity: O(n²)
// Space Complexity: O(1) (output matrix not counted)

public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {

            // left → right
            for (int j = left; j <= right; j++) {
                matrix[top][j] = num++;
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // right → left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = num++;
                }
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpiralMatrixII solution = new SpiralMatrixII();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[][] result = solution.generateMatrix(n);

        System.out.println("Spiral Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}