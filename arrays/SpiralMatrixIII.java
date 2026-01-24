package arrays;

import java.util.Scanner;

// 885. Spiral Matrix III
// Difficulty: Medium
// Topic: Arrays / Matrix (Simulation)
// Time Complexity: O(R * C)
// Space Complexity: O(R * C)

public class SpiralMatrixIII {

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int idx = 0;

        int r = rStart, c = cStart;
        result[idx++] = new int[] { r, c };

        int step = 1;

        while (idx < rows * cols) {

            // move right
            for (int i = 0; i < step; i++) {
                c++;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    result[idx++] = new int[] { r, c };
                }
            }

            // move down
            for (int i = 0; i < step; i++) {
                r++;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    result[idx++] = new int[] { r, c };
                }
            }

            step++;

            // move left
            for (int i = 0; i < step; i++) {
                c--;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    result[idx++] = new int[] { r, c };
                }
            }

            // move up
            for (int i = 0; i < step; i++) {
                r--;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    result[idx++] = new int[] { r, c };
                }
            }

            step++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpiralMatrixIII solution = new SpiralMatrixIII();

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        System.out.print("Enter start row: ");
        int rStart = sc.nextInt();

        System.out.print("Enter start column: ");
        int cStart = sc.nextInt();

        int[][] result = solution.spiralMatrixIII(rows, cols, rStart, cStart);

        System.out.println("Spiral order coordinates:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }

        sc.close();
    }
}