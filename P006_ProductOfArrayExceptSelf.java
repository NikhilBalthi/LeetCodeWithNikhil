/**
 * Problem 6: Product of Array Except Self
 * Link: https://leetcode.com/problems/product-of-array-except-self/
 * 
 * Explanation:
 * Use prefix and suffix product arrays. Multiply prefix[i-1] * suffix[i+1].
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) extra (ignoring output)
 */
public class P006_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) res[i] = res[i - 1] * nums[i - 1];
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res;
    }
}
