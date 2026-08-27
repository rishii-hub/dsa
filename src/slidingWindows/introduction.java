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

public class introduction {
    public static void main(String[] args) {
        System.out.println("h");
    }
}
