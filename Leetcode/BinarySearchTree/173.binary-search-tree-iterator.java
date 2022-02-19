/*
 * @lc app=leetcode id=173 lang=java
 *
 * [173] Binary Search Tree Iterator
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
class BSTIterator {
    private Stack<TreeNode> stack = null;

    public BSTIterator(TreeNode root) {
        this.stack = new Stack<TreeNode>();

        while(root != null) {
            this.stack.push(root);
            root = root.left;
        }
    }
    
    /**@return next smallest element */
    public int next() {
        TreeNode a = this.stack.pop();

        if (a.right != null) {
            this.stack.push(a.right);

            TreeNode b = a.right.left;
            while (b != null) {
                this.stack.push(b);
                b = b.left;
            }
        }
        return a.val;
    }
    
    /**@return if we have a next smallest element */
    public boolean hasNext() {
        return !this.stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end

