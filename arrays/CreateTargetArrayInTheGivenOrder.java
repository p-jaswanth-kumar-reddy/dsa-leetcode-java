package arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// LeetCode: 1389. Create Target Array in the Given Order
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n²)
// Space Complexity: O(n)

public class CreateTargetArrayInTheGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] target = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }

        return target;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreateTargetArrayInTheGivenOrder solution =
                new CreateTargetArrayInTheGivenOrder();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] index = new int[n];

        System.out.println("Enter nums array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter index array:");
        for (int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }

        int[] result = solution.createTargetArray(nums, index);

        System.out.println("Target array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}