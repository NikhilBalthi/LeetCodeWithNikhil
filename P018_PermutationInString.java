/**
 * Problem 18: Permutation in String
 * Link: https://leetcode.com/problems/permutation-in-string/
 *
 * Explanation:
 * Sliding window of length s1. Compare character counts with s1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(26) = O(1)
 */
public class P018_PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        for (char c : s1.toCharArray()) count[c - 'a']++;
        int left = 0, right = 0, n = s2.length(), len = s1.length();
        int[] window = new int[26];
        while (right < n) {
            window[s2.charAt(right) - 'a']++;
            if (right - left + 1 > len) window[s2.charAt(left++) - 'a']--;
            if (matches(count, window)) return true;
            right++;
        }
        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) if (a[i] != b[i]) return false;
        return true;
    }
}
