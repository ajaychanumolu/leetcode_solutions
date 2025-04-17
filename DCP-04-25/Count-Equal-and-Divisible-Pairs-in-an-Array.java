class Solution {
    public int countPairs(int[] nums, int k) {
        int n =nums.length ;
        int i ,j , count = 0 ;
        for(i = 0 ; i < n ; i++){
            for(j = i ; j < n ; j++){
                if(0 <= i && i < j && j < n && nums[i] == nums[j] && (i * j)%k == 0 ){
                    count ++ ;

                }
            }
        }
        return count ;
    }
}