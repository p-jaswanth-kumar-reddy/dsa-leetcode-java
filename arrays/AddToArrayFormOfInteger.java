package arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// 989. Add to Array-Form of Integer
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)

public class AddToArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;
        int carry = k;

        while (i >= 0 || carry > 0) {
            if (i >= 0) {
                carry += num[i];
                i--;
            }
            result.add(0, carry % 10);
            carry /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddToArrayFormOfInteger solution =
                new AddToArrayFormOfInteger();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] num = new int[n];
        System.out.println("Enter array digits:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter integer k: ");
        int k = sc.nextInt();

        List<Integer> result = solution.addToArrayForm(num, k);

        System.out.println("Result:");
        for (int digit : result) {
            System.out.print(digit + " ");
        }

        sc.close();
    }
}