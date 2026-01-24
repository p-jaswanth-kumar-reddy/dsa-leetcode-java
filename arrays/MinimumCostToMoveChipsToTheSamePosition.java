package arrays;

import java.util.Scanner;

// 1217. Minimum Cost to Move Chips to The Same Position
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MinimumCostToMoveChipsToTheSamePosition {

    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even, odd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinimumCostToMoveChipsToTheSamePosition solution =
                new MinimumCostToMoveChipsToTheSamePosition();

        System.out.print("Enter number of chips: ");
        int n = sc.nextInt();

        int[] position = new int[n];
        System.out.println("Enter chip positions:");
        for (int i = 0; i < n; i++) {
            position[i] = sc.nextInt();
        }

        int result = solution.minCostToMoveChips(position);

        System.out.println("Minimum cost: " + result);

        sc.close();
    }
}