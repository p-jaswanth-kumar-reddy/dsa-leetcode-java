package arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// 1380. Lucky Numbers in a Matrix
// Difficulty: Easy
// Topic: Arrays / Matrix
// Time Complexity: O(m * n)
// Space Complexity: O(m + n)

public class LuckyNumbersInAMatrix {

    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rowMin = new int[m];
        int[] colMax = new int[n];

        // Initialize rowMin with max value
        for (int i = 0; i < m; i++) {
            rowMin[i] = Integer.MAX_VALUE;
        }

        // Find minimum in each row
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
            }
        }

        // Find maximum in each column
        for (int j = 0; j < n; j++) {
            colMax[j] = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        List<Integer> result = new ArrayList<>();

        // Check lucky numbers
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LuckyNumbersInAMatrix solution =
                new LuckyNumbersInAMatrix();

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        List<Integer> result = solution.luckyNumbers(matrix);

        System.out.println("Lucky numbers:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}