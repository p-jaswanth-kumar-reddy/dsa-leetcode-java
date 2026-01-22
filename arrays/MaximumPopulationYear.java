package arrays;

import java.util.Scanner;

// 1854. Maximum Population Year
// Difficulty: Easy
// Topic: Arrays (Prefix Sum / Difference Array)
// Time Complexity: O(n + R)  [R = year range]
// Space Complexity: O(R)

public class MaximumPopulationYear {

    public int maximumPopulation(int[][] logs) {
        int[] diff = new int[101]; // years 1950 to 2050

        for (int[] log : logs) {
            diff[log[0] - 1950]++;
            diff[log[1] - 1950]--;
        }

        int maxPop = 0;
        int year = 1950;
        int curr = 0;

        for (int i = 0; i < diff.length; i++) {
            curr += diff[i];
            if (curr > maxPop) {
                maxPop = curr;
                year = 1950 + i;
            }
        }
        return year;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaximumPopulationYear solution =
                new MaximumPopulationYear();

        System.out.print("Enter number of logs: ");
        int n = sc.nextInt();

        int[][] logs = new int[n][2];
        System.out.println("Enter birth and death years:");
        for (int i = 0; i < n; i++) {
            logs[i][0] = sc.nextInt();
            logs[i][1] = sc.nextInt();
        }

        int result = solution.maximumPopulation(logs);

        System.out.println("Maximum population year: " + result);

        sc.close();
    }
}