/**
 * Problem 20: Sliding Window Maximum
 * Link: https://leetcode.com/problems/sliding-window-maximum/
 *
 * Explanation:
 * Use a deque to store indices of useful elements. Front of deque is max in current window.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 */
import java.util.*;

public class P020_SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peek() < i - k + 1) dq.poll();
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
            dq.offer(i);
            if (i >= k - 1) res[i - k + 1] = nums[dq.peek()];
        }
        return res;
    }
}
