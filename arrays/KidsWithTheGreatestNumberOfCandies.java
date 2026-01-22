package arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// LeetCode: 1431. Kids With the Greatest Number of Candies
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KidsWithTheGreatestNumberOfCandies solution =
                new KidsWithTheGreatestNumberOfCandies();

        System.out.print("Enter number of kids: ");
        int n = sc.nextInt();

        int[] candies = new int[n];
        System.out.println("Enter candies for each kid:");
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }

        System.out.print("Enter extra candies: ");
        int extraCandies = sc.nextInt();

        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);

        System.out.println("Result:");
        for (boolean b : result) {
            System.out.print(b + " ");
        }

        sc.close();
    }
}