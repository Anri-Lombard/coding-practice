/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        if (n<3)
            return 0;

        boolean[] f = new boolean[n];

        // assume only half of all the numbers are candidates since 
        // half are even numbers
        int count = n/2;

        // only loop through prime candidates
        for (int i=3; i * i < n; i += 2) {
            // if true it is composite
            if (f[i])
                continue;

            // all j += 2 * i are odd, therefore are prime candidates
            for (int j=i*i; j<n; j += 2 * i) {
                if (!f[j]) {
                    count--;
                    f[j] = true;
                }
            }
        }
        return count;
    }
}
// @lc code=end

