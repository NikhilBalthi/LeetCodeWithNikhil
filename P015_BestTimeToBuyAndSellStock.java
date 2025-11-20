/**
 * Problem 15: Best Time to Buy and Sell Stock
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * Explanation:
 * Track the minimum price seen so far and the max profit at each step.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class P015_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
