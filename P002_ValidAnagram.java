/**
 * Problem 2: Valid Anagram
 * Link: https://leetcode.com/problems/valid-anagram/
 * 
 * Explanation:
 * Two strings are anagrams if they have the same character counts.
 * Use an int[26] array to count characters in s, decrement for t. Check all counts are zero.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
import java.util.Arrays;

public class P002_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) count[c - 'a']--;
        for (int c : count) if (c != 0) return false;
        return true;
    }
}
