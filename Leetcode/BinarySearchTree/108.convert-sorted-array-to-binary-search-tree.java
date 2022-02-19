/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public static TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) return null;

        if (left == right) return new TreeNode(nums[left]);

        int mid = ((left + right + 1)/2);

        TreeNode head = new TreeNode(nums[mid]);
        head.left = sortedArrayToBST(nums, left, mid - 1);
        head.right = sortedArrayToBST(nums, mid + 1, right);

        return head;
    }
}
// @lc code=end

