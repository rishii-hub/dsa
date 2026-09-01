/*PATTERN
-------
Sliding Window + HashMap Frequency

RECOGNITION
-----------
- Longest substring
- Contiguous
- At most K distinct characters

CORE IDEA
---------
left = 0
right = 0 → n-1
HashMap:
Character → frequency

map.size() = number of distinct characters */

import java.util.HashMap;

public class LongestSubstringKCharacters {
    public static void main(String[] args) {

        String s = "aaabbccd";
        int k = 2;

        int left = 0;
        int maxLen = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        // building first window
        for (int right = 0; right < s.length(); right++) {

            // adding first character
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // too many distincts
            while (map.size() > k) {

                char leftchar = s.charAt(left);

                // removing frequency and then key
                map.put(leftchar, map.get(leftchar) - 1);

                if (map.get(leftchar) == 0) {
                    map.remove(leftchar);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println(maxLen);

    }
}
