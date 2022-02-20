/*
 * @lc app=leetcode id=701 lang=java
 *
 * [701] Insert into a Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode dummy = root;

        while (dummy != null) {
            if (dummy.val < val) {
                if (dummy.right == null) {
                    dummy.right = new TreeNode(val);
                    return root;
                } else {
                    dummy = dummy.right;
                }
            } else {
                if (dummy.left == null) {
                    dummy.left = new TreeNode(val);
                    return root;
                } else {
                    dummy = dummy.left;
                }
            }
        }

        return root;
    }
}
// @lc code=end

