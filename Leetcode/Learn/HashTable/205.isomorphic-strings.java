/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    private String transformedString(String s) {
        Map<Character, Integer> indexMap = new HashMap<Character, Integer>();
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (!indexMap.containsKey(c)) {
                indexMap.put(c, i);
            }

            builder.append(Integer.toString(indexMap.get(c)));
            builder.append(" ");
        }
        return builder.toString();
    }

    public boolean isIsomorphic(String s, String t) {
        return transformedString(s).equals(transformedString(t));
    }
}
// @lc code=end

