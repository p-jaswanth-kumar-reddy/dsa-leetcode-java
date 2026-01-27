package binarysearch;

import java.util.Scanner;

// 744. Find Smallest Letter Greater Than Target
// Difficulty: Easy
// Topic: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Wrap around if no greater character is found
        return letters[left % letters.length];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindSmallestLetterGreaterThanTarget solution =
                new FindSmallestLetterGreaterThanTarget();

        System.out.print("Enter number of letters: ");
        int n = sc.nextInt();

        char[] letters = new char[n];
        System.out.println("Enter sorted letters:");
        for (int i = 0; i < n; i++) {
            letters[i] = sc.next().charAt(0);
        }

        System.out.print("Enter target character: ");
        char target = sc.next().charAt(0);

        char result = solution.nextGreatestLetter(letters, target);

        System.out.println("Smallest letter greater than target: " + result);

        sc.close();
    }
}