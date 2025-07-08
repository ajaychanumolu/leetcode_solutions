class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] current = new int[nums.length];
        current[current.length - 1] = 1 ;

        for(int i = current.length - 2 ; i >= 0 ; i-- ){
            for(int j = i+1 ; j<current.length ; j++){
                if ( nums[i] <  nums[j]){
                    current[i] = Math.max(current[i] , 1 + current[j]);
                }
            }
            if(current[i] == 0){
                current[i] = 1;
            }
            }
        int largest = 0 ;
        for(int i = 0; i < current.length ; i++){
            largest = Math.max(largest , current[i]);
        } 

        return largest ;

    } 
}