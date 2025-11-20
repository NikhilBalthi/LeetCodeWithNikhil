/**
 * Problem 8: Encode and Decode Strings
 * Link: https://leetcode.com/problems/encode-and-decode-strings/
 * 
 * Explanation:
 * Encode strings by prefixing length + delimiter. Decode by reading length first.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
import java.util.*;

public class P008_EncodeAndDecodeStrings {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) sb.append(s.length()).append('#').append(s);
        return sb.toString();
    }
    
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') j++;
            int len = Integer.parseInt(s.substring(i, j));
            res.add(s.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }
        return res;
    }
}
