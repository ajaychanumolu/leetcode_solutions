class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temps = new int[n];
        for(int i=0 ; i<nums.length ; i++){
            temps[(i+k)%nums.length] = nums[i];
        }
        for(int i= 0;i<n;i++){
            nums[i] = temps[i];
        }
    }
}