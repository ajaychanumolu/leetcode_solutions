class Solution {
    public int countSymmetricIntegers(int low, int high) {
        // We can do it in 2 ways: brute force and optimal solution
        // Now let's do the optimal solution as 1 <= low <= high <= 10^4

        int c = 0;  // Initialize counter

        for (int i = low; i <= high; i++) {
            // 2-digit symmetric numbers (like 11, 22, ..., 99)
            if (i >= 10 && i <= 99 && i % 11 == 0) {
                c++;
            }
            // 4-digit numbers with equal sum of first two and last two digits
            else if (i >= 1000 && i <= 9999) {
                int fi = i / 1000;
                int se = (i / 100) % 10;
                int tr = (i / 10) % 10;
                int ft = i % 10;
                if ((fi + se) == (tr + ft)) {
                    c++;
                }
            }
        }
        return c;
    }
}
