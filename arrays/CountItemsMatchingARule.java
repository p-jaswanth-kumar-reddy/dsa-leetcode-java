package arrays;

import java.util.Scanner;

// LeetCode: 1773. Count Items Matching a Rule
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class CountItemsMatchingARule {

    public int countMatches(String[][] items, String ruleKey, String ruleValue) {
        int index;

        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2; // name
        }

        int count = 0;
        for (String[] item : items) {
            if (item[index].equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountItemsMatchingARule solution =
                new CountItemsMatchingARule();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] items = new String[n][3];

        System.out.println("Enter items (type color name):");
        for (int i = 0; i < n; i++) {
            items[i][0] = sc.next();
            items[i][1] = sc.next();
            items[i][2] = sc.next();
        }

        sc.nextLine(); // consume newline
        System.out.print("Enter rule key (type/color/name): ");
        String ruleKey = sc.nextLine();

        System.out.print("Enter rule value: ");
        String ruleValue = sc.nextLine();

        int result = solution.countMatches(items, ruleKey, ruleValue);

        System.out.println("Matching items count: " + result);

        sc.close();
    }
}