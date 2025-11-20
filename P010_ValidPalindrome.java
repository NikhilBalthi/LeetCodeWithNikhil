/**
 * Problem 10: Valid Palindrome
 * Link: https://leetcode.com/problems/valid-palindrome/
 * 
 * Explanation:
 * Use two pointers from start and end. Ignore non-alphanumeric characters. Compare lowercase.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class P010_ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++; j--;
        }
        return true;
    }
}
