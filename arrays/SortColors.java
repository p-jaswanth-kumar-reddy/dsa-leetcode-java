package arrays;

import java.util.Scanner;

// 75. Sort Colors
// Difficulty: Medium
// Topic: Arrays (Dutch National Flag Algorithm)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SortColors {

    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortColors solution = new SortColors();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements (0, 1, 2 only):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        solution.sortColors(nums);

        System.out.println("Sorted colors:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}