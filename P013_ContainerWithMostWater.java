/**
 * Problem 13: Container With Most Water
 * Link: https://leetcode.com/problems/container-with-most-water/
 *
 * Explanation:
 * Use two pointers from start and end. Move the shorter pointer inward to maximize area.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class P013_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }
}
