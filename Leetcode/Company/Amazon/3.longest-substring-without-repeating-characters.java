import java.util.HashSet;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet<Character>(), prevChars = new HashSet<Character>();
        int longestLength = 0, len;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            chars.add(ch);
            len = chars.size();
            System.out.println(chars + " " + prevChars);
            
            if (len > longestLength && !prevChars.contains(ch)) {
                longestLength = len;
            }
            
            if (prevChars.contains(ch)) {
                chars.clear();
                prevChars.clear();
            }
            
            prevChars.add(ch);
        }
        return longestLength;
    }
}
// @lc code=end

