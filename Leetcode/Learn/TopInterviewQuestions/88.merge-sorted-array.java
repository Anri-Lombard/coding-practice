/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Skip elements already in array 1, append elements from array 2
        for (int i=0; i<n+m; i++) {
            if (i >= m) {
                nums1[i] = nums2[i - m];
            }
        }

        Arrays.sort(nums1);
    }
}
// @lc code=end

