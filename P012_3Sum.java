/**
 * Problem 12: 3Sum
 * Link: https://leetcode.com/problems/3sum/
 *
 * Explanation:
 * Sort array, then use two pointers for each element to find triplets summing to zero. Skip duplicates.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
import java.util.*;

public class P012_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right-1]) right--;
                    left++; right--;
                } else if (sum < 0) left++;
                else right--;
            }
        }
        return res;
    }
}
