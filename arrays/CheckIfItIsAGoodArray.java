package arrays;

import java.util.Scanner;

// 1250. Check If It Is a Good Array
// Difficulty: Hard
// Topic: Arrays / Math (GCD)
// Time Complexity: O(n log M)
// Space Complexity: O(1)

public class CheckIfItIsAGoodArray {

    public boolean isGoodArray(int[] nums) {
        int gcd = nums[0];

        for (int i = 1; i < nums.length; i++) {
            gcd = gcd(gcd, nums[i]);
            if (gcd == 1) {
                return true;
            }
        }
        return gcd == 1;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckIfItIsAGoodArray solution =
                new CheckIfItIsAGoodArray();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = solution.isGoodArray(nums);

        System.out.println("Is good array: " + result);

        sc.close();
    }
}