import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxLen = 0;
        int maxf = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            map.put(ch, 0);
        }

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            map.put(ch, map.get(ch) + 1);

            maxf = Math.max(maxf, map.get(ch));

            while ((r - l + 1) - maxf > k) {
                char left = s.charAt(l);
                map.put(left, map.get(left) - 1);
                l++;

                // Recompute max frequency
                maxf = 0;
                for (char c = 'A'; c <= 'Z'; c++) {
                    maxf = Math.max(maxf, map.get(c));
                }
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}