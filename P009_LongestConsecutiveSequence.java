/**
 * Problem 9: Longest Consecutive Sequence
 * Link: https://leetcode.com/problems/longest-consecutive-sequence/
 * 
 * Explanation:
 * Use a HashSet to check for starts of sequences. Expand sequences from each start.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
import java.util.*;

public class P009_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curr = num, streak = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    streak++;
                }
                longest = Math.max(longest, streak);
            }
        }
        return longest;
    }
}
