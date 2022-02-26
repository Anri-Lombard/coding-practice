import java.util.*;
import java.util.stream.*;

/*
 * @lc app=leetcode id=658 lang=java
 *
 * [658] Find K Closest Elements
 */

// @lc code=start
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l=0, r=arr.length-k, m;

        while (l < r) {
            m = l + (r-l) / 2;
            if (x - arr[m] <= arr[m+k] - x) {
                r = m;
            } else {
                l = m+1;
            }
        }
        return Arrays.stream(arr, l, l+k).boxed().collect(Collectors.toList());
    }
}
// @lc code=end

