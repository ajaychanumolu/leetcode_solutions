class Solution {
    public boolean isAnagram(String s, String t) {
        int charcounts[] = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0 ; i < s.length() ; i++){
            charcounts[s.charAt(i) - 'a']++;
            charcounts[t.charAt(i) - 'a']--;
        }
        for(int i=0 ; i < charcounts.length ; i++){
        if(charcounts[i] != 0){
            return false;
        }} 
        return true;
    }
}