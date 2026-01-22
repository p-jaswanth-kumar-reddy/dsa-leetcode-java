package arrays;

import java.util.Scanner;

// LeetCode: 832. Flipping an Image
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n * m)
// Space Complexity: O(1)

public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        for (int i = 0; i < rows; i++) {
            int left = 0, right = cols - 1;

            while (left <= right) {
                if (left == right) {
                    image[i][left] ^= 1;
                } else {
                    int temp = image[i][left] ^ 1;
                    image[i][left] = image[i][right] ^ 1;
                    image[i][right] = temp;
                }
                left++;
                right--;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlippingAnImage solution = new FlippingAnImage();

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] image = new int[r][c];

        System.out.println("Enter image values (0 or 1):");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                image[i][j] = sc.nextInt();
            }
        }

        int[][] result = solution.flipAndInvertImage(image);

        System.out.println("Flipped and inverted image:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}