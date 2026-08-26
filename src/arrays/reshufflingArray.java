import java.util.*;

public class reshufflingArray {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] arr = new int[2 * n];

        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[i + n];
        }
        System.out.println(Arrays.toString(arr));
    }
}