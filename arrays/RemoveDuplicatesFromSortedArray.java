package arrays;

import java.util.Scanner;

// 26. Remove Duplicates from Sorted Array
// Difficulty: Easy
// Topic: Arrays (Two Pointers)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // pointer for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoveDuplicatesFromSortedArray solution =
                new RemoveDuplicatesFromSortedArray();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = solution.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}