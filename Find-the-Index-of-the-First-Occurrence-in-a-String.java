class Solution {
    public int strStr(String haystack, String needle) {
        for(int i =0 ; i<haystack.length()-needle.length() + 1   ; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
            for(int j = 0 ; j<needle.length() ; j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break ;
                }
                if(j == needle.length()-1){
                    return i;
                }
            }
        }
        
    }
    return -1;
}}