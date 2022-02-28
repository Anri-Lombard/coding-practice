/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length, lastBuy=-prices[0], lastSold=0;

        for (int i=0; i<n; i++) {
            int currBuy = Math.max(lastBuy, lastSold-prices[i]);
            int currSold = Math.max(lastSold, lastBuy+prices[i]);

            lastBuy = currBuy;
            lastSold = currSold;
        }
        return lastSold;
    }
}
// @lc code=end

