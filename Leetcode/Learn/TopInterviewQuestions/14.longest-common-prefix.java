/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return null;
        
        int minLength = Integer.MAX_VALUE;
        for (String str: strs) 
            minLength = Math.min(minLength, str.length());
        
        int low=0, high=minLength;

        while (low <= high) {
            int mid = (high + low)/2;
            if (isCommonPrefix(strs, mid))
                low = mid + 1;
            else    
                high = mid - 1;
        }
        return strs[0].substring(0, (high + low) / 2);
    }

    public boolean isCommonPrefix(String[] strs, int n) {
        String str1 = strs[0].substring(0, n);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(str1))
                return false;
        }
        return true;
    }
}
// @lc code=end

