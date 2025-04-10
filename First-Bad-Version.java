/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // binary search application
        int low , high , mid ;
        low = 1;
        high = n ;

        while(low <= high){
        mid = low + (high - low ) / 2;// to reduce over flow 
        if(isBadVersion(mid) == true){
             high = mid-1;   
        }else{
            low = mid + 1;
        }
        
        }

        return low ;
        
    }
}