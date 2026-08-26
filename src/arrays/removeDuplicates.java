// LC 26 · Remove Duplicates from Sorted Array · Easy
// Trigger: sorted array + remove duplicates in-place → two pointers
// Missed: nothing, first try
// Arrays.copyOf(array, length)
// Creates a new array containing the first `length` elements
// O(n) time, O(1) space

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 4, 5 };
        int k = 0;
        for (int i = k + 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                k++;
                nums[k] = nums[i];
            }
        }
        System.out.println(k + 1);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k + 1)));
    }
}
