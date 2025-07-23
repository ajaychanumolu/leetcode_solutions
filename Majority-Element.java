class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0 ; i<nums.length ;i++){
            int updatedCount = count.getOrDefault(nums[i], 0) + 1 ;
            count.put(nums[i], updatedCount);
            if (updatedCount > nums.length / 2) {
                return nums[i];
            }
        }

     return -1;

    }
}