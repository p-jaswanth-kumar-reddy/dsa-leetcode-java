package arrays;

import java.util.Scanner;

// 238. Product of Array Except Self
// Difficulty: Medium
// Topic: Arrays (Prefix & Suffix Product)
// Time Complexity: O(n)
// Space Complexity: O(1) (excluding output array)

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Prefix products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductOfArrayExceptSelf solution =
                new ProductOfArrayExceptSelf();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = solution.productExceptSelf(nums);

        System.out.println("Product array:");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}