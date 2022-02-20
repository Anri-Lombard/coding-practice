/*
 * @lc app=leetcode id=705 lang=java
 *
 * [705] Design HashSet
 */

// @lc code=start
class MyHashSet {

    private int size;
    private TreeNode[] nodes;

    public MyHashSet() {
        this.size = 100;
        this.nodes = new TreeNode[size];
    }
    
    public void add(int key) {
        int index = key % this.size;

        if (this.nodes[index] == null) {
            this.nodes[index] = new TreeNode(key);
            return;
        } else {
            TreeNode p = this.nodes[index];
            while (p != null && p.val != key) {
                p = p.next();
            }

            if (p != null) {
                return;
            }

            TreeNode newHead = new TreeNode(key);
            newHead.next = this.nodes[index];
            this.nodes[index] = newHead;
        }
    }
    
    public void remove(int key) {
        int index = key % this.size;

        if (this.nodes[index] == null)
            return;
        else {
            TreeNode p = this.nodes[index];

            if (p.val == key) {
                this.nodes[index] = p.next();
                return;
            }

            while (p.next != null && p.next.val != key) {
                p = p.next();
            }
            if (p.next == null)
                return;
            
            p.next = p.next.next;
        }
        
    }
    
    public boolean contains(int key) {
        int index = key % this.size;

        if (this.nodes[index] == null) {
            return false;
        }

        TreeNode p = this.nodes[index];
        while (p != null && p.val != key) {
            p = p.next;
        }

        return p != null;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
// @lc code=end

