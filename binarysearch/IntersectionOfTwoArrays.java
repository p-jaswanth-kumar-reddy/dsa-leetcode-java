package binarysearch;

import java.util.*;

// 349. Intersection of Two Arrays
// Difficulty: Easy
// Topic: Binary Search
// Time Complexity: O(n log n + m log m)
// Space Complexity: O(n)

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array for fewer searches
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }

        Arrays.sort(nums2);
        Set<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            if (binarySearch(nums2, num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int idx = 0;
        for (int val : resultSet) {
            result[idx++] = val;
        }
        return result;
    }

    private boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntersectionOfTwoArrays solution =
                new IntersectionOfTwoArrays();

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = solution.intersection(nums1, nums2);

        System.out.println("Intersection:");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}