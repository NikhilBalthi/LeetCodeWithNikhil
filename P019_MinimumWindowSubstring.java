/**
 * Problem 19: Minimum Window Substring
 * Link: https://leetcode.com/problems/minimum-window-substring/
 *
 * Explanation:
 * Sliding window with character count map. Expand right until window covers T, shrink left to minimize.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(128) = O(1)
 */
import java.util.*;

public class P019_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";
        int[] need = new int[128], window = new int[128];
        for (char c : t.toCharArray()) need[c]++;
        int left = 0, right = 0, start = 0, minLen = Integer.MAX_VALUE, formed = 0, required = t.length();
        while (right < s.length()) {
            char c = s.charAt(right);
            if (need[c] > 0 && window[c] < need[c]) formed++;
            window[c]++;
            while (formed == required) {
                if (right - left + 1 < minLen) { minLen = right - left + 1; start = left; }
                char cl = s.charAt(left);
                if (need[cl] > 0 && window[cl] <= need[cl]) formed--;
                window[cl]--;
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
