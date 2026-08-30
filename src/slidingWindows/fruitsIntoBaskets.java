import java.util.HashMap;

public class fruitsIntoBaskets {
    public static void main(String[] args) {

        int l = 0;
        int maxLen = 0;

        int[] arr = { 1, 2, 3, 2, 2 };

        HashMap<Integer, Integer> map = new HashMap<>();

        // At most 2 different fruit types

        for (int r = 0; r < arr.length; r++) {

            // Store latest index of fruit
            map.put(arr[r], r);

            // More than 2 fruit types
            if (map.size() > 2) {

                int rem = arr[l];

                l = map.get(rem) + 1;

                map.remove(rem);
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        System.out.println(maxLen);
    }
}