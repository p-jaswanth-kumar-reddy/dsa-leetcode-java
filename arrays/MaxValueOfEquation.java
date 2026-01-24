package arrays;

import java.util.*;

// 1499. Max Value of Equation
// Difficulty: Hard
// Topic: Arrays / Sliding Window / Monotonic Deque
// Time Complexity: O(n)
// Space Complexity: O(n)

public class MaxValueOfEquation {

    public int findMaxValueOfEquation(int[][] points, int k) {
        // Deque will store indices of points, maintaining decreasing (y - x)
        Deque<Integer> dq = new ArrayDeque<>();
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];

            // Remove points whose x difference is more than k
            while (!dq.isEmpty() && x - points[dq.peekFirst()][0] > k) {
                dq.pollFirst();
            }

            // Calculate answer using the best candidate
            if (!dq.isEmpty()) {
                int j = dq.peekFirst();
                ans = Math.max(ans,
                        y + x + (points[j][1] - points[j][0]));
            }

            // Maintain deque decreasing by (y - x)
            while (!dq.isEmpty()
                    && (points[dq.peekLast()][1] - points[dq.peekLast()][0])
                    <= (y - x)) {
                dq.pollLast();
            }

            dq.offerLast(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxValueOfEquation solution = new MaxValueOfEquation();

        System.out.print("Enter number of points: ");
        int n = sc.nextInt();

        int[][] points = new int[n][2];
        System.out.println("Enter points (x y):");
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = solution.findMaxValueOfEquation(points, k);

        System.out.println("Maximum value of equation: " + result);

        sc.close();
    }
}