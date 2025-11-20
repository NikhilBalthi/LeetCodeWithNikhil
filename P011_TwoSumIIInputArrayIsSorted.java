/**
 * Problem 11: Two Sum II - Input Array Is Sorted
 * Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * Explanation:
 * Use two pointers: one at the start, one at the end. Move pointers based on sum comparison.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class P011_TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) return new int[]{left + 1, right + 1};
            if (sum < target) left++;
            else right--;
        }
        return new int[]{};
    }
}
