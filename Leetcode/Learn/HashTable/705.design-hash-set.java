/*
 * @lc app=leetcode id=705 lang=java
 *
 * [705] Design HashSet
 */

// @lc code=start
class MyHashSet {
    /**
     * Time: O(1)/O(N)
     * Space: O(N)
     */

    private final int MAX_VALUE = 1000000;
    private final int ARRAY_SIZE = 100;
    private List<List<Integer>> parentList;

    public MyHashSet() {
        parentList = new ArrayList<>(ARRAY_SIZE);
        for (int i=0; i<ARRAY_SIZE; i++) {
            parentList.add(null);
        }
    }
    
    public void add(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        if (childList == null) {
            List<Integer> newList = new LinkedList<Integer>();
            newList.add(key);
            parentList.set(index, newList);
        } else {
            if (!childList.contains(key)) {
                childList.add(key);
            }
        }
    }
    
    public void remove(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        if (childList != null) {
            childList.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        return childList != null && childList.contains(key);
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

