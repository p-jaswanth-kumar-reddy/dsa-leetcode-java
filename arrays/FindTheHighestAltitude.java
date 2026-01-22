package arrays;

import java.util.Scanner;

// LeetCode: 1732. Find the Highest Altitude
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindTheHighestAltitude solution =
                new FindTheHighestAltitude();

        System.out.print("Enter size of gain array: ");
        int n = sc.nextInt();

        int[] gain = new int[n];
        System.out.println("Enter gain values:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int result = solution.largestAltitude(gain);

        System.out.println("Highest altitude: " + result);

        sc.close();
    }
}