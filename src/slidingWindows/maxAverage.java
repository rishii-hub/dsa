// LC 643 · Maximum Average Subarray I · Easy
// Trigger: fixed-size subarray of size k + maximum sum/average → fixed-size sliding window
// Key: maximum average = maximum sum of a window of size k / k
// First compute the sum of the first window, then slide by adding the new element and removing the old one
// Window length = k
// O(n) time, O(1) space

public class maxAverage {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = { 1, 2, 3, 5, 7, 5, 2 };
        int k = 4;
        int n = nums.length;
        // template
        // first window
        for (int i = 0; i < k; i++)
            sum += nums[i];

        // slide
        for (int i = k; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - k];
        }
    }
}
