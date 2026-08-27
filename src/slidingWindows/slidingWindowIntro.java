// TYPES OF SLIDING WINDOW QUESTIONS:

// 1. CONSTANT WINDOW
// Given k → find something inside every window of size k
// Example: maximum sum of subarray of size k
// Pattern:
// [1, 2, 3] → [2, 3, 4] → [3, 4, 5]
// Add new element, remove outgoing element
// Window size always remains k

// 2. LONGEST SUBARRAY / SUBSTRING WITH <CONDITION>
// Example: longest subarray with sum <= k
// Pattern:
// Expand right → condition becomes invalid → shrink from left
// Keep track of maximum valid window
// Window size is variable

// 3. COUNT SUBARRAYS / SUBSTRINGS WITH <CONDITION>
// Example: number of subarrays with sum <= k
// Maintain a valid window and count valid ranges
// Often answer uses: r - l + 1

// 4. SMALLEST / MINIMUM WINDOW WITH <CONDITION>
// Example: minimum window substring
// Expand right until condition is satisfied
// Shrink left while condition remains satisfied
// Keep track of minimum valid window

public class slidingWindowIntro {

    // 1. Constant-size window
    // Find maximum sum of subarray of size k
    static int maxSum(int[] arr, int k) {

        int n = arr.length;
        int sum = 0;
        int maxSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        maxSum = sum;

        // Slide the window
        for (int r = k; r < n; r++) {
            sum += arr[r]; // add new element
            sum -= arr[r - k]; // remove old element

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    // 2. Variable-size window
    // Longest subarray with sum <= k
    // Works with non-negative numbers
    static int longestSubarray(int[] arr, int k) {

        int n = arr.length;
        int l = 0;
        int sum = 0;
        int maxLen = 0;

        for (int r = 0; r < n; r++) {

            sum += arr[r];

            while (sum > k) {
                sum -= arr[l];
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 5, 1, 10, 10 };

        System.out.println(maxSum(arr, 3));

        System.out.println(longestSubarray(arr, 14));
    }
}