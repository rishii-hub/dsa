// LC 1423 · Maximum Points You Can Obtain from Cards · Medium
// Pattern: complement + fixed-size sliding window
// Trigger: take k cards from either end
// Key idea: leave n-k cards in the middle → find minimum-sum window
// TC: O(n) | SC: O(1)

public class maxScore {

    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int totalSum = 0;
        for (int num : cardPoints) {
            totalSum += num;
        }

        int windowSize = n - k;

        if (windowSize == 0) {
            return totalSum;
        }

        int sum = 0;
        int i = 0;
        int j = 0;

        // Build first window
        while (j < windowSize) {
            sum += cardPoints[j];
            j++;
        }

        int min = sum;

        // Slide the window
        while (j < n) {
            sum += cardPoints[j]; // entering
            sum -= cardPoints[i]; // leaving

            min = Math.min(sum, min);

            i++;
            j++;
        }

        return totalSum - min;
    }

    public static void main(String[] args) {
        int[] cardPoints = { 1, 2, 3, 4, 5, 6, 1 };
        int k = 3;

        System.out.println(maxScore(cardPoints, k));
    }
} 