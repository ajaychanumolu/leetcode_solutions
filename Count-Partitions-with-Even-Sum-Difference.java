class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;

        long totalSum = 0;
        for (int x : nums) totalSum += x;

        int count = 0;
        long prefixSum = 0;
        for (int i = 0; i < n - 1; i++) {
            prefixSum += nums[i];
            long suffixSum = totalSum - prefixSum;
            if ((prefixSum & 1) == (suffixSum & 1)) count++;
        }
        return count;
    }
}
