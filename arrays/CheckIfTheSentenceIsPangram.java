package arrays;

import java.util.Scanner;

// LeetCode: 1832. Check if the Sentence Is Pangram
// Difficulty: Easy
// Topic: Strings / Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }

        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckIfTheSentenceIsPangram solution =
                new CheckIfTheSentenceIsPangram();

        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        boolean result = solution.checkIfPangram(sentence);

        System.out.println("Is pangram: " + result);

        sc.close();
    }
}