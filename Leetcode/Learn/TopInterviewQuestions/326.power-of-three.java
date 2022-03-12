/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        return ( n>0 &&  Math.pow(3, 19)%n==0);
    }
}
// @lc code=end

