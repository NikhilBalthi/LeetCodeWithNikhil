/**
 * Problem 14: Trapping Rain Water
 * Link: https://leetcode.com/problems/trapping-rain-water/
 *
 * Explanation:
 * Use two pointers and track leftMax and rightMax. Calculate trapped water at each index.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class P014_TrappingRainWater {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) leftMax = height[left];
                else water += leftMax - height[left];
                left++;
            } else {
                if (height[right] >= rightMax) rightMax = height[right];
                else water += rightMax - height[right];
                right--;
            }
        }
        return water;
    }
}
