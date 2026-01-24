package binarysearch;

import java.util.Scanner;

// 69. Sqrt(x)
// Difficulty: Easy
// Topic: Binary Search (Search on Answer)
// Time Complexity: O(log x)
// Space Complexity: O(1)

public class SqrtX {

    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SqrtX solution = new SqrtX();

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.println("Square root (floor): " + solution.mySqrt(x));
        sc.close();
    }
}