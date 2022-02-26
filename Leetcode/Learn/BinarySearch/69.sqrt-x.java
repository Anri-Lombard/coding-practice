/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        } else {
            return binarySearch(x);
        }
    }

    static int binarySearch(int x) {
        int left=1, right=x/2, mid, ans=0;
        long temp;

        while (left <= right) {
            mid = left + (right - left) / 2;
            temp = (long)mid * (long)mid;

            if (temp == x) return mid;
            if (temp < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
// @lc code=end

