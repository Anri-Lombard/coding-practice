/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=0, right=n, mid;

        while (left < right) {
            mid = left + (right - left) / 2;

            boolean bad = isBadVersion(mid);
            if (bad) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
}
// @lc code=end

