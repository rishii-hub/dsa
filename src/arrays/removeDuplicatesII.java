// LC 80 · Remove Duplicates from Sorted Array II · Medium
// Trigger: sorted array + keep each element at most twice → two pointers
// Key: nums[i] != nums[k - 2] → prevents a 3rd occurrence
// O(n) time, O(1) space

import java.util.Arrays;

public class removeDuplicatesII {
    public static void main(String[] args) {
        int k = 2;
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(k);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
