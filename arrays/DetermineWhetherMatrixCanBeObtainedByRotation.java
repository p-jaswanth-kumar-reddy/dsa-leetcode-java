package arrays;

import java.util.Scanner;

// 1886. Determine Whether Matrix Can Be Obtained By Rotation
// Difficulty: Easy
// Topic: Arrays / Matrix
// Time Complexity: O(n²)
// Space Complexity: O(1)

public class DetermineWhetherMatrixCanBeObtainedByRotation {

    public boolean findRotation(int[][] mat, int[][] target) {

        for (int r = 0; r < 4; r++) {
            if (isEqual(mat, target)) {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    private int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }

    private boolean isEqual(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DetermineWhetherMatrixCanBeObtainedByRotation solution =
                new DetermineWhetherMatrixCanBeObtainedByRotation();

        System.out.print("Enter matrix size (n): ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        int[][] target = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter target matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                target[i][j] = sc.nextInt();
            }
        }

        boolean result = solution.findRotation(mat, target);

        System.out.println("Can be obtained by rotation: " + result);

        sc.close();
    }
}