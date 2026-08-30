// LC 2461 · Maximum Sum of Distinct Subarrays With Length K · Medium
// Trigger: fixed-size window + maximum sum + all elements distinct → sliding window + frequency map
// Key: maintain sum and frequency of every element in the current window
// Window size = k
// If frequency becomes 0 → remove from map
// Distinct window iff map.size() == k
// O(n) time, O(k) space

import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int l = 0;
        long sum = 0;
        long maxSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < nums.length; r++) {

            // Add right element
            sum += nums[r];
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            // Keep window size = k
            if (r >= k) {
                sum -= nums[l];

                map.put(nums[l], map.get(nums[l]) - 1);

                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }

                l++;
            }

            // All elements are distinct
            if (r - l + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}

// Example:
// nums = [9,9,9,1,2,3], k = 3
//
// [9,9,9] → map = {9=3} → not distinct
// [9,9,1] → map = {9=2,1=1} → not distinct
// [9,1,2] → map = {9=1,1=1,2=1} → distinct → sum = 12
// [1,2,3] → map = {1=1,2=1,3=1} → distinct → sum = 6
//
// Answer = 12