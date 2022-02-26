/*
 * @lc app=leetcode id=744 lang=java
 *
 * [744] Find Smallest Letter Greater Than Target
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0, h=letters.length;

        while (l < h) {
            int m = l + (h-l) / 2;
            if (letters[m] <= target) l = m + 1;
            else h = m;
        }
        return letters[l % letters.length];
    }
}
// @lc code=end

