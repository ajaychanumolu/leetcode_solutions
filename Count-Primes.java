class Solution {
    public int countPrimes(int n) {
        boolean[] comp = new boolean[n];
        for(int i = 2 ; i< Math.sqrt(n) ;i++){
            if(comp[i] == false){
                for(int j = 2 ; j*i < n ; j++){
                    comp[i*j] = true ; 
                }
            }
        }
        int primecounter = 0 ;
        for(int i = 2 ; i<n ;i++){
            if(comp[i] == false){
                primecounter ++;
            }
        }
    return primecounter ;
    }
}