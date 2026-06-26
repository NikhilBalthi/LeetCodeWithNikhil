package Normal;

public class FixedSize{

    public static void main(String[] args) {

        Solution sol = new Solution();

        String s = "abciidef";
        int k = 3;

        int result = sol.maxVowels(s, k);

        System.out.println(result);
    }
}

class Solution {

    public int maxVowels(String s, int k) {

        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {

            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int max = count;

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            // Add entering character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            // Remove leaving character
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    // private helper method
    private boolean isVowel(char ch) {

        return ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u';
    }
}