/**
 * Problem 5: Top K Frequent Elements
 * Link: https://leetcode.com/problems/top-k-frequent-elements/
 * 
 * Explanation:
 * Count frequencies in a HashMap. Use a min-heap (PriorityQueue) to keep top K elements.
 *
 * Time Complexity: O(n log k)
 * Space Complexity: O(n)
 */
import java.util.*;

public class P005_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);
        
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));
        for (int num : freq.keySet()) {
            heap.offer(num);
            if (heap.size() > k) heap.poll();
        }
        
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) res[i] = heap.poll();
        return res;
    }
}
