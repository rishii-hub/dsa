// LC 1004 · Max Consecutive Ones III · Medium
// Trigger: longest subarray + can flip at most k zeroes → variable-size sliding window
// Key: maintain a window containing at most k zeroes
// If zeroes > k → move l once and remove nums[l] if it was a zero
// Here `if` is enough because r adds at most one zero per iteration
// Answer = longest valid window
// O(n) time, O(1) space

import java.util.*;

public class maxConsecutive1s {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0 };
        int k = 2;
        int zero = 0;
        int l = 0;
        int maxLen = 0;
        for (int r = 0; r < nums.length; r++) {
            // count zeroes
            if (nums[r] == 0) {
                zero++;
            }

            // shrink if window has more than k zeroes
            if (zero > k) {
                if (nums[l] == 0) {
                    zero--;
                }
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        System.out.println(maxLen);
    }
}
