/**
 * Problem 17: Longest Repeating Character Replacement
 * Link: https://leetcode.com/problems/longest-repeating-character-replacement/
 *
 * Explanation:
 * Sliding window. Keep track of the count of the most frequent char in the window.
 * Window size - maxCount > k → shrink window.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(26) = O(1)
 */
public class P017_LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0, left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(right) - 'A']);
            while (right - left + 1 - maxCount > k) count[s.charAt(left++) - 'A']--;
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
