/**
 * Problem: Remove Duplicates from Sorted Array II
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 *
 * Explanation:
 * Since the array is sorted, allow each element to appear at most twice.
 * Maintain a pointer (indexCount) for the position of the next valid element.
 * Starting from index 2, compare the current element with the element
 * two positions before indexCount. If they are different, place the
 * current element at indexCount and increment indexCount.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class P021_RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int indexCount = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[indexCount - 2]) {
                nums[indexCount] = nums[i];
                indexCount++;
            }
        }

        return indexCount;
    }
}
