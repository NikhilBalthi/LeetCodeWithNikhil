/**
 * Problem 3: Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * 
 * Explanation:
 * Use a HashMap to store numbers and their indices.
 * For each number, check if (target - num) exists in the map.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
import java.util.HashMap;
import java.util.Map;

public class P003_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
