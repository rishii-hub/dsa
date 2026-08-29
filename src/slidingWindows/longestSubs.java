// LC 3 · Longest Substring Without Repeating Characters · Medium
// Trigger: longest substring + no repeating characters → variable-size sliding window
// Key: HashMap stores the last index of each character
// If duplicate is found → jump l to previous index + 1
// Math.max prevents l from moving backward
// Window = [l ... r]// O(n) time, O(min(n, charset)) space

import java.util.*;

public class longestSubs {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int maxLen = 0;
        String s = "abcdababa";

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            // duplicate l / found? jump
            if (map.containsKey(ch)) {
                l = Math.max(l, map.get(ch) + 1);
            }
            // store latest index
            map.put(ch, r);
            // update max window length
            maxLen = Math.max(maxLen, r - l + 1);
        }
        System.out.println(maxLen);
    }
}
