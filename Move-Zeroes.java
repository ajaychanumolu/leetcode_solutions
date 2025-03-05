class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2){
            return;
        }
        int r = 0;
        int l = 0;
        
        while(r < nums.length){
            if(nums[l] != 0 ){
                r++;
                l++;
            }
            else if(nums[r] == 0){
                r++;
            }
            else {
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l]=temp;
            }
            
        }
        
    }

    
}