/**
 * Problem 4: Group Anagrams
 * Link: https://leetcode.com/problems/group-anagrams/
 * 
 * Explanation:
 * Sort each string and use it as a key in a HashMap to group anagrams.
 *
 * Time Complexity: O(n * k log k), k = average word length
 * Space Complexity: O(n * k)
 */
import java.util.*;

public class P004_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, x -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
