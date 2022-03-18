/*
 * @lc app=leetcode id=334 lang=java
 *
 * [334] Increasing Triplet Subsequence
 */

// @lc code=start
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small=Integer.MAX_VALUE, big=Integer.MAX_VALUE;

        for (int n: nums) {
            if (n <= small) small = n;
            else if (n <= big) big = n;
            else return true;
        }
        return false;
    }
}
// @lc code=end

