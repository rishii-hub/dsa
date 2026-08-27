// LC 189 · Rotate Array · Medium
// Trigger: rotate array right by k positions → reversal algorithm
// Key:
// 1. Reverse entire array
// 2. Reverse first k elements
// 3. Reverse remaining n-k elements
// Example:
// [1,2,3,4,5,6,7], k=3
// Reverse all      → [7,6,5,4,3,2,1]
// Reverse first 3  → [5,6,7,4,3,2,1]
// Reverse rest     → [5,6,7,1,2,3,4]
// Important: k %= n → handles k > n
// O(n) time, O(1) space

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int n = nums.length;
        int k = 3;

        k = k % n;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
