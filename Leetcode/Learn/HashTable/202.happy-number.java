/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public int getNextSum(int n) {
        int copyn = n;
        int totalSum = 0;
        while (copyn > 0) {
            int lastDigit = copyn % 10;
            copyn /= 10;
            totalSum += lastDigit * lastDigit;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        while (n!=1 && n!=4) {
            n = getNextSum(n);
        }
        return n == 1;
    }
}
// @lc code=end

